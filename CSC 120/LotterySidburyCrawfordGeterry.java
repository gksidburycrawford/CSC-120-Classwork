/**
	Author: Geterry Sidbury-Crawford
	Date: 	02-28-18
	Subject:CSC 120
	Desc:	This is the Lottery Program for the CSC 120 Midterm.
*/

public class LotterySidburyCrawfordGeterry {
	public static void main(String[] args) {
	// These are the values used for the greenTicket method.
		CheckTicket();
	}

	/** The greenTicket method will display a value of either 0, 10, or 20
		depending of the values entered.
	*/
	public static int greenTicket(int a, int b, int c) {
		// Initialized the LotteryResult as 0
		int LotteryResult = 0;
		// If all 3 values are the same, then the LotteryResult will be 20.
		if (a == b && a == c && b == c) {
		LotteryResult = 20;
		// If 2 values are the same, then the LotteryResult will be 10.
		} else if (a == b || b == c) {
		LotteryResult = 10;
		// If all values are differnt, then the LotteryResult will be 0.
		} else {
		LotteryResult = 0;
		}		
		return LotteryResult;
	}
	public static void CheckTicket() {
		for (int counter =0; counter < 3; counter++) { //Runs 3 times
			int a = (int) (Math.random() * 5);
			int b = (int) (Math.random() * 5);
			int c = (int) (Math.random() * 5);
			System.out.println("The results of lottery " + (counter + 1) + " are " + greenTicket(a, b, c));
		} 
	}
}