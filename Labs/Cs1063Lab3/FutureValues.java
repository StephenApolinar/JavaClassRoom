// Java utility (Scanner class) for keyboard input.
import java.util.*;
import java.text.*;

public class FutureValues {
// set up a class constant named CONSOLE to read from the keyboard
//public static final Scanner CONSOLE = new Scanner(System.in);

	public static void main(String[] args) {
  	// prints out Lab #, Author, and date.
  	System.out.println("Lab 3 written by Stephen A. Apolinar on 09/29/2016");
  	System.out.println();
  
  	// Setup Scanner constant in methods named console to read from the keyboard
  	Scanner console = new Scanner(System.in);

  	// Call Methods

  	// Call Future Value using compound interest method
  	System.out.println("Compound Interest Calculator for the future value on a present dollar amount");
  	System.out.println();
 	System.out.print("Enter present value $");
	double payment = console.nextDouble();
  	System.out.println();
  	System.out.print("Enter interest rate (%):");
  	double interestRate = console.nextDouble();
  	System.out.println();
  	System.out.print("Enter number of years:");
  	double years = console.nextDouble();
  	double projectedValue = futureValueUsingCompoundInterest(payment, interestRate, years);
  	//moneyString(projectedValue);
  	System.out.println();
  	System.out.print("Future value using compound interest in $" + projectedValue);
  	System.out.println();

  	// Call Future Value of an Annuity
  	System.out.println();
  	System.out.println("Future Value of your Annuity Calculator");
  	System.out.println();
  	System.out.print("Enter yearly payment $");
  	double yearlyPayment = console.nextDouble();
  	System.out.println();
  	System.out.print("Enter annuity interest rate (%):");
  	double annuityInterestRate = console.nextDouble();
  	System.out.println();
  	System.out.print("Enter number of years of annuity payments:");
  	double annuityYears = console.nextDouble();
  	double projectedValueOfAnnuity = futureValueOfAnAnnuity(yearlyPayment, annuityInterestRate, annuityYears);
  	System.out.println();
  	System.out.print("Future value of your Annuity in $" + projectedValueOfAnnuity);
  	System.out.println();

	}
 
 	// Static Method for computing Future value using compound interest
 	// p = present value, r = interest rate, y = number of years
 	public static double futureValueUsingCompoundInterest(double p, double r, double y) {
  	// decompose equation and simplify for code
  	//  future value = present value * (1 + (rate/100))^years
  	double base = (1 + (r/100));
  	double futureValue = p * Math.pow(base, y);
  	return futureValue;
 	}

 	// Static Method for computing Future Value of an Annuity
	//
 	public static double futureValueOfAnAnnuity(double p, double r, double y) {
  	// decompose equation and simplify for code
  	//  future value = p * ((((1 + (r/100))^y)-1)/(r/100))
  	double base = (1 + (r/100));
  	double numerator = Math.pow(base, y) - 1;
  	double denominator = (r/100);
  	double futureValueAnnuity = p * (numerator/denominator);
  	return futureValueAnnuity;
 	}

 	// Returns a String $dollars.cents rounded to the nearest cent.
 	//  For example, moneyString(12.3456) returns "12.35".
 	public static String moneyString(double amount) {
  	DecimalFormat dollarsAndCents = new DecimalFormat("$#0.00");
  	return dollarsAndCents.format(amount);
 	}
}
