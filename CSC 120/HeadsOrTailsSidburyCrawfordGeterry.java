/** 
	Author: 	Geterry Sidbury Crawford
	Date:		01-12-18
	Section:	CSC 120
	Desc:		This is a typing exercise.
*/
public class HeadsOrTailsSidburyCrawfordGeterry {
	public static void main(String[] args) {
		int CoinCounter = 0 ;
		int Heads = 0 ;
		int Tails = 0 ; 
		while (CoinCounter <= 1000000) {
			int CoinFlip = (int)(Math.random() * 2 );
			if (CoinFlip == 1) {
				Heads = Heads + 1 ;
			} else {
				Tails = Tails + 1 ;
			}
			CoinCounter++;
			}
		System.out.println("You fliped Heads " + Heads + " times! ");
		System.out.println("You fliped Tails " + Tails + " times! ");
	}
}
