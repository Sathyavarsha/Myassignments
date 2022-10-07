package week1day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int a = 0;
		int b = 1;
		int c=0;
		System.out.println("Fibonacci Series of "+range+" numbers:");
	
		for(int i = 1; i<=range;++i) {
			System.out.println(a+" ");
			c = a+b;
			a = b;
			b = c;
		
		}
	}
	}

