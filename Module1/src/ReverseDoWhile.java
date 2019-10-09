
public class ReverseDoWhile {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		do{
			int mod = num % 10;
			rev = rev * 10 + mod;
			num = num /10;
		}while (num != 0);
		System.out.println("Reverse number is : " +rev);
	}

}
