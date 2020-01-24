/** 
	Author: 	Geterry Sidbury Crawford
	Date:		01-12-18
	Section:	CSC 120
	Desc:		This is a typing exercise.
*/
import java.util.Scanner;
public class TypingExercise05 {
	public static void main(String[] args) {
		// Create the 'stream' to receive user inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a starting point (1 - 80): ");
		int point = input.nextInt();
		// int point = 1;
		final int TOTALSTEPS = 1000;
		boolean moveRight = true;
		
		for(int step = 0; step < TOTALSTEPS; step++) {
			if (point == 80) {
				moveRight = false;
			} else if (point == 0) {
				moveRight = true;
			}
			
			for (int space = 0; space < point-1; space++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			if (moveRight) {
				point++;
			} else {
				point--;
			}
		}

	}
}
