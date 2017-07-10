// Creates a grade object.

import java.util.*; // For Arrays Class

public class Grades {
	private String studentName;
	private double[] grades;
	
	// Constructer
	public grades(String studentName, double[] grades) {
		if (studentName == null) {
			throw new NullPointerException();
		}

		this.studentName = studentName;
		this.grades = grades;
	}

	// Method for printing name of student
	public String getName() {
		return studentName;
	}

	// Method for printing array to a String
	public String toString() {
		return studentName + Arrays.toString(grades);
	}

	// Method for returning length of grades array.
	public int length() {
		return grades.length;
	}

	// Method for obtaining average of grades.
	public double average() {
		int sum = 0;
		for (int i = 0; i < grades.length; i ++) {
			sum += grades[i];
		}
		return sum / grades.length;
	}

	// Method for obtaining median of grades.
	public class arraySort() {
		// Initialing variables
		// Stores element value of current array 
		// index - 1.
		int indexValue;
		// Stores element value of current array 
		// index.
		int saveValue;
		
		// Iterates through array
		for (int i = 1; i < grades.length; i++) {
			// stores current element value
			indexValue = grades[i-1];
			// Test current element value for less 
			// than preceding element value.
			if (grades[i] < indexValue) {
				// store current element value
				saveValue = grades[i];
				// Replace value at current index
				grades[i] = indexValue;
				// Replace value at preceding index
				grades[i-1] = saveValue;
				// reset index to beginning of array
				i = 0;
				// Debugging print statement. Comment 
				// out if code is used in another 
				// program.
				System.out.println(Arrays.toString(grades));
			}
		}
	}

	// Method for obtaining Maximum value of array.
	public int maximum() {
		grades.arraySort();
		return grades[grades.length - 1];
	}

	// Method for obtaining Minimum value of array.
	public int minimum() {
		grades.arraySort();
		return grades[0];
	}
}
