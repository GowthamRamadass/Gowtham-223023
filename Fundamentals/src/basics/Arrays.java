package basics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//int n = in.nextInt(); //n1=5
		int[][] a = {{1,2},{3,4}};
		
		int[][] b = {{5,6},{7,8}};
		
		int[][] m = new int[2][2];
		int sum=0;
		
		for(int i=0; i<2; i++)//i=1
		{
			for(int j=0; j<a[i].length; j++) //j=2
			{
				m[i][j] = 0; //m[0][1] = 0
				for(int k=0; k<a[i].length;k++)//2
				{
					m[i][j] += (a[i][k] * b[k][j]);//6 + (2*8) = 22
				}
			}	
		}
		
		
		for(int i=0; i<2; i++)//i=0
		{
			for(int j=0; j<a[i].length; j++) //j=1
			{
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
	protected void check()
	{
		System.out.println("work aguma illaya");
	}
}


