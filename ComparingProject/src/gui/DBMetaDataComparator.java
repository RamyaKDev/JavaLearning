package gui;
import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import exl.Write;
import exp.FilePathException;
import java.sql.*;
import java.sql.DriverManager;

public class DBMetaDataComparator {
	public Connection srcCon  ;
	public Connection desCon  ;
	
	public String srcDBName   ;
	public String srcDBSchema ;
	public String srcDBDriver ;
	public String srcDBURL;
	public String srcUserLogin ;
	public String srcPwd;
	
	public String desDBSchema ;
	public String desDBName   ;
	public String desDBDriver ;
	public String desDBURL;
	public String desUserLogin ;
	public String desPwd;
	
	public String resultFilePath ;
   
   	private Boolean dbSwap=false , tabSwap=false;
	private Write xls ; 
	private WritableWorkbook xlsBook=null;  
	private int[] noOfTables = new int[7];
	
   	
   
	public DBMetaDataComparator() {

	}
    				
	public Connection setupSourceDBConnection() throws Exception {			
			Class.forName(srcDBDriver);
			return DriverManager.getConnection(srcDBURL,srcUserLogin,srcPwd);
			
    }

	public Connection setupDestinationDBConnection() throws Exception {			
		Class.forName(desDBDriver);
		return DriverManager.getConnection(desDBURL,desUserLogin,desPwd);
		
	}
	
	public Boolean setResultFileAndPath(String fileName, String path ,String[] shName)throws Exception , FilePathException {
			xls = new Write();
			xls.path= xls.setFilePath(fileName,path);	
			resultFilePath=xls.path;
			xlsBook = xls.createExcelWorkBook(shName);
			
			if(xlsBook==null || xls==null) 
            	 throw new FilePathException("Excel Work Book Creation Exception On Destination Path ");
			
			return true;
		
	}
	
	public void compareSrcDbVsDesDb(String srcDBName , Connection srcCon, String srcSchema,String desDBName, Connection desCon, String desSchema,JProgressBar pb) throws Exception {
						
		 	System.out.println(srcDBName + " DataBase Vs "+desDBName + " Comparision Started !....");
			  
			try {
										    	
		    	// 1. Getting All Tables Name In The Current DataBase 
		    	String[] types = {"TABLE"};	
		    	noOfTables[0]     	=  getNoOfDBTables(srcCon.getMetaData().getTables(null, null, "%", types));
		    	noOfTables[1]    	=  getNoOfDBTables(desCon.getMetaData().getTables(null, null, "%", types));
		    							    							    	
		    	// To improve performance small DB is compared against large DB 
		    	if(noOfTables[0]>noOfTables[1]){
		    	   dbSwap=true;
		    	}		    		
		    	
		    	pb.setValue(10);
		    	if(dbSwap){
		    		  compareSmallDbVSBigDb(desCon,desSchema,srcCon,srcSchema);						    		
		    	}else {
		    		  compareSmallDbVSBigDb(srcCon,srcSchema,desCon,desSchema);						    		
		    	}
		    	pb.setValue(50);
		    	writeAnalysisReportExcelSheet(xlsBook,noOfTables);
		    	pb.setValue(80);
		    	System.out.println("The Source "+srcDBName + " DataBase Is Compared With  "+desDBName + " DataBase Successfully !....");
		    	
		     	}catch(Exception e){
		     		e.printStackTrace();
		     	}finally{
		     			xlsBook.write();
		     			xlsBook.close();
		     			srcCon.close();
		     			desCon.close();
		     	}

		}
			
