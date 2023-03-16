package day8;

public class RuntimeTest {

	public static void main(String[] args) throws Exception{
		//Runtime은 생성자가 private(감춰짐)
		//new로 생성할 수 없고, getRuntime()메서드 즉, 팩토리메서드를 사용해야함(무조건 static이여야함)
		//이런 객체생성 클래스들은 알아놔야함~
		//싱글톤패턴을 적용했기 때문임 => 객체 하나만 생성하도록 설계됨
		//Runtime은 jvm임
		Runtime r = Runtime.getRuntime();
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		System.out.println(r);		//java.lang.Runtime@7d6f77cc
		System.out.println(r1);		//java.lang.Runtime@7d6f77cc
		System.out.println(r2);		//java.lang.Runtime@7d6f77cc
		
//		r.exec("c:/windows/notepad.exe");
		

	}

}
