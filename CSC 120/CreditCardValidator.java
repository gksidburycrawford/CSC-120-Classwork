/** 
	Author:		Geterry Sidbury Crawford
	Date: 		3-12-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 
import java.util.Scanner;
public class CreditCardValidator {
	public static void main (String[] args) {
		/**
	Main Method
	*/
		String card = "4847352989263094";

		// When you are finished writing the methods below,
		// uncomment the three lines below to test.
		// Scanner input = new Scanner(System.in);
		// System.out.print("Enter a Credit Card Number: ");
		// String card = input.nextLine();

		// Should say "Visa"
		System.out.print("getCompany: " + getCompany(card));
		// Should say "5"
		System.out.print("getDigit: " + getDigit(5)); 
		// Should say "7"
		System.out.print("getDigit: " + getDigit(16)); 
		// Should say "52"
		System.out.print("sumOfDoubleEvenPlace: " + sumOfDoubleEvenPlace(card)); 
		// Should say "48"
		System.out.print("sumOfOddPlace: " + sumOfOddPlace(card)); 
		// Should say "true"
		System.out.print("isValid: " + isValid(card)); 

		if ( isValid(card) ) {
			// If True, display the company and state it is valid
		} else {
			// If False, state the card number is invalid
		}
	}
	
	// Problem 1 ==================================================================
	/** 
		Return the company of the card by looking at the character
		at the zero (0) index of number.

		@param number: A 13 to 16 digit String of numbers

		@returns a String that is either 
		"Visa", "Master Card", "American Express", or "Discover Card"
	*/
	public static String getCompany(String number){
		String CreditCardCompany = "";
		if (Character.getNumericValue(number.charAt(0)) == 4 ) {
			CreditCardCompany = "Visa";
		} else if (Character.getNumericValue(number.charAt(0)) == 5) {
			CreditCardCompany = "Master Card";
		} else if (Character.getNumericValue(number.charAt(0)) == 3 && Character.getNumericValue(number.charAt(1)) == 7) {
			CreditCardCompany = "American Express";
		} else if (Character.getNumericValue(number.charAt(0)) == 6) {
			CreditCardCompany = "Discover Card";
		}
		return CreditCardCompany;
	}
	
	// Problem 2 ==================================================================
	/** 
		Return this number if it is a single digit, otherwise, return the sum 
		of the two digits. For example, 18 will return 9 (because 1 + 8).

		@param number: a digit that will be between 0 and 18

		@returns an integer
	*/
	public static int getDigit(int number){
		if (number < 10) {
			number = number;
		} else {
			number = number.charAt(0) + number.charAt(1);
		}
		return number;
	}
	
	// Problem 3 ==================================================================
	/** 
		Double every second digit from *right to left*. 

		If doubling of a digit results in a two-digit number, add the two digits
		together to get a single digit number using the getDigit(...) method.

		Use a *loop* to cycle through all the numbers of the String.
		Note: You will need to *convert a char to an int*

		@param number: A 13 to 16 digit String of numbers

		@returns an integer
	*/
	public static int sumOfDoubleEvenPlace(String number){
		int decrement = 0;
		int sum = 0 ;
		for (i = 0; i < number.length(); i++) {	
			int convertedNumber = Character.getNumericValue(number.charAt(number.length() - decrement));
			int Value = getDigit(convertedNumber);
			sum = sum + Value;
			decrement = decrement + 2;
		}
		return sum;
	}
	
	// Problem 4 ==================================================================
	/** 
		Return sum of odd-place digits in number

		Use a *loop* to cycle through all the numbers of the String.
		Note: You will need to *convert a char to an int*

		@param number: A 13 to 16 digit String of numbers

		@returns an integer
	*/
	public static int sumOfOddPlace(String number){
		int decrement = 1;
		int sum = 0;
		for (i = 0; i < number.length(); i++) {	
			int convertedNumber = Character.getNumericValue(number.charAt(number.length() - decrement));
			int Value = getDigit(convertedNumber);
			sum = sum + Value;
			decrement = decrement + 2;
		}
		return sum;
	}
	
	// Problem 5 ==================================================================
	/** 
		Returns true if the card number is valid 

		To determine if a card is valid, the sum of the Double Even Place
		Numbers and the Sum of the Odd Place Numbers must be divisible by
		ten (10) (use modulus to determine if the number is divisible), 
		the String must be 13 to 16 digits, *and* the String must start
		with "4", "5", "37", or "6".

		@param number: A 13 to 16 digit String of numbers

		@returns true if the String is a valid card, False otherwise
	*/
	public static boolean isValid(String number){
		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number) % 10 == 0)) {
			isValid = true;
		} else {
			isValid = false;
		}
		return isValid;
	}
}
	
