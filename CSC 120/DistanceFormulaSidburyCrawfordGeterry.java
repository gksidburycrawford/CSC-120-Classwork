/**
	Author:	Geterry Sidbury Crawford
	Date:	2-7-18
	Section:CSC 120
	Desc:	This is a typing exercise.
*/
import java.util.Scanner;
public class DistanceFormulaSidburyCrawfordGeterry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declaration of first set of characters
		System.out.print("Please enter x1 ");
		double x1  = input.nextDouble();
		System.out.print("Please enter y1 ");
		double y1  = input.nextDouble();
		// Declaration of second set of characters
		System.out.print("Please enter x2 ");
		double x2  = input.nextDouble();
		System.out.print("Please enter y2 ");
		double y2  = input.nextDouble();
		// Code for equation
		double DistanceFormula = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		System.out.println("The Distance between these points is " + DistanceFormula);
	}
}