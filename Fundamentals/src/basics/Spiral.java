package basics;

public class Spiral {

	public static void main(String[] args) {

		int a[][] = new int[4][4], x=1, n=4;
		
		for(int i=0; i<4; i++)//i=0
		{
			for(int j=0; j<a[i].length; j++) //j=1
			{
				a[i][j] = x++;
			}
		}
		
		
		/*
		 * for(int i=0; i<4; i++)//i=0 { for(int j=0; j<a[i].length; j++) //j=1 {
		 * System.out.print(a[i][j] +" "); } System.out.println(); }
		 */
		int first = 0, last= n-1, left=0, right=n-1;
		//          2         2        0         1
		while(first<=last)
		{
			for(int j=left; j<=right; j++)
			{
				System.out.print(a[first][j] + " ");//  1 2 3 4 // 6 7
			}
			first++; //2
			
			for(int j=first; j<=last; j++)
			{
				System.out.print(a[j][right] + " ");//8 12 16  // 11
			}
			right--;//1

			for(int j=right; j>=left; j--)
			{
				System.out.print(a[last][j] + " "); //15 14 13 // 10
			}
			last--;//1
			
			for(int j=last; j>=first; j--)
			{
				System.out.print(a[j][left] + " ");//9 5
			}
			left++;//0
		}

	}

}
