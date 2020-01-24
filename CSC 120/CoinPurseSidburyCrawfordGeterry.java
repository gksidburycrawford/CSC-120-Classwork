/** 
	Author:		Geterry Sidbury Crawford
	Date: 		4-9-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 

/**
    Runs numTrials trials of a Monte Carlo simulation of drawing 
    3 coins out of a purse containing 3 pennies and 3 quarters. 
    Coins are not replaced once drawn.

    @param numTrials - the number of times the method will attempt to draw 3 coins
    @returns a double - the fraction of times 3 coins of the same type were drawn.
*/
import java.util.Scanner;
public class CoinPurseSidburyCrawfordGeterry{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please intput the number of trials you would like to run ");
	int numTrials = input.nextInt();
	System.out.println("The probability of grabbing 3 coins of the same value is " + coinPurseSimulation(numTrials) + "%");
	}

	public static double coinPurseSimulation(int numTrials) {
	int pennyValue = 1;
	int quarterValue = 2;
	int timesRolled = 0;
	for (int i = 0; i < numTrials; i++) {
		int coinGrab1 = grabCoin();
		int coinGrab2 = grabCoin();
		int coinGrab3 = grabCoin();
		if (coinGrab1 == pennyValue && coinGrab2 == pennyValue && coinGrab3 == pennyValue) {
			timesRolled++;
		} else if (coinGrab1 == quarterValue && coinGrab2 == quarterValue && coinGrab3 == quarterValue) {
			timesRolled++;
		}
	}
	double probability = 100 * timesRolled / numTrials;
	return probability;
	}


	public static int grabCoin() {
	int numberOfPennys = 3;
	int numberOfQuarters = 3;
	int numberOfCoins = numberOfPennys + numberOfQuarters;
	double quarterProbability = numberOfQuarters/numberOfCoins;
	double pennyProbability = numberOfPennys/numberOfCoins;
	int coinGrab = (int)(Math.random() * (6/numberOfPennys)) + 1;
	if (coinGrab == 1) {
		coinGrab = 1;
	} else {
		coinGrab = 2;
	}
	return coinGrab;
	}
}