// From "Building Java Programs" text book.
// Ch9.6 Case Study: Financial Class Hierachy
// Uses Inheritance, Interfaces, and refactoring.
//
// A MutualFund object represents a mutual fund asset.
// Initial version.
public class MutualFund extends ShareAsset implements Asset {
	private double totalShares;

	// constructs a new MutualFund investment with the given 
	// symbol and price per share
	public MutualFund(String symbol, double currentPrice) {
		super(symbol, currentPrice);
		totalShares = 0.0;
	}

	// returns the market value of this mutual fund, which 
	// is the number of shares times the price per share
	public double getMarketValue() {
		return totalShares * getCurrentPrice();
	}

	// returns the number of shares of this mutual fund
	public double getTotalShares() {
		return totalShares;
	}

	// returns the profit made on this mutual fund
	public double getProfit() {
		return getMarketValue() - getTotalCost();
	}

	// records purchase of the given shares at the given price 
	public void purchase(double shares, double pricePerShare) {
		totalShares += shares;
		addCost(shares * pricePerShare);
	}
}
