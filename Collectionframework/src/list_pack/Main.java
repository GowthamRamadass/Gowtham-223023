package list_pack;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		Tree x = new Tree();	
		for(int i=1; i<=9; i++)
		{
			x.insert(i);
		}
		
		System.out.println(x.root.data);
		System.out.println(x.root.left.data);
		System.out.println(x.root.right.data);
		System.out.println(x.root.left.left.data);
		System.out.println(x.root.left.right.data);
//		Scanner in = new Scanner(System.in);
//		  Stack n = new Stack();
//		  n.push(in.nextInt());
//		  n.push(7);
//		  n.push(34);
//		  n.push(21);
//		  System.out.println(n.pop());
//		  System.out.println(n.pop());
//		  System.out.println("the top most value is "+n.peek());
//		  System.out.println(n.pop());
//		  System.out.println("the top most value is "+n.peek());
//		  System.out.println(n.pop());
//		  System.out.println(n.isempty());
	}
}
