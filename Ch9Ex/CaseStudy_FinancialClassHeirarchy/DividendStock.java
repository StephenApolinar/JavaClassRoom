// From "Building Java Programs" text book.
// Ch9.6 Case Study: Financial Class Hierachy
// Uses Inheritance, Interfaces, and refactoring.
//
// A DividendStock object represents a stock purchase that also pays 
// dividends.
public class DividendStock extends Stock {
	private double dividends; // amount of dividends paid

	// constructs a new DividendStock with the given symbol
	// and no shares purchased
	public DividendStock(String symbol, double currentPrice) {
		super(symbol, currentPrice); // call Stock constructor
		dividends = 0.0;
	}

	// returns this DividendStock's market value, which is 
	// a normal stock's market value plus any dividends
	public double getMarketValue() {
		return super.getMarketValue() + dividends;
	}

	// records a dividend of the given amount per share
	public void payDividend(double amountPerShare) {
		dividends += amountPerShare * getTotalShares();
	}
}
