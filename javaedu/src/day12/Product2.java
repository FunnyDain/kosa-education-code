package day12;

import java.util.Objects;


public class Product2 implements Comparable<Product2>{
	
	private String productID;
	private String productName;
	private int productPrice;
	
	public Product2(String productID, String productName, int productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	@Override
	public int compareTo(Product2 p) {
		if(productPrice < p.productPrice) return -1;
		else if(productPrice == p.productPrice) return 0;
		else return 1;
	}

	@Override
	public String toString() {
		return String.format("%-10s\t%-12s\t%,10d원\n" , productID, productName, productPrice);
	}


	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Product2) {
			Product2 p = (Product2) o;		//부모타입 Object이므로 자식형으로 멤버를 접근해야함
			if (productID.equals(p.productID))
				return true;
		}
		return false;
	}
	

	
	
	
	
}
