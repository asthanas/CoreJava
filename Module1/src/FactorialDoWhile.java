public class FactorialDoWhile {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int i = 1;
		
		do{
			fact = fact * i;
		i++;	
		}while(i <= 5);
		System.out.println("Factorial for " +num+ " is " +fact);
	}

}
