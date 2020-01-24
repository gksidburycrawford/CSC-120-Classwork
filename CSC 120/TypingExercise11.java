/** 
	Author:		Geterry Sidbury Crawford
	Date: 		3-14-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 
public class TypingExercise11 {
	public static void main(String[] args) {
		int[] numberArray = generateRandomNumbers(10);
		
		//Print each element on 1 line
		System.out.print("Unsorted:\t");
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + "\t");
		}
		System.out.println(""); // Next Line
		
		bubbleSort(numberArray);
		// Print each element on 1 line again
		System.out.print("Bubble Sorted:\t");
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + "\t");
		}
		System.out.println(""); // Next Line
	}
	
	/**
	* Generates a list of random numbers from 0 to 99.
	*
	* @param size the size og the array of numbers
	* @return an int array 
	*/
	public static int[] generateRandomNumbers(int size) {
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		return array;
	}
	
	/**
	* Uses an algorithm knows as the 'bubble sort', rather slow sorting algorithm
	* that compares two elements in an array. If the 'right' element is smaller that
	* the 'left', they are swapped, Repeats until the array in sorted in ascending order.
	*
	* @param array an unsorted list of numbers
	*@return nothing, due to passing the array by reference instead of by value
	*/
	public static void bubbleSort( int[] array )
	{
		int j;
		// set flag to true to begin first pass
		boolean flag = true;
		while ( flag ) {
			flag= false;	//set flag to false awaiting a possible swap
			for( j=0; j < array.length -1; j++) {
				// change to < for desending order
				if ( array[ j ] > array[j+1] ) {
					//swaps elements
					int temp = array[ j ];
					array[ j ] = array[ j+1 ];
					array[ j+1 ] = temp;
					// shows a swap occured
					flag = true;
				}
			}
		}
	}			
}

	