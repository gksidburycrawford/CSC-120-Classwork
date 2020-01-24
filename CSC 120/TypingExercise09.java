/** 
	Author:		Geterry Sidbury Crawford
	Date: 		3-14-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 
public class TypingExercise07 {
	public static void main(String[] args) {
		// We can place elements on seperate lines
		String[] days = {"Monday", "Tuesday", "Wednesday",
		"Thursday", "Friday", "Saturday", "Sunday"};
		// Prints the array using foreach
		for (String day : days) {
			System.our.print(day + ", ");
		}
		System.out.println("");
		// Prints the array using a traditional for loop
		for (int i = 0; i < day.length; i++) {
			System.out.print(days[i] + ", ");
		}
		System.out.println("");
		// Prints the array backwards using a tradtional for loop
		for (int i = days.length-1; i >= 0; i--) {
			System.out.print(days[i] + ", ");
		}
	}
}
		
		