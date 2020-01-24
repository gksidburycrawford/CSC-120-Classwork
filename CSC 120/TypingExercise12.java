/** 
	Author:		Geterry Sidbury Crawford
	Date: 		3-28-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 
import java.util.Arrays;
public class TypingExercise12 {
	public static void main(String[] args) {
		int[][] array = new int[5][10];
		for (int i= 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}
		System.out.println("Traversing Before Sorting");
		for (int i= 0; i < array.length; i++) {
			System.out.print("Row " + i + ": ");
			for (int j = 0; j < array[i].length; j ++) {
				System.out.print(array[i][j] + " ,");
			}
			System.out.println("");
		}
		// Sorting each row individually
		for (int i =0; i < array.length; i++) {
			Arrays.sort(array[i]);
		}
		System.out.println("Traversing After Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Row " + i + ": ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + ", ");
			}
			System.out.println("");	
		}
	}
}