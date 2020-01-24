/** 
	Author: Geterry Sidbury-Crawford
	Date: 	3-12-18
	Section:CSC 120
	Desc: This is a program for measuring Squirrel Parties
*/
import java.util.Scanner;
public class SquirrelPartySidburyCrawfordGeterry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// User inputs number of cigards and the day
		System.out.print("Enter the Number of Cigars: ");
		int cigarCount = input.nextInt();
		System.out.print("What day is it?: ");
		int day = input.nextInt();
		// program uses conditional statements and "And" operators
		// to decide whether this is a party or not
		if (cigarCount >= 40 && day > 0) {
			System.out.print("Now THATS a squirrel party!");
		} else if (cigarCount >= 40 && cigarCount <= 70 && day < 1) {
			System.out.print("Now THATS a squirrel party!");
		} else {
				System.out.print("That aint no squirrel party!");
			}
		}
	}

		