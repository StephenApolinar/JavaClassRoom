// From "Building Java Programs" text book.
// Ch10.3 Case Study: Vocabulary Comparison
// Version 1: Compute Vocabulary
//
// First version of vocabulary program that reads two files and 
// determines the unique words in each.
import java.util.*;
import java.io.*;

public class Vocabulary1 {
	public static void main(String[] args)
			throws FileNotFoundException {
		Scanner in1 = new Scanner(new File("test1.txt"));
		Scanner in2 = new Scanner(new File("test2.txt"));

		ArrayList<String> list1 = getWords(in1);
		ArrayList<String> list2 = getWords(in2);

		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
	}

	public static ArrayList<String> getWords(Scanner input) {
		// read all words and sort
		ArrayList<String> words = new ArrayList<String>();
		while (input.hasNext()) {
			String next = input.next().toLowerCase();
			words.add(next);
		}
		Collections.sort(words);

		// add unique words to new list and return
		ArrayList<String> result = new ArrayList<String>();
		if (words.size() > 0) {
			result.add(words.get(0));
			for (int i = 1; i < words.size(); i++) {
				if (!words.get(i).equals(words.get(i - 1))) {
					result.add(words.get(i));
				}
			}
		}
		return result;
	}
}
