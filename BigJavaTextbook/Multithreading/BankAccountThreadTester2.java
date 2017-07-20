/** Big Java Textbook 2nd edition 
 *  written by Cay Horstmann
 *  Ch23.5 Avoiding Deadlocks
 *
 *  This program runs four threads that deposit and withdraw 
 *  money from the same bank account.
*/
public class BankAccountThreadTester2 {
	public static void main(String[] args) {
		BankAccount2 account = new BankAccount2();
		final double AMOUNT = 100;
		final int REPETITIONS = 1000;

		DepositRunnable2 d1 = new DepositRunnable2(account, AMOUNT, 
						REPETITIONS);
		WithdrawRunnable2 w1 = new WithdrawRunnable2(account, AMOUNT, 
						REPETITIONS);
		DepositRunnable2 d2 = new DepositRunnable2(account, AMOUNT, 
						REPETITIONS);
		WithdrawRunnable2 w2 = new WithdrawRunnable2(account, AMOUNT, 
						REPETITIONS);
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(w1);
		Thread t3 = new Thread(d2);
		Thread t4 = new Thread(w2);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


