package basics;

import java.util.Scanner;
public class Prime {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//8
		int a = 0; 
		for(int j=2; j<=n; j++)
		{
			a=0;
			for(int i=2; i<j; i++)//2
			{
				if(j%i ==0)
				{
					a=1; // when j=4
					break;
				}
				//System.out.println("prime number");
			}
			if(a==0)
			{
				System.out.println("prime number " + j);
			}
			
		}
	}

}
