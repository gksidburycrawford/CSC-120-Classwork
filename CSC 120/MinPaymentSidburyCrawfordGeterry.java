/** 
	Author: 	Geterry Sidbury Crawford
	Date:		02-14-18
	Section:	CSC 120
	Desc:		This is a typing exercise.
*/
	import java.util.Scanner;
public class MinPaymentSidburyCrawfordGeterry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declaration of Variables 
		double Month = 0;
		double MonthlyPayment = 0;
		double MonthlyBalance = 0;
		double MonthlyUnpaidBalance = 1;
		double UpdatedBalance = 1;
		// Program Begins
		System.out.print("Enter your Balance: ");
		double InitialBalance = input.nextDouble();
		System.out.print("Enter your Annual Interest Rate: ");
		// Math Portion
		double annualInterestRate = input.nextDouble();
		double MonthlyInterestRate = annualInterestRate / 12.0;
		while (MonthlyUnpaidBalance > 0) {
			MonthlyUnpaidBalance = InitialBalance;
			MonthlyPayment += 10 ;
			for (Month = 0; Month < 12; Month++) {
			MonthlyUnpaidBalance -= MonthlyPayment;
			MonthlyUnpaidBalance = MonthlyUnpaidBalance + (MonthlyUnpaidBalance * MonthlyInterestRate);
			}
		}
		// End of the program, prints out the lowest payment
		System.out.println("Lowest Payment: " + MonthlyPayment);
	}
}