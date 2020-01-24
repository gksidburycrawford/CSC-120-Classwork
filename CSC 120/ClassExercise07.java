/** 
	Author:		Geterry
	Date: 		3-14-18
**/ 
import java.util.Scanner;
public class ClassExercise07 {
	public static void main (String[] args) {
	String[] monthOfTheYear = { "January",
								"Febuary",
								"March",
								"April",
								"May",
								"June",
								"July",
								"August",
								"September",
								"October",
								"November",
								"December",};
	Scanner input = new Scanner(System.in);
	System.out.print("Please input a number representing the Month of your choosing: ");
	int NumberOfMonth = input.nextInt();
	System.out.print("That is the month of " + monthOfTheYear[NumberOfMonth - 1]);
	}
}
	
							
