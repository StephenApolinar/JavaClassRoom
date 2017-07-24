/**Big Java Textbook 2nd edition 
 * written by Cay Horstmann
 * Ch23.6 An Application of Threads
*/
import java.util.Random;

/**
 * This class contains utility methods for array 
 * manipulation.
*/
public class ArrayUtil {
	private static Random generator = new Random();

	/**
	 * Creates an array filled with random values.
	 * @param length the length of the array 
	 * @param n the number of possible random values
	 * @return an array filled with length numbers between 
	 * 0 and n - 1
	*/
	public static int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++)
			a[i] = generator.nextInt(n);
		return a;
	}

	/**
	 * Prints all elements in an array.
	 * @param a the array to print
	*/
	public static void print(int[] a) {
		for (int e : a)
			System.out.print(e + " ");
		System.out.println();
	}
}
