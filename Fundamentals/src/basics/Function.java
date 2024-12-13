package basics;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
	  
		Scanner in = new Scanner(System.in);
		
		String s = in.next(); 
		
		boolean p = palindrome(s);
		if(p)
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("not an palindrome");
		}		
	}
	static boolean palindrome(String s)
	{
		int l = s.length();
		for(int i=0; i<s.length()/2; i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1))
			{
				return false;
			}
		}
		return true;
	}
	
	static String binary(int n)
	{
		if(n<=0)
		{
			return "";
		}
		return binary(n/2) + n%2;
	}
	
	static int sum(int[] a, int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(a[n-1]%2 !=0)
		{
			return a[n-1] + sum(a, n-1);
		}
		return sum(a,n-1);
	}
	
	static int maxvalue(int[] a, int n)
	{ 
		if(n==0)
		{
			return 0;
		}
		return Math.max(a[n-1], maxvalue(a, n-1));  //{5, 2, 7,13, 1}
	}
	
	static boolean prime(int n, int a)
	{
		if(a==n)
		{
			return true;
		}
		else if(n%a == 0)
		{
			System.out.println(n + " is divisible by "+ a);
			return false;
		}
		return prime(n,a+1);
	}
	
	static int power(int n, int a)
	{
		if(a<=0)
		{
			return 1;
		}
		else
		{
			return n * power(n, a-1);
		}
	}
		
}
