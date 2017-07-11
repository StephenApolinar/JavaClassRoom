/* Created by:
   Stephen A. Apolinar
   uak531/@00109576
   September 29, 2016 */

// Java utility (the Scanner class) for keyboard input.
import java.util.*;

public class Patterns {
	// setup class constant named CONSOLE to read input from keyboard
	public static final Scanner CONSOLE = new Scanner(System.in);
	// declare class constant variables
	public static int NUM_TEXT_BOXES;
	public static int WIDTH;

	// Main method
	public static void main(String[] args) {
		// Print project #, Name, and date.
		System.out.println("Project 1 written by Stephen A. Apolinar on 09/29/2016");
		System.out.println();
		// Print Text Boxes method call
		printTextBoxes();
		System.out.println();
		printTextTiles();	
	}		
			
	// Static methods 
	
	// This method calls sub methods to create individual boxes
	public static void printTextBoxes() {
		// get values from keyboard, store them in variables	
		System.out.println("Number of Text Boxes:");
		NUM_TEXT_BOXES = CONSOLE.nextInt();
		System.out.println();

		// call sub methods
		printPlusDashesPlus();
		printBarSpacesBar();
		printBarSpacesBar();
		printPlusDashesPlus();
	}

	// This method prints Top and Bottom of box
	public static void printPlusDashesPlus() {
		// Nested for loops are used to print the number of boxes input by user
		for (int j = 1; j <= NUM_TEXT_BOXES; j++) {
			// prints plus sign at first corner of each box
			System.out.print("+");
			// prints 6 iterations of dash line
			for (int i = 1; i <= 6; i++) {
				System.out.print("-");
			}
		}
		// prints plus sign at very end of the box sequence, last plus sign
		System.out.print("+");
		System.out.println();
	}

	// This method prints outside bars of box, and spaces
	public static void printBarSpacesBar() {
		// Nested for loops are used to print the number of boxes input by user
		for (int j = 1; j <= NUM_TEXT_BOXES; j++) {
			// prints bar at outside of box
			System.out.print("|");
			// prints spaces in box
			for (int i = 1; i <= 6; i++) {
				System.out.print(" ");
			}
		}
		// prints bar at very end of the box sequence, last bar
		System.out.print("|");
		System.out.println();
	}

	// Method calls submethods to create text tile pattern
	public static void printTextTiles() {
		// Declare variables for this method
		int Height;

		// get values from keyboard, store them in variables	
		System.out.println("Enter width of pattern: ");
		WIDTH = CONSOLE.nextInt();
		System.out.println();
		System.out.println("Enter height of pattern: ");
		Height = CONSOLE.nextInt();
		System.out.println();
		
		// This for loop controls height of pattern.  The for loop places the submethods in nested for looops.
		for (int i = 1; i <= Height; i++) {
			printX();
			printDiamond();
		}
		// prints last row of X's.  Not in height for loop.  Only width for loop controlled in submethod.
		printX();
	}

	// This method calls X pattern of Text tile pattern
	public static void printX() {
		// This for loop controls width of the pattern
		for (int i = 1; i <= WIDTH; i++) {
			// prints X
			System.out.print("  X  ");
		}
		System.out.println();
	}

	// This method calls the diamond pattern of Text tile pattern
	public static void printDiamond() {
		// All for loops in this method control the width of Text tile pattern.
		for (int i = 1; i <= WIDTH; i++) {
			// First diamond row
			System.out.print(" / \\ ");
		}
		System.out.println();
		for (int i = 1; i <= WIDTH; i++) {
			// Second diamond row
			System.out.print("/   \\");
		}
		System.out.println();
		for (int i = 1; i <= WIDTH; i++) {
			// Third diamond row
			System.out.print("\\   /");
		}
		System.out.println();
		for (int i = 1; i <= WIDTH; i++) {
			// Fourth diamond row
			System.out.print(" \\ / ");
		}
		System.out.println();
	}
}

