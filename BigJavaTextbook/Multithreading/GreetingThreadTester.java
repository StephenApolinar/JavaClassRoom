/* Big Java Textbook 2nd edition 
 * written by Cay Horstmann
 * Ch23.1 Running Threads
*/

import java.util.Date;

/**
 * This program tests the greeting thread by running two 
 * threads in parallel.
*/
public class GreetingThreadTester {
	public static void main(String[] args) {
		GreetingRunnable r1 = new GreetingRunnable("Hello, World!");
		GreetingRunnable r2 = new GreetingRunnable("Goodbye, World!");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
