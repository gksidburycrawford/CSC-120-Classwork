/**
	Author:	Geterry Sidbury Crawford
	Date:	01-29-18
	Section:CSC 120
	Desc:	This is a typing exercise.
*/
import java.util.Scanner;
public class PlayingCardsSidburyCrawfordGeterry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// This is the string for the first line of the text
		String intro = "Enter the card notation: ";
		System.out.print(intro);
		// User enters the notation, and the first Character is analized
		String card = input.nextLine();
		char cardNumber = card.charAt(0);
		char cardName = card.charAt(1);
		// Null value for strValue
		String strValue = " ";
		String strName = " ";
		// Switch case for strvalue
		switch (cardNumber) {
			case 'A': strValue = "Ace"; break;
			case '1': strValue = "Ten"; break;
			case '2': strValue = "Two"; break;
			case '3': strValue = "Three"; break;
			case '4': strValue = "Four"; break;
			case '5': strValue = "Five"; break;
			case '6': strValue = "Six"; break;
			case '7': strValue = "Seven"; break;
			case '8': strValue = "Eight"; break;
			case '9': strValue = "Nine"; break;
			case 'J': strValue = "Jack"; break;
			case 'Q': strValue = "Queen"; break;
			case 'K': strValue = "King"; break;
		}
		switch (cardName) {
			case 'D': strName = "Diamonds"; break;
			case 'H': strName = "Hearts"; break;
			case 'S': strName = "Spades"; break;
			case 'C': strName = "Clubs"; break;
		}
		System.out.println("Your card is " + strValue + " of " + strName);		
	}
}

		
		
		
		