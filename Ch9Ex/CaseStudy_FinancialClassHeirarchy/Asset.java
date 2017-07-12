// From "Building Java Programs" text book.
// Ch9.6 Case Study: Financial Class Hierachy
// Uses Inheritance, Interfaces, and refactoring.

// Represents financial assests that investors hold.
public interface Asset {
	// how much the asset is worth
	public double getMarketValue();

	// how much money has been made on this asset
	public double getProfit();
}
