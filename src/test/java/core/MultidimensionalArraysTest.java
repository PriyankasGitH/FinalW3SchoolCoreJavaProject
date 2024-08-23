package core;

public class MultidimensionalArraysTest {

	public static void main(String[] args) {
		
		// Multidimensional array
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		
		// Access element
		System.out.println(myNumbers[1][2]);
		
		
		
		// Update element
		myNumbers[1][2] = 9;
		
		
		
		// Loop through multidimensional array
		for (int i = 0; i < myNumbers.length; ++i) {
			  for (int j = 0; j < myNumbers[i].length; ++j) {
			    System.out.println(myNumbers[i][j]);
			  }
			}
		
		
		
		// For each
		for (int[] row : myNumbers) {
			  for (int i : row) {
			    System.out.println(i);
			  }
		
		}
	}

}
