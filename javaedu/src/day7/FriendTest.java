package day7;

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

public class FriendTest {

	public static void main(String[] args) {
		
		Friend[] friends = new Friend[5];
		friends[0] = new Friend("다인","01064239648","codedain@gmail.com");
		friends[1] = new Friend("철수","01012345678","smart@naver.com");
		friends[2] = new Friend("짱구","01079798015","redshirt@daum.net");
		friends[3] = new Friend("흰둥이","01055553196","whitedog@gmail.com");
		friends[4] = new Friend("유리","01085267799","rabbit@gmail.com");
		
		for(Friend friend : friends) {
			System.out.println(friend.getInfo());
		}
	}

}
