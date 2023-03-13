package day6;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		title = "이것이 자바다";
	};
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		String result = title + " " + author + " " + price; 
		return result;
	}
}



public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		Book book2 = new Book("이것은 파이썬이다","신다인",10000);
		Book book3 = new Book("이것은 스프링이다","박연진",5000);
		Book book4 = new Book("이것은 자바스크립트이다","문동은",60000);
		Book book5 = new Book("이것은 JSP이다","김재준",40000);
		
		System.out.println(book1.getBookInfo());
		System.out.println(book2.getBookInfo());
		System.out.println(book3.getBookInfo());
		System.out.println(book4.getBookInfo());
		System.out.println(book5.getBookInfo());

	}

}
