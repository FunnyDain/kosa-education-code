package day6;

public class Book{
	String title;
	String author;
	int price;
	
	public Book(){
		title = "이것이 자바다";
	};
	
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getBookInfo() {
		String result = "제목:" + title + "\t 저자:" + author + "\t 가격: " + price; 
		return result;
	}
	

	public int getPrice() {
		return price;
	}

}




