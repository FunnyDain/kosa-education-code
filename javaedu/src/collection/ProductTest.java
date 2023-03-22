package collection;

import java.util.HashSet;

import java.util.Set;

public class ProductTest {

	public static void main(String[] args) {
		Set<Product> products = new HashSet<Product>();
		Product[] proArr = new Product[4];

		
		proArr[0] = new Product("p100","TV","20000");
		proArr[1] = new Product("p200","Computer","10000");
		proArr[2] = new Product("p100","MP3","700");
		proArr[3] = new Product("p300","Audio","1000");
		
		for (Product p : proArr) {
			if(products.add(p))
				System.out.println("성공적으로 저장되었습니다.");
			else
				System.out.println("동일한 ID의 제품이 이미 저장되었습니다.");
		}
		
		System.out.printf("\n%-10s%-12s%-10s\n----------------------------\n","제품ID","제품명","가격");
		for(Product p : products) {
			System.out.printf("%-10s%-12s%-10s\n",p.getProductID(), p.getProdcutName(), p.getProductPrice());
		}
			

		
		
		
	}
}