	public void compareSmallDbVSBigDb(Connection curCon , String curSchema, Connection tarCon , String tarSchema)throws Exception {
		
			DatabaseMetaData curMD = curCon.getMetaData();
			DatabaseMetaData tarMD = tarCon.getMetaData();
			
			// 1. Getting All Tables Name In The Current DataBase 
			String[] types = {"TABLE"};
			ResultSet curRSet = curMD.getTables(null, null, "%", types);
			

			ArrayList<String> commonTabsList = new ArrayList<String>();
			int noOfCommonTables=0;
			int onlyCurDBTables=0;
			int eqTabNo=1;
			int nEqTabNo=1;
			boolean isEqual = false;
			noOfTables[5]=1;
			noOfTables[6]=1;
			
			while (curRSet.next()) {						    		
	    		   if( curRSet.getString(2).equalsIgnoreCase(curSchema)){		    			 
		    	       String tabName    = curRSet.getString(3);
		    	       
		    	       ResultSet tarRSet =tarMD.getTables(null, null, "%", types);
		    	       ResultSet rs        = isSrcTableExistInTargetDB(tabName,tarRSet,tarSchema);
		    	       
		    	       if(rs!=null){   // 1. Table Exists In Both DataBases
		    	    	   tabSwap=false; 
		    	    	  commonTabsList.add(tabName);					    	    	  						              
		    	    	  
		    	    	  String sqlQry = "SELECT * FROM "+tabName;
		    	    	  
			    	      // Small (Cur) DB & Table Meta Data
			    	    	  
				             Statement curSt = curCon.createStatement();	
				             ResultSet curRS = curSt.executeQuery(sqlQry);
				             ResultSetMetaData curMetaData = curRS.getMetaData();				    		
				            
				            
				    	   // Big (tar) DB & Table Meta Data
				              Statement tarSt = tarCon.createStatement();								
				              ResultSet tarRS = tarSt.executeQuery(sqlQry);
				              ResultSetMetaData tarMetaData = tarRS.getMetaData();							              
				          	
				              
		    	    	  if(curMetaData.getColumnCount()>tarMetaData.getColumnCount()){
		    	    		tabSwap=true;
					      }		    	
		
					    	
					      if(tabSwap){
					    	  //isEqual=writeExistInBothDBsExcelSheet(xlsBook,tabName,tarMetaData,curMetaData,eqTabNo,nEqTabNo);
					    	  writeExistInBothDBsExcelSheet(xlsBook,tabName,tarMetaData,curMetaData);
					      }else {
					    	  //isEqual=writeExistInBothDBsExcelSheet(xlsBook,tabName,curMetaData,tarMetaData,eqTabNo,nEqTabNo);
					    	  writeExistInBothDBsExcelSheet(xlsBook,tabName,curMetaData,tarMetaData);
					      }						    	    		  
		    	    	  if(isEqual){
		    	    		  		 eqTabNo++;
		    	    	  }else{
		    	    		   nEqTabNo++;  
		    	    	  }
		    	    	  noOfCommonTables++;
		    	    	  
		    	       }else{		
							writeOnlyInSrcORDesDBExcelSheets(xlsBook,curCon, tabName,onlyCurDBTables,1);
		    	    	   	onlyCurDBTables++; 
		    	       }
		    	       
				    
	    		   }
	    	}	

            
			if(dbSwap){
	    	   noOfTables[2]=writeRestOfBiggestDBTables(curCon, curSchema ,commonTabsList );
	    	   noOfTables[3]=onlyCurDBTables;					    	   
	    	}else {
	    		  noOfTables[2]=onlyCurDBTables;
	    		  noOfTables[3]=writeRestOfBiggestDBTables(tarCon, tarSchema ,commonTabsList );
	    	}
			noOfTables[4]=noOfCommonTables;
			noOfTables[5]=eqTabNo;
			noOfTables[6]=nEqTabNo;
		                
		
		
	}
		
	public ResultSet isSrcTableExistInTargetDB(String srcTabName, ResultSet tarDBMetaRs , String schema) throws Exception {
		    ResultSet rs=null;
			try{
				while (tarDBMetaRs.next()) {
					  if( tarDBMetaRs.getString(2).equalsIgnoreCase(schema) && tarDBMetaRs.getString(3).equalsIgnoreCase(srcTabName)){							 
						  rs=tarDBMetaRs;
					      break;
					  }  
			    }
			   return rs;
    		   }catch(Exception e){
    			      e.printStackTrace();
    			      return null;
    		   } 
		
	}
	
