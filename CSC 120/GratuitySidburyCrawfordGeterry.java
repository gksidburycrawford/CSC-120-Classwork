/** 
	Author: Geterry Sidbury-Crawford
	Date: 	3-12-18
	Section:CSC 120
	Desc:	This is a Gratuity calculation program.
*/
import java.util.Scanner;
public class GratuitySidburyCrawfordGeterry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Program asks for the Subtotal and Gratuity rates.
		System.out.println("Enter Your Subtotal: ");
		double subtotal = input.nextDouble();
		System.out.println("Enter Your % Gratuity as a decimal: ");
		double gratuityRate = input.nextDouble();
		// The program calculates the Gratuity and the Total using the above user inputs.
		double gratuity = subtotal * gratuityRate;
		double total = subtotal + gratuity;
		// Both the gratutiy and the total are printed out.
		System.out.println("The Gratuity is $" + gratuity + " and the total is $" + total);
	}
}