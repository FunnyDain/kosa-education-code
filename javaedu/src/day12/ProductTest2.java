package day12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductTest2 {

	public static void main(String[] args) {
		List<Product2> products = new LinkedList<Product2>();
		
		products.add(new Product2("p100","TV",20000));
		products.add(new Product2("p200","Computer",10000));
		products.add(new Product2("p100","MP3",700));
		products.add(new Product2("p300","Audio",1000));
		
		Collections.sort(products);
		
		System.out.println(String.format("%-10s\t%-12s\t%10s\n------------------------------------------------" , "제품ID", "제품명", "가격"));
//		System.out.printf("\n%-10s%-12s%-10s\n----------------------------\n","제품ID","제품명","가격");
		
		for (Product2 p : products) {
			System.out.println(p.toString());
		}
		
		
//		System.out.println(products.toString().replace("[", "").replace("]", "").replace(", ", ""));
		
		
		
	}
}
