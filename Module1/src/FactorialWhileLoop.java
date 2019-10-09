public class FactorialWhileLoop {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int i = 1;
		
		while(i <= 5) {
			fact = fact * i;
		i++;	
		}
		System.out.println("Factorial for " +num+ " is " +fact);
	}

}
