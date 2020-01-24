/** 
	Author:		Geterry Sidbury Crawford
	Date: 		4-9-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 
public class TypingExercise13 {
	public static void main(String[] args) {
		int expectedNum = 6;
		int timesRolled = 0;
		int numTrials = 100000;
		for (int i = 0; i < numTrials; i++) {
			int roll1 = rollDice();
			int roll2 = rollDice();
			if (roll1 == expectedNum && roll2 == expectedNum) {
				timesRolled++;
				
			}
		}
		
		double probability = 100.0 * timesRolled / numTrials;
		System.out.printf("The probability of rolling two %d's is %.2f%%\n", expectedNum, probability);
	}
	
	/**
		Returns a random number between 1 and 6 (inclusive)
	*/
	public static int rollDice() {
		int roll = (int)(Math.random() * 6) + 1;
		return roll;
	}
}
