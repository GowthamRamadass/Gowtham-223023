package basics;

public class Queue_array {

	public static void main(String[] args) {
		int n= 4, m= 3;
		int[] a = {2, 3,2 ,1};
		
		int sum= 0, bus=0;
		
		for(int i=0; i<n; i++)
		{
			if(sum+a[i]<=m)
			{
				sum += a[i];
			}
			else
			{
				sum = a[i];
				bus++;
			}
		}
		bus++;
		System.out.print(bus);	
	}

}
