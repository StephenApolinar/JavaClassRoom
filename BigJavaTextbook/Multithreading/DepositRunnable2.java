/* Big Java Textbook 2nd edition 
 * written by Cay Horstmann
 * Ch23.3 Race Conditions
 *
 * A deposit runnable makes periodic deposits to a bank account.
*/
public class DepositRunnable2 implements Runnable {
	private static final int DELAY = 1;
	private BankAccount2 account;
	private double amount;
	private int count;
	/**
	   Constructs a deposit runnable.
	   @param anAccount the account into which to deposit money
	   @param anAmount the amount to deposit in each repetition
	   @param aCount the number of repetitions
	*/
	public DepositRunnable2(BankAccount2 anAccount, double anAmount, 
			int aCount) {
		account = anAccount;
		amount = anAmount;
		count = aCount;
	}

	public void run() {
		try {
			for (int i = 1; i <= count; i++) {
				account.deposit(amount);
				Thread.sleep(DELAY);
			}
		}
		catch (InterruptedException exception) {
		}
	}
}
