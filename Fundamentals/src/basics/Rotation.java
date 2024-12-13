package basics;

public class Rotation {
	public static void main(String[] args) {

		int n=3, a[][] = new int[n][n], x=1;
		
		for(int i=0; i<n; i++)//i=0
		{
			for(int j=0; j<a[i].length; j++) //j=1
			{
				a[i][j] = x++;
			}
		}
		
//		for(int i=0; i<n; i++)//i=0
//		{
//			for(int j=i+1;j<n ;j++) //j=1
//			{
//				int t = a[i][j];
//				a[i][j]= a[j][i];
//				a[j][i] = t;
//			}
//		}
//		
//		for(int i=0; i<n; i++)//i=0
//		{
//			for(int j=0;j<n/2 ;j++) //j=1
//			{
//				int t = a[i][j];
//				a[i][j]= a[i][n-1-j];
//				a[i][n-1-j] = t;
//			}
//		}
		
		for(int j=n-1; j>=0; j--)//i=0
		{
			for(int i=0; i<n; i++) //j=1
			{
				System.out.print(a[i][j] + " "); 
			}
			System.out.println();
		}
		
	}
}
