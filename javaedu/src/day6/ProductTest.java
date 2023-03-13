package day6;

class Product{
	String name;
	int balance;
	int price;
	
	Product(){
		name = "듀크인형";
		balance = 5;
		price = 10000;
	};
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	};
	
	String getName() {
		return name;
	}
	
	int getBalance() {
		return balance;
	}
	
	int getPrice() {
		return price;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		
		Product[] products = new Product[5];
		products[0] = new Product();
		products[1] = new Product("텀블러",5,15000);
		products[2] = new Product("책상",8,120000);
		products[3] = new Product("에어팟",15,260000);
		products[4] = new Product("문구세트",16,8000);
		
		for(Product pr : products) {
			
			System.out.printf("상품명:%s\t 재고량:%d\t 가격:%,d원\n", pr.name, pr.balance, pr.price);
		}
	}

}
