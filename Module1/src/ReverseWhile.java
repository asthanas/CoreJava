public class ReverseWhile {
		public static void main(String[] args) {
			int num = 12345;
			int rev = 0;
			while (num != 0) {
				int mod = num % 10;
				rev = rev * 10 + mod;
				num = num /10;
			}
			System.out.println("Reverse number is : " +rev);
		}
}

