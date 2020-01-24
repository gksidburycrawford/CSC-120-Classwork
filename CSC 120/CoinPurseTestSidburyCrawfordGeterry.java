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
public class CoinPurseTestSidburyCrawfordGeterry{
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
		int numberOfPennys = 3;
		int numberOfQuarters = 3;
		int numberOfCoins = (numberOfPennys + numberOfQuarters);
		double quarterProbability = (numberOfQuarters/numberOfCoins);
		double pennyProbability = (numberOfPennys/numberOfCoins);
		int coinGrab = (int)(Math.random() * (100/(100*pennyProbability))) + 1;
		if (coinGrab == 1) {
			numberOfPennys = numberOfPennys - 1;
			coinGrab = 1;
		} else {
			numberOfQuarters = numberOfQuarters - 1;
			coinGrab = 2;
		}
		int coinGrab1 = coinGrab;
		coinGrab = (int)(Math.random() * (100/(100*pennyProbability))) + 1;
		if (coinGrab == 1) {
			numberOfPennys = numberOfPennys - 1;
			coinGrab = 1;
		} else {
			numberOfQuarters = numberOfQuarters - 1;
			coinGrab = 2;
		}
		int coinGrab2 = coinGrab;
		coinGrab = (int)(Math.random() * (100/(100*pennyProbability))) + 1;
		if (coinGrab == 1) {
			numberOfPennys = numberOfPennys - 1;
			coinGrab = 1;
		} else {
			numberOfQuarters = numberOfQuarters - 1;
			coinGrab = 2;
		}
		int coinGrab3 = coinGrab;
		if (coinGrab1 == pennyValue && coinGrab2 == pennyValue && coinGrab3 == pennyValue) {
			timesRolled++;
		} else if (coinGrab1 == quarterValue && coinGrab2 == quarterValue && coinGrab3 == quarterValue) {
			timesRolled++;
		}
	}
	double probability = 100 * timesRolled / numTrials;
	return probability;
	}
}