
public class TableOfTenDoWhile {

	public static void main(String[] args) {
		int num = 10;
		int mul = 1;
		int i = 1;
		do{
			mul = num * i;
			System.out.println(num+ " x " +i+ " = " + mul);
			i++;
	    }while ( i <= 10);
	}

}
