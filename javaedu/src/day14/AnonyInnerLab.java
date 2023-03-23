package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import day6.Book;

public class AnonyInnerLab {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("자바의 정석","남궁성",27000));
		books.add(new Book("챗GPT","반병현",11700));
		books.add(new Book("스타트 스프링 부트","남가람",27000));
		books.add(new Book("Doit! 자바프로그래밍","박은중",22500));
		books.add(new Book("이것이 자바다","신용권,임경균",36000));

		for(Book b : books) {
			System.out.println(b.getBookInfo());
		}
		
		Collections.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book a, Book b) {
				return a.getPrice() - b.getPrice();
//				if(a.getPrice() < b.getPrice()) return -1;
//				else if(a.getPrice() > b.getPrice()) return 1;
//				else return 0;
			}
			}
		);
		
		System.out.println("[소팅 후]");
		for(Book b : books) {
			System.out.println(b.getBookInfo());
		}
	}

}
