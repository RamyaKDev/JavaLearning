package com.patterns;

public class PatternPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//patternbox();
//patternO();
		//patternU();
		//patternL();
		//patternH();
		//patternI();
		//patternT();
		//patternN();
		//patternX();
		//patternZ();
		//pattern1Z1();
		//patternOX();
		//patternM();
		//patternW();
		//patternE();
		//patternF();
		//patternY();
		//patterntest();
		//patternP();
		//patternR();
		//patternK();
		//patternS();
		//patternA();
		patternQ();
		
	}

	private static void patternQ() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if((i==1 && j<=6) || (j==1 && i<=7) || (i==7 && j<=6) || (j==6 && i<=7) || (i-j==2 && i>=5) || i+j==16 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	private static void patternA() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(i==5 || (j==1 && i>=5) || (j==9 && i>=5) || i+j==6 || j-i==4  )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	private static void patternS() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if((j==1 && i<=5) || i==1 ||i==5 || i==9|| (j==9 && i>=5) )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	private static void patternK() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(i+j==6 || j==1 || i-j==4 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	private static void patternR() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if((i==1 && j<=5)|| j==1 || (i==5 && j<=5) || (j==5 && i<=5)||i-j==4 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	private static void patternP() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(i==1 || j==1 || i==5 || (j==9 && i<=5))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}
	

	private static void patterntest() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(i>=5 && j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	private static void patternY() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(  (i==j || i+j==10)&& i<=5) {
				System.out.print("* ");
				}else if( i>=5 && j==5) {
					System.out.print("* ");
				}
				
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternF() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( i==1 || j==1 || i==5) {
				System.out.print("* ");
				}
				
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternE() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( i==1 ||i==9 || j==1 || i==5) {
				System.out.print("* ");
				}
				
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternW() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( j==1 ||j==9 || (i==j || i+j==10)&& i>=5) {
				System.out.print("* ");
				}
				
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternM() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( j==1 ||j==9 || (i==j || i+j==10)&& i<=5) {
				System.out.print("* ");
				}
				
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternOX() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( (i+j==10) || i==j || j==1 ||j==9 ||i==1 ||i==9) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void pattern1Z1() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( (i+j==10) || i==j || j==1 ||j==9) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternZ() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( (i+j==10) || i==1 || i==9 ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternX() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( (i+j==10) || i==j ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternN() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( j==1 || j==9 || i==j ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternT() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( i==1 || j==5 ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternI() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( i==9 || i==1 || j==5 ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternH() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( j==9 || j==1 || i==5 ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternL() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( i==9 || j==1 ) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternU() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if( i==9 || j==1 || j==9) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternO() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(i==1 || i==9 || j==1 || j==9) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println("  ");
		}
	}

	private static void patternbox() {
		// TODO Auto-generated method stub
		for(int i=1; i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}

}
