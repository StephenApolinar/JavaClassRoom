/* Created by: Stephen A. Apolinar
   Date: 11/15/2016 */
import java.util.*;	// Java utility (Scanner class) for keyboard input.

public class Playoffs {
	// non-Constant class variables
	public static int percentChance;

	public static void main(String[] args){
		Scanner CONSOLE = new Scanner(System.in);
		Random r = new Random();	// randoom number object
		// prints Lab, Name, and date.
		System.out.println("Lab 6 written by Stephen A. Apolinar on 11/15/2016");
		System.out.println();
		
		System.out.println("The percent chance Team 1 will win a game?");
		System.out.println();
		// String variable for getInt(); method.	
		String userPrompt = ("Choose a number between 0 and 100. ");

		getInt(CONSOLE, userPrompt);

		// This while loop is used as check point to ensure the return 
		// integer is between o and 100. Before running the simulation.
		while (percentChance < 1 || percentChance > 99) {
			getInt(CONSOLE, userPrompt);
		}
		// After a good integer value is attained the simulation 
		// is run with the following submethod.
		seriesIteration(r, percentChance);		
	}
	
	// prompts until a valid number is entered
	public static int getInt(Scanner CONSOLE, String prompt) {
		//int userInput;
		System.out.print(prompt);
		System.out.println();
		// first ensures the user inputs an integer
		while (!CONSOLE.hasNextInt()) {
			System.out.println();
			CONSOLE.next(); // to discard the input
			System.out.println("Not an integer; try again.");
			System.out.println();
			System.out.println(prompt);
		} 
		return percentChance = CONSOLE.nextInt();
	}

	// Method simulates a singleGame.
	public static int singleGame(Random r, int percentChance1) {
		
		if (r.nextInt(100) < percentChance1) {
			//System.out.println("Team 1 won single game matchup");
			return 0;
		} else {
			//System.out.println("Team 2 won single game matchup");
			return 1;
		}
	}

	// Method simulates a playoff series.
	public static int playoffs(Random r, int percentChance1) {
		int x = 0;
		int y = 0;
		while (x < 4 && y < 4) {
			//percentChance = r.nextInt(100);
			//System.out.println(percentChance);
			if (singleGame(r, percentChance1) == 0) {
				x ++;
			} else {
				y ++;
			}
		}
		// The print statement below was used to check this method for
		// proper execution.  It was causing seriesIteration method 
		// to print out each "1" and "2" on seperate lines.  The 
		// program required for "1" and "2" to be printed on a single
		// horizontal line.  It was commented out after debugging 
		// trouble shoot.
		//System.out.println();
		if (x == 4) {
			//System.out.println("Team 1 won the playoff series");
			return 0;
		} else {
			//System.out.println("Team 2 won the playoff series");
			return 1;
		}
	}

	// Method iterates the playoffs method until one team has won 10 
	// series more than the opposing team.   
	public static void seriesIteration(Random r, int percentChance1) {
		int k = 0;
		int l = 0;
		// call to submethods within this method.
		// This method requires these methods to execute.
		singleGame(r, percentChance1);
		playoffs(r, percentChance1);

		while (k < 10 + l && l < 10 + k ) {
			// statements below were used to trouble shoot 
			// program during intial build.
			//percentChance = r.nextInt(100);
			//System.out.println(percentChance);
			
			// if/else test checks for return value of the playoffs 
			// method, and prints out which team won on a horizontal
			// line.
			if (playoffs(r, percentChance1) == 0) {
				System.out.print("1");
				k ++;
			} else {
				System.out.print("2");
				l ++;
			}
		}
		
		System.out.println();
		// checks value of k and l in while loop to determine when a team
		//  has won a series ten more times than the other team.
		if (k == 10 + l) {
			System.out.println("Team 1 won playoff series iteration");
		} else if (l == 10 + k) {
			System.out.println("Team 2 won playoff series iteration");
		}
	}	
}
