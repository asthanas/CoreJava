public class Ques2ArithmaticOperator {

	public static void main(String[] args) {
		float maths = 98;
		float physics = 95;
		float chemistry = 95;
		float geography = 90;
		float socialScience = 88;
		int currentyear = 2019;
		double lastPercent = 88.5;
		float total;
		float avg;
		
		total = maths + physics + chemistry + geography + socialScience;
		
		avg = total / 5;
		
		double percent = (total / 500) * 100;
		
		float onlyScience = total - (geography + socialScience ); 
		
		double devivation = percent - lastPercent;
		
		System.out.println("--------Result--------");
		//Addition
		System.out.println("Total Marks obtained in 5 Subjects : " +total);
		//Division
		System.out.println("Average Marks obtained in 5 Subjects : " +avg);
		//Multiplication
		System.out.println("Percentage Marks obtained in 5 Subjects " +percent);
		//Subtraction
		System.out.println("Marks obtained in PCM Subjects : " +onlyScience);
		//Decrement
		System.out.println("Deviation from "+ --currentyear +" : " +devivation);
		//Increment
		System.out.println("Well done in " + ++currentyear + " Exams ");
		
	}

}