	public int getNoOfDBTables(ResultSet rs)throws Exception{				
			int tabCount = 0;
			while(rs.next()) {
				tabCount++;
			}		
			return tabCount;			
	}
				
	public int writeOnlyInSrcORDesDBExcelSheets(WritableWorkbook book,Connection con,String  tabName,int tabNo,int sheetNo)throws Exception{
            Statement st = con.createStatement(); 
            WritableSheet onlyInDB1Sheet = book.getSheet(sheetNo);
            int curSheetRowNo = onlyInDB1Sheet.getRows();
            
	    	String sqlQry1 = "SELECT * FROM "+tabName;
    		ResultSet rs = st.executeQuery(sqlQry1);
    		ResultSetMetaData metaData = rs.getMetaData();				    		
    		int rowCount = metaData.getColumnCount();
    		
    		xls.addNumber(onlyInDB1Sheet,1,curSheetRowNo+1,tabNo+1);
    		xls.addLabel(onlyInDB1Sheet,2,curSheetRowNo+1,tabName.toUpperCase());
    		curSheetRowNo=curSheetRowNo+1;
    		
    		for (int i = 0; i < rowCount; i++) {
    			
				xls.addNumber(onlyInDB1Sheet,3,i+curSheetRowNo+1,i+1);								
				xls.addLabel(onlyInDB1Sheet,4,i+curSheetRowNo+1,metaData.getColumnName(i + 1).toUpperCase());
				xls.addLabel(onlyInDB1Sheet,5,i+curSheetRowNo+1,metaData.getColumnTypeName(i + 1).toUpperCase());								
				xls.addNumber(onlyInDB1Sheet,6,i+curSheetRowNo+1,metaData.getColumnDisplaySize(i + 1));
    			}
	       return tabNo+1;
	
	
	}	
	
    public int writeRestOfBiggestDBTables(Connection tarCon, String schema , ArrayList<String> comTabList ) throws Exception {
		    int onlyDesDBTables=0;
		    String[] types = {"TABLE"};
		    ResultSet tarRs= tarCon.getMetaData().getTables(null, null, "%", types);
		    try{			    	
		    	while (tarRs.next()) {					   
				  if( tarRs.getString(2).equalsIgnoreCase(schema) && !comTabList.contains(tarRs.getString(3))){
					  writeOnlyInSrcORDesDBExcelSheets(xlsBook,tarCon, tarRs.getString(3),onlyDesDBTables,2);
		    	      onlyDesDBTables++;
					  }
					 	 
				  }
		    	return onlyDesDBTables;
		   }catch(Exception e){
			   	  e.printStackTrace();
			      return -1;
		   } 
		  
     }
	
	public  void writeAnalysisReportExcelSheet (WritableWorkbook book,int noOftabs[])throws RowsExceededException, WriteException, IOException {
			WritableSheet analysisReportSheet = book.getSheet(0);	
			
			xls.addNumber(analysisReportSheet,1,5,1);
			xls.addLabel(analysisReportSheet,2,5," Total No Of Tables In Source DataBase  ");
			xls.addNumber(analysisReportSheet,3,5,noOftabs[0]);
			
			xls.addNumber(analysisReportSheet,1,6,2);
			xls.addLabel(analysisReportSheet,2,6," Total No Of Tables In Destination DataBase  ");
			xls.addNumber(analysisReportSheet,3,6,noOftabs[1]);						
			
			xls.addNumber(analysisReportSheet,1,8,3);
			xls.addLabel(analysisReportSheet,2,8," No Of Tables Only In Source  DataBase  ");
			xls.addNumber(analysisReportSheet,3,8,noOftabs[2]);
			
			xls.addNumber(analysisReportSheet,1,9,4);
			xls.addLabel(analysisReportSheet,2,9," No Of New Tables In Destination  DataBase  ");
			xls.addNumber(analysisReportSheet,3,9,noOftabs[3]);
			
			xls.addNumber(analysisReportSheet,1,11,5);
			xls.addLabel(analysisReportSheet,2,11," No Of  Tables Exists In Both Source & Destination DataBase  ");
			xls.addNumber(analysisReportSheet,3,11,noOftabs[4]);						
						
							
	}
			
