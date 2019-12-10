package completed;
import java.util.Scanner; 

public class Grades {
	public static void main (String args []) {
	
		Scanner GLaDOS = new Scanner (System.in);
		System.out.println("Welcome to the Student Average Calculator");
		System.out.println("Enter your Homework Average: ");
		double homework = GLaDOS.nextDouble();
		System.out.println("Enter your Quiz Average: ");
		double quiz = GLaDOS.nextDouble();
		System.out.println("Enter your Test Average: ");
		double test = GLaDOS.nextDouble();
		System.out.println("HERES YOUR BREAKDOWN");
		System.out.println("Homework Average: ");
		System.out.println(Math.round(homework));
	}
}