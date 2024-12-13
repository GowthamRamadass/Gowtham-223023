package basics;

public class Fibnnoci {

	public static void main(String[] args) {
		int n = 13;
		
		int first = 0, second = 1, c=0;
		
		for(int i = 3; i<=n; i++)//5
		{
			c = first + second; //3
			first = second;//2
			second = c;//3
			System.out.println("first = "+ first + " second= " +second+ " c = "+c+" ");
		}
		

	}

}
