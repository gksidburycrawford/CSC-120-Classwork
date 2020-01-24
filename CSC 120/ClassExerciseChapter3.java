


import java.util.Scanner;
public class ClassExerciseChapter3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value of 'a' "); 
		double a = input.nextDouble();
		double A = 1/(4.0) * Math.sqrt(5 + (5 + 2 * Math.sqrt(5))) * Math.pow(a, 2);
		System.out.println("The value of 'A' is " + A);		
	}	
}	
		
		
		