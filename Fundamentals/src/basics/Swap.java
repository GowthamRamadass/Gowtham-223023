package basics;

import java.util.Arrays;
public class Swap {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3,4 ,5, 6};
		
		for(int i=0; i<a.length -1; i+=2)
		{
			int t = a[i];
			a[i] = a[i+1];
			a[i+1] = t;
		}
		System.out.print(Arrays.toString(a));
	}

}
