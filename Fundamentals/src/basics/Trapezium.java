package basics;

public class Trapezium {

	public static void main(String[] args) {
		int n=4, a=1, b=n*n+1;//17
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print("--");
			}
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print(a++);
					System.out.print("*");
			}
			for(int j=1; j<n-i+1; j++)
			{
				System.out.print(b++);
					System.out.print("*");
			}
			System.out.print(b++);
			b = b - ( 2 * (n-i))-1 ;
			System.out.println();
		}

	}

}
