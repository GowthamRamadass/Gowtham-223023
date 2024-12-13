package basics;

import java.util.Scanner;

public class Strong_number {
	
	  public static void main(String args[])
	  {
	        Scanner in = new Scanner(System.in);
	        int x = in.nextInt(), sum=0; //145
	        int t = x;
	        while(x>0)//145>0  14>0
	        {
	          int n = x%10; //4
	          int a = 1;
	          
	          for(int i=1; i<=n; i++)
	          {
	            a *= i;
	          } 
	          sum += a;
	          x = x/10;//14
	        }
	    if(sum == t )
	    {
	      System.out.print("Yes");
	    }
	    else
	    {
	      System.out.print("No");
	    }
	  }
	
}
