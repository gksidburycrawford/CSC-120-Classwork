/** 
	Author: 	Geterry Sidbury Crawford
	Date:		01-12-18
	Section:	CSC 120
	Desc:		This is a typing exercise.
*/
import java.util.Scanner;
public class CalculatingCompoundInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Month = 1;
		System.out.print("Enter your initial Balance: ");
		double InitialBalance = input.nextDouble();
		System.out.print("Enter your interest rate: ");
		double Rate = input.nextDouble();
		while (Month <= 12) {
			double FinalBalance = InitialBalance + (InitialBalance * (Rate / 12));
			Month++;
		}
		System.out.println("Your balance after 12 months will be " + FinalBalance );	
	}
}
		
		