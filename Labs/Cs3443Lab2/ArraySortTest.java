// Program to test algorithm for Array Sorting 
// in ascending order.

import java.util.*; // For Arrays class

public class ArraySortTest {
	public static void main(String[] args) {
		// Initializing variables
		int[] grades = {90, 84, 87, 93, 83}; // Array for test
		int indexValue; // Stores element value of current array index - 1 
		int saveValue; // Stores element value of current array index
		
		// Iterates through array
		for (int i = 1; i < grades.length; i++) {
			indexValue = grades[i-1]; // Stores element value
			// Test current element value for less than 
			// preceding element value.
			if (grades[i] < indexValue) {		
				saveValue = grades[i]; // store current element value
				grades[i] = indexValue; // Replace value at current index
				grades[i-1] = saveValue; // Replace value at preceding index
				i = 0; // reset index to beginning of array
				// Debugging print statement.  Comment out 
				// if code is used in another program.
				System.out.println(Arrays.toString(grades));
			}
		}
	}
}

