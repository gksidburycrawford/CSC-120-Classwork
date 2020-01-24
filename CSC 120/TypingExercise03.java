/**
	Author:	Geterry Sidbury Crawford
	Date:	01-29-18
	Section:CSC 120
	Desc:	This is a typing exercise.
*/
import java.util.Scanner;
public class TypingExercise03 {
	public static void main(String[] args) {
		boolean example = 3 > 10;
		System.out.println("This should say " + example);
		System.out.println("But we can say 5%2 == 1 should be " + ((5%2) == 1));
		/* Conditional Statements use logic expressions to make decisions.
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a whole number : ");
		int userInput = input.nextInt();
		if(userInput >= 10) {
			System.out.println("The user entered a number larger than 9!");
		} else {
			System.out.println("The user entered a number smaller than 10!");
		}
		// Finally, we can also use the switch statement
		System.out.print("Enter another whole number: ");
		userInput = input.nextInt(); // No need to say "int" this time
		switch (userInput) {
			case 1: System.out.print("One");
				break;
			case 2: System.out.print("Two");
			case 3: System.out.print("Three");
			case 4: System.out.print("Four");
				break;
			default:
					System.out.print("Unknown number!");
		}
	}
}