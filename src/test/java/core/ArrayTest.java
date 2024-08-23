package core;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		// define a string array without a value
		
		String[] cars;
		
		
		// Define a string array with values
		String[] cars_array = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(Arrays.toString(cars_array));
		
		
		// Define an int array with values
		int[] myNum = {10, 20, 30, 40};

		
		// Access the Elements of an Array
		System.out.println(cars_array[0]);
		
		
		// Change an Array Element
		cars_array[0] = "Opel";
		
		
		// Array Length
		System.out.println(cars_array.length);
		
		
		// Loop through an array
		for (int i = 0; i < cars_array.length; i++) {
			 
			System.out.println(cars_array[i]);
			
		}
		
		
		// For each Loop through an array
		for (String i : cars_array) {
			
			  System.out.println(i);
			}
		
		
		
		
		
	}

}
