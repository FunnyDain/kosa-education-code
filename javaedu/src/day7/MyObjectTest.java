package day7;

class MyObject{
	void printName() {
		System.out.println("자바듀크");
	}
	
	//Object 부모의 메서드를 자식에서 재정의
	//메서드 오버라이딩
	//접근 제어자를 public으로 해야함
	public String toString() {
		return "Object의 자식클래스인 MyObject 객체임";
	}
	
}

public class MyObjectTest {

	public static void main(String[] args) {
		MyObject my = new MyObject();
		System.out.println(my.toString());
		System.out.println(my);
		System.out.println("출력" + my);
		my.printName();
	}

}
