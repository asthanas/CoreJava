
public class FibonacciDoLoop {

	public static void main(String[] args) {
		int a = 0,b = 1, c = 0,i = 1 ;
		System.out.println("Fibonacci for 10 number");
		do {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
			i++;
		}while(i <= 10);
	}

}
