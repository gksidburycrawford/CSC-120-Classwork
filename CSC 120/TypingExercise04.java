/**
	Author:	Geterry Sidbury Crawford
	Date:	01-29-18
	Section:CSC 120
	Desc:	This is a typing exercise.
*/
import java.util.Scanner;
public class TypingExercise04 {
	public static void main(String[] args) {
		// Create the 'steam' to receive user inputs
		Scanner input = new Scanner(System.in);
		
		//Prompt the user
		System.out.print("Enter a whole number: ");
		int number = input.nextInt();
		
		// Display some mathmatical calculations for the user's input
		System.out.println("The square root of " + number + " is " + Math.sqrt(number) );
		double powerOfTwo = Math.pow(number, 2);
		System.out.println(number + " raised to the power of two is " + powerOfTwo);
		
		int randomNum = (int)(Math.random() * 10) + 1;
		//Does randomNum, when divided by two, produce a remainder?
		if (randomNum % 2 == 0) {
			System.out.println(randomNum + " is even!");
		} else {
			System.out.println(randomNum + " is odd!");
		}
	}
}	
