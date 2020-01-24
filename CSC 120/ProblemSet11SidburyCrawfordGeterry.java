/** 
	Author:		Geterry Sidbury Crawford
	Date: 		3-14-18
	Section:	CSC 120
	Desc:		This is a typing exercise
**/ 

import java.util.Scanner;
public class ProblemSet11SidburyCrawfordGeterry {
	public static void main(String[] args) {
		int[] array = {10, 52, 13, 400, 500000};
		double avg = average(array);
		System.out.println("The average of array is " + avg);
		avg = average(3.14, 8.67, 9.1, 10.0, 222.0, 123.456);
		System.out.println("The average of array is " + avg);
		double std = standardDeviation(array);
		System.out.printf("The standard deviation of array is %5.3f\n", std);
		int key = 10;
		int c = count(key, array);
		System.out.println("The key " + key + " appears "+ c + " times in array");
		String skey = "cat";
		String[] sarray = {"dog", "parrot", "otter", "mouse"};
		c = count(skey, sarray);
		System.out.println("The key " + skey + " appears "+ c + " times in sarray");
		char[] charset = {'a', 'z', '7', 'f', 'F'};
		selectionSort(charset);
		for (char d : charset)
			System.out.print(d + ", ");
		System.out.println("\nIt should be 7, F, a, f, z,");
		int[] newarray = createArrayInt(3);
		for (int x : newarray)
			System.out.print(x + ", ");
		System.out.println("\nIt should be 0, 1, 2,");
		String[] newsarray = createArrayStr(3);
		for (String y : newsarray)
			System.out.print(y + ", ");
		System.out.println("\nIt should be 0, 1, 2,");
		newarray = createArrayInt(3, 10);
		for (int z : newarray)
			System.out.print(z + ", ");
		System.out.println("\nIt should be 3, 4, 5, 6, 7, 8, 9,");
	}
	public static double average(int[] numbers) {
		double sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double AverageTotal = (sum / ( numbers.length + 1));
		return AverageTotal;
		}
	public static double average(double... numbers) {
		double sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		double AverageTotal = (sum / ( numbers.length + 1));
		return AverageTotal;
		}	
	public static double standardDeviation(int[] numbers) {
		double sum = 0;
		for(int i = 0;i < numbers.length; i++) {
		sum = sum +	Math.pow((numbers[i] - average(numbers)), 2);
		}
		double standardDeviationTotal = Math.pow((sum/(numbers.length+1)), 0.5);
		return standardDeviationTotal;
	}
	public static int count(int i, int[] numbers) {
		int counter = 0;
		for (int j = 0; j < numbers.length; j++) {
			if (i == numbers[j]) {
				counter++;
			}
		}
		return counter;
			
	}
	public static int count(String i, String[] strings) {
		int counter = 0;
		for (int j = 0; j < strings.length; j++)
			if (i == strings[j]) {
				counter++;
			}
		return counter;
			
	}
	public static void selectionSort(char[] characters) {
		java.util.Arrays.sort(characters); //Sorts characters
	}
	public static int[] createArrayInt(int size)	{
		int number = 0;
		int[] IntArray = new int[size];
		for (int i = 0; i < size; i++) {
			IntArray[i] = number;
		}
		return IntArray ;
	}
	public static String[] createArrayStr(int size)	{
		int number = 0;
		String[] StringArray = new String[size];
		for (int i = 0; i < size; i++) {
			StringArray[i] = Integer.toString(number);
		}
		return StringArray ;
	}
	public static int[] createArrayInt(int start, int stop) {
		int difference = (stop - start);
		int[] IntArray = new int[difference];
		for (int i = 0; i < difference ; i++) {
			IntArray[i] = i + start;
		}
		return IntArray;
	}
}

