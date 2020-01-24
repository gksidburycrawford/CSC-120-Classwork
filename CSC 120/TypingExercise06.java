/**
	Author: 	Geterry Sidbury Crawford
	Date:		01-12-18
	Section:	CSC 120
	Desc:		This is a typing exercise.
*/

public class TypingExercise06 {
	public static void main(String[] args) 	{
		testInACircle();
	}
	
	/**
	* Returns the distancec between Points with x/y-coordinates
	* @param x1 : x-coordinate of Point 1
	* @param y1 : y-coordinate of Point 1
	* @param x2 : x-coordinate of Point 2
	* @param y2 : y-coordinate of Point 2
	* @return a double
	*/
	public static double distance(double x1, double y1, double x2, double y2) {
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		return Math.sqrt(x + y);
	}
	
	/**
	* Return whether a Point is within a Circle
	* @param x1 : x-coordinate of Point
	* @param y1 : y-coordinate of Point
	* @param radius : the radius of the cirlce
	* @return a boolean
	*/
	public static boolean inACircle(double x1, double y1, double radius) {
		return distance(x1, y1, 0, 0) < radius;
	}
	
	/**
	* Prints various numbers in a Circle
	*/
	public static void testInACircle() {
		for (int i = 0; i < 10; i++) { //Runs 10 times
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 10);
			int radius = (int) (Math.random() * 20);
			if (inACircle(x, y, radius)) {
				System.out.println("("+x+", "+y+ ") is in the Circle with radius " + radius);
			} else {
				System.out.println("("+x+", "+y+ ") is NOT in the Circle with radius " + radius);
			} 
		}
			
	}
}