package day12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductTest2 {

	public static void main(String[] args) {
		List<Product2> products = new LinkedList<Product2>();
		Product2[] proArr = new Product2[4];

		
		proArr[0] = new Product2("p100","TV",20000);
		proArr[1] = new Product2("p200","Computer",10000);
		proArr[2] = new Product2("p100","MP3",700);
		proArr[3] = new Product2("p300","Audio",1000);
		
		for (Product2 p : proArr) {
			products.add(p);
		}
		
		Collections.sort(products);
		
		System.out.printf("\n%-10s%-12s%-10s\n----------------------------\n","제품ID","제품명","가격");
		
		System.out.println(products.toString().replace("[", "").replace("]", "").replace(", ", ""));
		
		
		
	}
}
