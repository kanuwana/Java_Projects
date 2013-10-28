package main.java.com.kanuwana.pms.service;


/**
 * Describes the interface for Product related database operations.
 * @author skanuwana
 *
 */
public interface ProductService {

	/**
	 * Saves a product in the default store.
	 * @param productName
	 */
	public void saveProduct(final String productName);
	
	/**
	 * Saves a product in a given store.
	 * @param productName
	 * @param storeName
	 */
	public void saveProduct(final String productName, final String storeName);
	
	/**
	 * Retrieves a product from the database.
	 * @param productName
	 * @return the product string
	 */
	public String getProduct(final String productName);
	
	/**
	 * Retrieves all the products list from the database.
	 * @param productName
	 * @return the product list 
	 */
	public String getAllProducts();
	
	/**
	 * Updates an existing product.
	 * @param productName
	 */
	public void updateProduct(final String productName);
	
	/**
	 * Removes a product from a given store.
	 * @param productName
	 */
	public void removeProduct(final String productName);
	
	//TEST method
	public String testPMS();
}
