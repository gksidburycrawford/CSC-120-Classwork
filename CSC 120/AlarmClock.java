/** Author: Geterry Sidbury 
	Date:	01-29-18
	Section: CSC 120
	Desc: This is a Alarm Clock java program
*/
import java.util.Scanner;
public class AlarmClock {
	public static void main(String[] args) {
		/* This is the first message of the program
		*/
		System.out.println("From Sunday (0), to Saturday (6)");
		/* This is the code for setting the alarm, switch and case statements are used
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("What day of the week is it?" );
		int DayOfWeek = input.nextInt();
		switch (DayOfWeek) { 
			case 0: System.out.print("You can sleep in today. Alarm set to 10:00 AM"); break;
			case 1: System.out.print("You neeed to wake up early. Alarm set to 10:00 AM"); break;	
			case 2: System.out.print("You neeed to wake up early. Alarm set to 10:00 AM"); break;
			case 3: System.out.print("You neeed to wake up early. Alarm set to 10:00 AM"); break;
			case 4: System.out.print("You neeed to wake up early. Alarm set to 10:00 AM"); break;
			case 5: System.out.print("You neeed to wake up early. Alarm set to 10:00 AM"); break;
			case 6: System.out.print("You can sleep in today. Alarm set to 10:00 AM"); break;
			/* This is if the user enters in a number other than 1-6.
			*/
			default:
					System.out.print("Please enter a value between 1-6!");								
		}
	}
}
			
			
		