public class ForAddDigit {
	public static void main(String args[] ) {
		int num = 222222;
		int sum;
		int mod = 0;
		
		for(sum=0; num!= 0 ; num /= 10) {
			mod = num % 10;
			sum = sum + mod;
		}
		System.out.println("Sum of Digit " +sum);
	}
}
