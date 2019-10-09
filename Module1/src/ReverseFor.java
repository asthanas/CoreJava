public class ReverseFor {
	public static void main(String[] args) {
		int num = 12345;
		int temp = num;
		int rev;
		for (rev = 0;num != 0; num/=10){
		int mod = num % 10;
		rev = rev * 10 + mod;
	}
		System.out.print("Reverse of " +temp+ " is " +rev);
   }
}
