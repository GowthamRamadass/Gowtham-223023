package basics;

public class Search {

	public static void main(String[] args) {
		
		int[] a = {1,7, 8, 9,4, 2};
		
		int v = 4, f=0;
		
		for(int i=0; i<6;i++)
		{
			if(v==a[i])
			{
				f=1;
				System.out.print("true");
				break;
			}
		}
		if(f==0)
		{
			System.out.print("false");
		}
		
	}

}
