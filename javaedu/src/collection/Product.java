package collection;

import java.util.Objects;


public class Product {
	
	private String productID;
	private String prodcutName;
	private String productPrice;
	
	public Product(String productID, String prodcutName, String productPrice) {
		super();
		this.productID = productID;
		this.prodcutName = prodcutName;
		this.productPrice = productPrice;
	}
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProdcutName() {
		return prodcutName;
	}
	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
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
		if (o != null && o instanceof Product) {
			Product p = (Product) o;		//부모타입 Object이므로 자식형으로 멤버를 접근해야함
			if (productID.equals(p.productID))
				return true;
		}
		return false;
	}
	

	
	
	
	
}
