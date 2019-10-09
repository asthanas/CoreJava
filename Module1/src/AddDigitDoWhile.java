
public class AddDigitDoWhile {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		do{
			int mod = num % 10;
			sum = sum + mod;
			num = num /10;
		}while (num != 0);
		System.out.println("Sum of Number is: " +sum);
	}

}
