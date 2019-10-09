public class FibonacciWhileLoop {
	public static void main(String[] args) {
		int a = 0,b = 1, c = 0,i = 1 ;
		System.out.println("Fibonacci for 10 number");
		while(i <= 10) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
			i++;
		}
	}
}