package com.array;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a= {{1,2,3},
			{1,2,3}
			};

int[][] b={{1,2,1},
		{1,2,1}
		};

int[][] c=new int[2][3];

for(int i=0;i<2;i++) {// here both array length are same
	for(int j=0;j<3;j++) {// so a.length,b.length didn't give
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}

	}

}
