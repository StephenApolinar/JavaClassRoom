/* Created by: Stephen A. Apolinar
   Date: 11/29/2016 */

import java.util.*;	// Java utility (Scanner class) for keyboard input.

public class Binary {
	// non-Constant class variables
	public static int num;

	public static void main(String[] args){
		Scanner CONSOLE = new Scanner(System.in);
		// prints Lab, Name, and date.
		System.out.println("Lab 8 written by Stephen A. Apolinar on 11/29/2016");

		System.out.println();
		
		System.out.println("This Program Converts An Integer Into Binary Numbers");
		System.out.println();
		// String variable for getInt(); method.	
		String userPrompt = ("Choose a positive integer: ");

		// variables for while loop that executes whole program.
		int execute = 1; // Variable to initialize while loop.
		String s1 = "no"; // Variable for User prompt test to continue program.
		String s2; // Variable for User input to continue program.
		while (execute == 1) {
			System.out.println();
			getInt(CONSOLE, userPrompt); // calls getInt method()

			//This while loop is used as check point to ensure the return 
			// integer is a positive integer.  If not, it recalls
			// getInt() method.
			while (num < 0) {
				getInt(CONSOLE, userPrompt);
			}
			// After a positive integer value is attained the  
			// convertToBinary(num) method is run.
			System.out.println();
			printBinaryArray(convertToBinary(num));
			System.out.println();
			// The following String test sequence processed very strange.
			// After several debugging attempts the following piece of code 
			// worked.  Use the String method 
			// Variable_1.equalsIgnoreCase(variable2); or equals() method.
			// The Operand equality (==), or not equals (!=) would not work.
			System.out.println("Do you want to continue (yes or no)? ");
			s2 = CONSOLE.next().trim();
			if (s2.equalsIgnoreCase(s1)) {
				System.out.println("You answered no. Have a nice day.");	
				execute = 0;
			} 

		}
					
	}
	
	// prompts until a valid number is entered
	public static int getInt(Scanner CONSOLE, String prompt) {
		System.out.print(prompt);
		System.out.println();
		// Ensures the user inputs an integer

		while (!CONSOLE.hasNextInt()) {
			System.out.println();
			CONSOLE.next(); // to discard the input
			System.out.println("Not a positive integer; try again.");
			System.out.println();
			System.out.println(prompt);
		}
		return num = CONSOLE.nextInt();
	}

	// Method converts positive integer to Binary.
	public static int[] convertToBinary(int decimal) {
		int len = 0; // initialized len to 0.
		for (int i = decimal; i > 0; i /= 2) {
			len++; // len is incremented
			//System.out.print(len);  //debugging Statement
		}
		// initializes array "bin" and sets the # of indexes equal to len.
		int[] bit = new int[len];
		int index = 0; // variable used for array index location.
		for (int i = decimal; i > 0; i /= 2) {
			if ((i % 2) != 0) { // stores 1 for even number.
				bit[index] = 1;
			} else { 	   // stores 0 for odd number.
				bit[index] = 0;
			}
			index++; // moves to next index location in array.
		}
		//System.out.print(Arrays.toString(bit));  //debugging Statement
		return bit; // returns array "bit".
	}

	// Method prints an array.

	public static void printBinaryArray(int[] binary) {
		for (int i = binary.length -1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	
	}
}
