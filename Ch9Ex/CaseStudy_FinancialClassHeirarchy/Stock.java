// From "Building Java Programs" text book.
// Ch9.6 Case Study: Financial Class Hierachy
// Uses Inheritance, Interfaces, and refactoring.
//
// A Stock object represents purchase of shares of a stock.
// Initial version.
public class Stock extends ShareAsset implements Asset {
	private int totalShares;

	// constructs a new Stock with the given symbol and 
	// current price per share
	public Stock(String symbol, double currentPrice) {
		super(symbol, currentPrice);
		totalShares = 0;
	}

	// returns the market value of this stock, which is 
	// the number of total shares times the share price
	public double getMarketValue() {
		return totalShares * getCurrentPrice();
	}

	// returns the total number of shares purchased
	public int getTotalShares() {
		return totalShares;
	}

	// returns the profit made on this stock
	public double getProfit() {
		return getMarketValue() - getTotalCost();
	}

	// records a purchase of the given number of shares of 
	// the stock at the given price per share
	public void purchase(int shares, double pricePerShare) {
		totalShares += shares;
		addCost(shares * pricePerShare);
	}
}
