/** 
	Author:		Geterry Sidbury Crawford
	Date: 		3-14-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 
import java.util.Scanner;
public class ROT13SidburyCrawfordGeterry {
	public static void main(String[] args) {
		System.out.println("Please input a message for the translator");
		Scanner input = new Scanner(System.in);
		String MessageUntranslated = input.next();
		System.out.println("The message translated is: " + rot13Translate(MessageUntranslated));
	}

	public static String rot13Translate(String MessageUntranslated) {
	// String array for the Lowercase and Uppercase letters.
		char[] translatorLowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
		'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
		' ', '?', '!', '-', ',', '.', ';', '$', '"', '(', ')', '_',};
		char[] translatorUppercase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
		'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
		' ', '?', '!', '-', ',', '.', ';', '$', '"', '(', ')', '_',};
		char[] translatorSpecial = {' ', '?', '!', '-', ',', '.', ';', '$', '"', '(', ')', '_',};
		
		String MessageTranslated = "";
	// A for loop and a if loop  is used to translate each character in the string given to us.
	// This will look at the character at the "i" number of the Message, translate it, then move
	// to the next letter.
		for (int i = 0; i < MessageUntranslated.length(); i++) {
			for (int j = 0;  j < 38; j++) {
				// This if statement is for lowercase letters.
				if (MessageUntranslated.charAt(i) == translatorLowerCase[j]) {
					if (j <= 12) {
						MessageTranslated = MessageTranslated + translatorLowerCase[j + 13];
						break;
					} else if ((j > 12) && (j <= 25)) {
						MessageTranslated = MessageTranslated + translatorLowerCase[j - 13];
						break;
					} else if (j > 25); {
						MessageTranslated = MessageTranslated + MessageUntranslated.charAt(i);
						break;
					}
				// This if statement is for Uppercase letters.
				} else if (MessageUntranslated.charAt(i) == translatorUppercase[j]) {
					if (j <= 12) {
						MessageTranslated = MessageTranslated + translatorUppercase[j + 13];
						break;
					} else if ((j > 12) && (j <= 25)) {
						MessageTranslated = MessageTranslated + translatorUppercase[j - 13];
						break;
					} else if (j > 25) {
						MessageTranslated = MessageTranslated + MessageUntranslated.charAt(i);
						break;
					}
				}
			}
		} 
		return MessageTranslated;
	}
}		

