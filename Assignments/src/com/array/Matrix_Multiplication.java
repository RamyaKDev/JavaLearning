package com.array;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {   //Initialize matrix a 
                {1, 3, 2},    
                {3, 1, 1},    
                {1, 2, 2}    
             };    
    
//Initialize matrix b    
		int b[][] = {    
                {2, 1, 1},    
               {1, 0, 1},    
               {1, 3, 1}    
           };  
		int row1=a.length;
		int col1=a[0].length;
		
		int row2=b.length;
		int col2=a[0].length;
		
		int[][] c=new int[row1][col1];
		
		if(col1!=row2)
			System.out.println("Matrix multiplication cannot do");
		else {
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<row2;k++) {
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		}
	}

}
