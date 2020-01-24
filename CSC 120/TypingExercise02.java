/**
	Author: Geterry Sidbury-Crawford
	Date:	1-22-18
	Section:CSC 120
	Desc:	This is a typing exercise.
*/
import java.util.Scanner;
public class TypingExercise02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What's your name? ");
		String name = input.nextLine();
		System.out.println("Hi " + name + ", people call me a \"program\"!");
		
		final double PI = 3.14159;
		System.out.print("Enter a number ");
		double userInput = input.nextDouble () ;
		
		System.out.println(userInput + " / " + PI + " = " + (userInput / PI));
		System.out.println(userInput + " % " + PI + " = " + (userInput % PI));
		
		int roundDown = (int) PI; // Known as Casting
		System.out.println(PI + " can be rounded down to " + roundDown);
	}
}