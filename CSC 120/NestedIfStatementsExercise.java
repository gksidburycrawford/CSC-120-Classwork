




import java.util.Scanner;
public class NestedIfStatementsExercise {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your score? ");
		int GRADE = input.nextInt ();
		if (GRADE >  91) {
			System.out.println("Your grade is a A");
		}else {
			if (GRADE > 83) {
				System.out.println("Your grade is a B");
			}else {
				if (GRADE > 75) {
					System.out.println("Your grade is a C");
				}else {
					if (GRADE > 67) {
						System.out.println("Your grade is a D");
					}else {
						System.out.println("Your grade is a F");
					}	
				}
			}
		}	
	}		
}