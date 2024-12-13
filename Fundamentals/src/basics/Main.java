package basics;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int v = 724;
		int x = 2;
		int l = v%10; //4
		int f = v/100;//7
		int m = (v%100)/10;//24->2
		if(l%x==0)
		{
		System.out.println(l);
		}
		
		if(f%x==0)
		{
		System.out.println(f);
		}
		
		if(l%x==0)
		{
		System.out.println(m);
		}
	}
}
    