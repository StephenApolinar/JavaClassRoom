/**Big Java Textbook 2nd edition 
 * written by Cay Horstmann
 * Ch26.2 Parsing XML Documents
 * This class is pulled from Ch17.4
*/
/**
 * Describes a quantity of an article to purchase.
*/
public class LineItem {
	// Field
	private int quantity;
	private Product theProduct;

	/**
	 * Constructs an item from the product and quantity.
	 * @param aProduct the product
	 * @param aQuantity the item quantity
	*/
	public LineItem(Product aProduct, int aQuantity) {
		theProduct = aProduct;
		quantity = aQuantity;
	}

	/**
	 * Computes the total cost of this line item.
	 * @return the total price
	*/
	public double getTotalPrice() {
		return theProduct.getPrice() * quantity;
	}

	/**
	 * Formats this item.
	 * @return a formatted string of this line item
	*/
	public String format() {
		return String.format("%-30s%8.2f%5d%8.2f", 
					theProduct.getDescription(), theProduct.getPrice(), 
					quantity, getTotalPrice());
	}
	
	/**
	 * Returns a product object
	 * @return theProduct
	*/
	public Product getProduct() {
		return theProduct;
	}

	/**
	 * Returns the product quantity
	 * @return quantity
	*/
	public int getQuantity() {
		return quantity;
	}		
}
