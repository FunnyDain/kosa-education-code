package day11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}
}

class Friend extends Person{
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		String info = super.getInfo() + "\t" + phoneNum + "\t" + email;
		return info;
	}
}

public class LinkedListListLab1 {

	public static void main(String[] args) {
		
		List<Friend> list = new LinkedList<>();
		list.add(new Friend("다인","01064239648","codedain@gmail.com"));
		list.add(new Friend("철수","01012345678","smart@naver.com"));
		list.add(new Friend("짱구","01079798015","redshirt@daum.net"));
		list.add(new Friend("흰둥이","01055553196","whitedog@gmail.com"));
		list.add(new Friend("유리","01085267799","rabbit@gmail.com"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getInfo());	
		}
		
	}

}
