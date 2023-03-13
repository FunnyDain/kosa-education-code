package day6;

class Member{
	String name;
	String account;
	String passwd;
	int birthyear;	
}


public class MemberTest {

	public static void main(String[] args) {
		
		Member member1 = new Member();
		member1.name = "신다인";
		member1.account = "dain1234";
		member1.passwd = "12341234";
		member1.birthyear = 1996;
		
		Member member2 = new Member();
		member2.name = "신짱구";
		member2.account = "jjangu";
		member2.passwd = "45674567";
		member2.birthyear = 1980;
		
		Member member3 = new Member();
		member3.name = "흰둥이";
		member3.account = "white";
		member3.passwd = "78947894";
		member3.birthyear = 1970;
		
		System.out.println("회원 이름 : " + member1.name);
		System.out.println("회원 계정 : " + member1.account);
		System.out.println("회원 암호 : " + member1.passwd);
		System.out.println("회원 생년 : " + member1.birthyear);
		System.out.println("=========================");
		System.out.println("회원 이름 : " + member2.name);
		System.out.println("회원 계정 : " + member2.account);
		System.out.println("회원 암호 : " + member2.passwd);
		System.out.println("회원 생년 : " + member2.birthyear);
		System.out.println("=========================");
		System.out.println("회원 이름 : " + member3.name);
		System.out.println("회원 계정 : " + member3.account);
		System.out.println("회원 암호 : " + member3.passwd);
		System.out.println("회원 생년 : " + member3.birthyear);


	}

}
