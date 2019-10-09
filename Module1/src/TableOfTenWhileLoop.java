public class TableOfTenWhileLoop {
	public static void main(String[] args) {
		int num = 10;
		int mul = 1;
		int i = 1;
		while ( i <= 10) {
			mul = num * i;
			System.out.println(num+ " x " +i+ " = " + mul);
			i++;
	    }
    }
}
