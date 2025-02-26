package com.array;

public class BubbleSorting {
	int list[]= {5,2,9,4,1};
    int len = list.length;
    
 
public void printList() {
	System.out.print("[ ");
	for(int i=0;i<list.length;i++) { System.out.print(list[i]+", "); }
	System.out.print(" ]\n");
}

public void selectionSort() {
	  int tmp;
      for(int i=0;i<len;i++) {
    	  for (int j=i+1;j<len;j++) {
    		  System.out.print("i -> "+i);
    		  System.out.print("j -> "+j);
    		  printList();
    		  if(list[i]>list[j]) {
    				tmp=list[i];
    				list[i]=list[j];
    				list[j]=tmp;  
    	      }	     
	      }
    	  System.out.println();
      }
}

public void bubbleSort() {
	  int tmp;
    for(int i=0;i<len;i++) {
  	  for (int j=i+1;j<len;j++) {
  		  System.out.print("i -> "+i);
  		  System.out.print("j -> "+j);
  		  printList();
  		  if(list[i]>list[j]) {
  				tmp=list[j];
  				list[j]=list[i];
  				list[i]=tmp;  
  	      }	     
	      }
  	  System.out.println();
    }
}
public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   BubbleSorting bs=new BubbleSorting();	
	   int len=bs.list.length;
	   System.out.print("Before Sorting  : ");		   
	   bs.printList();
	   System.out.println();	
	   bs.bubbleSort();
	   
	   System.out.print("After  Sorting  : ");
	   bs.printList();
}


}
