package amazonProducts;

public class SearchProduct {

	/**
	 * here in this class im calling product class and creating simple method 
	 * @return  String 
	 * make sure in product page u are returning list of the products whisch is u defined inside ArrayList
	 */
	
	
	public String product_diplay(AppleProduct appleproduct) {
		
		if(appleproduct.getProductList().contains(appleproduct.getProductName())) {
			
			return appleproduct.getProductName();
		}
	
	return null;
	
}
}