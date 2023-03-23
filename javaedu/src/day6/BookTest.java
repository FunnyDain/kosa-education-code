package day6;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("자바의 정석","남궁성",27000);
		Book book2 = new Book("챗GPT","반병현",11700);
		Book book3 = new Book("스타트 스프링 부트","남가람",27000);
		Book book4 = new Book("Doit! 자바프로그래밍","박은중",22500);
		Book book5 = new Book("이것이 자바다","신용권,임경균",36000);
		
		System.out.println(book1.getBookInfo());
		System.out.println(book2.getBookInfo());
		System.out.println(book3.getBookInfo());
		System.out.println(book4.getBookInfo());
		System.out.println(book5.getBookInfo());


	}

}
