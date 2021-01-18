package amazonProducts;

import java.util.ArrayList;
import java.util.List;

public class AppleProduct {

	private String productName;
    private int price;
	
	
	
	/**
	 * @param productName
	 * @param price
	 */
    
    //same constructor with the parameter will be pass to the class where u created object of it 
	public AppleProduct(String productName, int price) {
		
		this.productName = productName;
		this.price = price;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	} 
	
	
	public List<String> getProductList() {
		
		List<String> productList = new ArrayList<>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple iphone 11");
		productList.add("Apple iphone 12");
		productList.add("Apple iphone 12 pro Max");
		productList.add("Apple iphone X");
		productList.add("Apple MacBook Air");
		productList.add("Apple ipad 11");
	
		return productList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
