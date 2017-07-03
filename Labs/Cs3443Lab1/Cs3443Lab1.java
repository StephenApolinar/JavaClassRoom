/* Created by Stephen A. Apolinar
 * Date: 06/26/2017 */

// This program reads in tokens in a file.
// Records the number of tokens that are 
// numbers.  Records the number of tokens 
// that are not numbers.  Sums the 
// recorded number values.  Prints the 
// recorded values to an output file.

import java.io.*; // library for reading in files
import java.util.*; // library for scanner class

public class Cs3443Lab1 {
	public static void main(String[] args) 
			throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner input = getInput(console);
		PrintStream output = 
				new PrintStream(new File("Lab1Output.txt"));
		
		// Method for processing tokens
		// First method call is for debugging on 
		// command line.
		//processTokens(input, System.out);
		processTokens(input, output);
		}

	// Prompts the user for a legal file name; 
	// creates and returns a Scanner tied to the 
	// file.
	public static Scanner getInput(Scanner console)
			throws FileNotFoundException {
		System.out.print("input file name? ");
		File f = new File(console.nextLine());
		while (!f.canRead()) {
			System.out.println("File not found. Try again.");
			System.out.print("input file name? ");
			f = new File(console.nextLine());
		}
		// now we know that f is a file that can be read
		return new Scanner(f);
	}

	// Method for processing tokens, and outputting 
	// required information.
	public static void processTokens(Scanner input, 
					PrintStream output) {
		// variables
		int numbers = 0;
		int notNumbers = 0;
		double sumNumbers = 0;
		while (input.hasNext()) {
			// Debugging print statement below.
			//System.out.println("Before nested loop");
			while (input.hasNextDouble()) {
				numbers++;
				// Debugging print statement below.
				//System.out.println("A Number!");
				sumNumbers += input.nextDouble();
			}
			String token = input.next();
			notNumbers++;
			// Debugging print statement below.
			//System.out.println("Not a Number!");
		}
		// Print statements feed to ouput file
		output.println(numbers + " tokens are numbers.");
		output.println(notNumbers + " tokens ARE NOT numbers.");
		output.printf("All numbers in the file sume to: %,.2f", sumNumbers);
		// Print statements for debugging on command line.
		System.out.println(numbers + " tokens are numbers.");
		System.out.println(notNumbers + " tokens ARE NOT numbers.");
		System.out.printf("All numbers in the file sume to: %,.2f", sumNumbers);
	}
}
