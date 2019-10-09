public class DataTypeOperator {

	public static void main(String[] args) {
	
		//Date type assignment
		
		int a1 = 50;
		int a2 = -50;
		float b1 = 50.1234f;
		float b2 = -50.1234f;
		double c1 = 50.1234;
		double c2 = -50.1234;
		char d1 = 'A';
		char d2 = '5';
		char d3 = 65;
		boolean e = true;
		byte f = 123;
		short g = -12345;
		long h = 123487585L;
		String myString = "I am Saurabh";
		
		//Printing different Date types 
		
		System.out.println("-------Data Types------");
		System.out.println("Positive Integer value is : " +a1);
		System.out.println("Negative Integer value is : " +a2);
		System.out.println("Positive float value is : " +b1);
		System.out.println("Negative float value is : " +b2);
		System.out.println("Positive double value is : " +c1);
		System.out.println("Negative double value is : " +c2);
		System.out.println("Char value d1 : " +d1);
		System.out.println("Char value d2 : " +d2);
		System.out.println("Char value d3 : " +d3);
		System.out.println("Boolean value : " +e);
		System.out.println("Byte value : " +f);
		System.out.println("Short value : " +g);
		System.out.println("long value : " +h);
		System.out.println("String value :  " +myString);
		
		//Operators demo
		
		System.out.println("-------Arithmetic Operators------");
		
		System.out.println("Addition operators : " +(a1 + a2));
		System.out.println("Substation operators : " +(b1 - a1));
		double mul = c1 * c2;
		System.out.println("Multiplication operator "+c1+" & "+c2+" : " + mul);
		int div = a1/a2;
		System.out.println("Division operator "+a1+" & "+a2+" : " + div);		
		int mod = g % 2;
		System.out.println("Mod operator "+g+" : " + mod);
		
		
	}

}
