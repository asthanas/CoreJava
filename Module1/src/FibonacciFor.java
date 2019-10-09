public class FibonacciFor {
	public static void main(String[] args) {
		int i,a = 0,b = 1,c;
		System.out.println("Fibonacci Series for 10 numbers ");
		for(i = 1; i <= 10 ; ++i ) {
			System.out.print(a +" ");
		    c = a + b;
		    a = b;
		    b = c;
		}
	}

}
