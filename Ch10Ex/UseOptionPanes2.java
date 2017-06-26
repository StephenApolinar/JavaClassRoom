// Uses JOptionPane windows for numeric input.

import javax.swing.*; // for GUI components

public class UseOptionPanes2 {
	public static void main(String[] args) {
		// read the user's name graphically
		String ageText = JOptionPane.showInputDialog(null,
				"How old are you?");
		int age = Integer.parseInt(ageText);

		String moneyText = JOptionPane.showInputDialog(null,
				"How much money do you have?");
		double money = Double.parseDouble(moneyText);

		JOptionPane.showMessageDialog(null,
				"If you can double your money each year, \n" +
				"You'll have " + (money * 32) +
				"dollars at age " + (age + 5) + "!");
	}
}