    public  boolean writeExistInBothDBsExcelSheet(WritableWorkbook book,String tabName, ResultSetMetaData curMetaData,ResultSetMetaData tarMetaData)throws Exception{				              
			    		
           // Both Matched Sheet Detail 
              WritableSheet bothMatchSheet = book.getSheet(3);
              int curMatchSheetRowNo       = bothMatchSheet.getRows();
            
           // Both Matched Sheet Detail
              WritableSheet bothMisMatchSheet = book.getSheet(4);
              int curMisMatchSheetRowNo = bothMisMatchSheet.getRows();
            
	    	  boolean eqTabAdded =false, nEqTabAdded=false;		
	    	  boolean isColFound = false , isColEqual = false ,isTabEqual=true;
    		 
	    	  int totNoOfCurFields = curMetaData.getColumnCount();
	    	  int totNoOfDesFields = tarMetaData.getColumnCount();
	    	  
	    	  String curColName,curColType,tarColName="",tarColType="";
	    	  int curColSize,tarColSize=0;
	    	  int i,j,diffAt =0;
	    	  ArrayList<Integer> commonFiledsIndex = new ArrayList<Integer>(); 
    		
	    	  for (i = 0; i < totNoOfCurFields; i++) {
	    		  diffAt=0;
	    		  isColFound = false;
	    		  isColEqual=false;
	    		  
	    		  curColName = curMetaData.getColumnName(i + 1).trim();
	    		  curColType = curMetaData.getColumnTypeName(i + 1).trim();
	    		  curColSize = curMetaData.getColumnDisplaySize(i + 1);
	    		  
	    		  for(j=0; j< totNoOfDesFields ; j++){	
	    			  
	    			  tarColName = tarMetaData.getColumnName(j + 1).trim();
			    	  tarColType = tarMetaData.getColumnTypeName(j + 1).trim();
			    	  tarColSize = tarMetaData.getColumnDisplaySize(j + 1); 
			    	  
	    			  if(curColName.equalsIgnoreCase(tarMetaData.getColumnName(j + 1).trim())){
                         isColFound = true;
		    			 if((curColType).equalsIgnoreCase(tarMetaData.getColumnTypeName(j + 1).trim())){
		    				  if(curColSize==tarMetaData.getColumnDisplaySize(j + 1)){
		    					  isColEqual=true;
		    					  commonFiledsIndex.add(j+1);
			    			  }else{
				    			  diffAt=2;
				    		  }
		    			  }else{
			    			  diffAt=1;
			    		  }
		    		  break;
		    		  }
	    			  
	    		  }
	    		  
	    		  if(isColEqual){   // 1] Matched Fields Sheet
	    			 if(!eqTabAdded) {
	    			   xls.addNumber(bothMatchSheet,1,curMatchSheetRowNo+1,noOfTables[5]);
				       xls.addLabel(bothMatchSheet,2,curMatchSheetRowNo+1,tabName.toUpperCase());
				       curMatchSheetRowNo=curMatchSheetRowNo+1;
				       eqTabAdded=true;
				       noOfTables[5]+=1;
	    			 }
	    			 
	    			 xls.addNumber(bothMatchSheet,3,i+curMatchSheetRowNo+1,i+1);								
					 xls.addLabel(bothMatchSheet,4,i+curMatchSheetRowNo+1,curColName.toUpperCase());
					 xls.addLabel(bothMatchSheet,5,i+curMatchSheetRowNo+1,curColType.toUpperCase());								
					 xls.addNumber(bothMatchSheet,6,i+curMatchSheetRowNo+1,curColSize);									
	    			  
	    		  }else{         // 1] Un Matched Fields Sheet
	    			   isTabEqual=false;
	    			   if(!nEqTabAdded) {
		    			   xls.addNumber(bothMisMatchSheet,1,curMisMatchSheetRowNo+1,noOfTables[6]);
					       xls.addLabel(bothMisMatchSheet,2,curMisMatchSheetRowNo+1,tabName.toUpperCase());
					       curMisMatchSheetRowNo=curMisMatchSheetRowNo+1;
					       nEqTabAdded=true;
					       noOfTables[6]+=1;
		    			 }
	    			   
	    			   if(!isColFound ){
	    				   
		    			 xls.addNumber(bothMisMatchSheet,3,curMisMatchSheetRowNo+1,i+1);								
						 xls.addLabel(bothMisMatchSheet,4,curMisMatchSheetRowNo+1,curColName.toUpperCase());
						 xls.addLabel(bothMisMatchSheet,5,curMisMatchSheetRowNo+1,curColType.toUpperCase());								
						 xls.addNumber(bothMisMatchSheet,6,curMisMatchSheetRowNo+1,curColSize);
						 xls.addDropLabel(bothMisMatchSheet,7,curMisMatchSheetRowNo+1,"Dropped");
						 curMisMatchSheetRowNo=curMisMatchSheetRowNo+1;
	    			   }else {
	    				     if(diffAt>0){
	    				    	xls.addNumber(bothMisMatchSheet,3,curMisMatchSheetRowNo+1,i+1);								
	    				    	xls.addLabel(bothMisMatchSheet,4,curMisMatchSheetRowNo+1,curColName.toUpperCase());
	    				    	xls.addLabel(bothMisMatchSheet,5,curMisMatchSheetRowNo+1,curColType.toUpperCase());								
	    				    	xls.addNumber(bothMisMatchSheet,6,curMisMatchSheetRowNo+1,curColSize);
	    				    	xls.addChangeLabel(bothMisMatchSheet,7,curMisMatchSheetRowNo+1,"Changed To");
						 
	    				    	xls.addNumber(bothMisMatchSheet,8,curMisMatchSheetRowNo+1,i+1);								
	    				    	xls.addLabel(bothMisMatchSheet,9,curMisMatchSheetRowNo+1,tarColName.toUpperCase());
	    				    	xls.addLabel(bothMisMatchSheet,10,curMisMatchSheetRowNo+1,tarColType.toUpperCase());								
	    				    	xls.addNumber(bothMisMatchSheet,11,curMisMatchSheetRowNo+1,tarColSize);
	    				    	
	    				    	curMisMatchSheetRowNo=curMisMatchSheetRowNo+1;
	    		            }
	    			   }	     
    			}
	    		  
	    	  }
	    	  // Adding the New Fields Of Target Table 
	    	  for(j=1; j< totNoOfDesFields ; j++){					   
				  if( ! commonFiledsIndex.contains(j)){									  
					  tarColName = tarMetaData.getColumnName(j).trim();
			    	  tarColType = tarMetaData.getColumnTypeName(j).trim();
			    	  tarColSize = tarMetaData.getColumnDisplaySize(j); 
			    	  
					  xls.addNumber(bothMisMatchSheet,8,curMisMatchSheetRowNo+1,j);								
				      xls.addLabel(bothMisMatchSheet,9,curMisMatchSheetRowNo+1,tarColName.toUpperCase());
				      xls.addLabel(bothMisMatchSheet,10,curMisMatchSheetRowNo+1,tarColType.toUpperCase());								
				      xls.addNumber(bothMisMatchSheet,11,curMisMatchSheetRowNo+1,tarColSize);
				      xls.addNewLabel(bothMisMatchSheet,12,curMisMatchSheetRowNo+1,"New Field");	
				      curMisMatchSheetRowNo=curMisMatchSheetRowNo+1;
		    	      
					  }
					 	 
				  }
	    	  
	    	  
	       return isTabEqual;

    }	
	

}


