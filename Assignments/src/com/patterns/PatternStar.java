package com.patterns;

public class PatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern1();
		//patternreverse();
		//patternstar1();
		//patternstar2();
		//patternstar3();
		//patternstar4();
		//patternstar5();
		//patternstar6();
		patternstar7();

}
	

	private static void patternstar7() {
		for(int row=1;row<=5;row++) {
			for(int space=1;space<=5-row;space++) {
				System.out.print(" ");
			}
			for(int num=1;num<=row;num++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
		
	}


	private static void patternstar6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int space=1;space<=row;space++) {
				System.out.print("");
			}
			for(int num=1; num<=6-row;num++) {
//				System.out.print(1+" ");
//				System.out.print(num+" ");
//				System.out.print(row+" ");
				System.out.print(row*5+" ");
			}
			System.out.println(" ");
		}
	}


	private static void patternstar5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int space=1;space<=row;space++) {
				System.out.print("  ");
			}
			for(int num=1; num<=6-row;num++) {
				System.out.print(1+" ");
			}
			System.out.println(" ");
		}
	}


	private static void patternstar4() {
		// TODO Auto-generated method stub
		  for(int row=1;row<=5;row++) {
			  for(int space=1;space<=5-row;space++) {
				  System.out.print(" ");
			  }
			  for(int num=1; num<=row;num++) {
//				  System.out.print(num+" ");
//				  System.out.print(row+" ");
				  System.out.print(row*num+" ");
			  }
			  System.out.println(" "); 
		  }
	}


	private static void patternstar3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int space=1;space<=5-row;space++) {
				System.out.print(" ");
			}
				for(int num=1;num<=row;num++) {
					System.out.print("1 ");
				}
			
			System.out.println(" ");
		}
	}


	private static void patternstar2() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}


	private static void patternstar1() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) 
			{
				System.out.print("1 ");
			}
			System.out.println(" ");
		}
	}


	private static void patternreverse() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
//			for(int j=5;j>=i;j--) 
			for(int j=1;j<=6-i;j++){
				System.out.print("1 ");
			}
			System.out.println(" ");
		}
	}


	private static void pattern1() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int k=1;k<=5;k++) {
			System.out.print(1);
			}
			System.out.println(" ");
	}
	}
}
