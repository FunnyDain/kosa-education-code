package day10;
import java.util.Random;

//예외클래스를 직접 만듬(예외객체를 위한 클래스)
class TestException extends Exception {
	
	//생성자
	TestException(String message){
		//조상생성자를 호출해서 초기화
		super(message);
	}
}
public class ExceptionTest3 {
	public static void main(String[] args)  {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	static void a()  {
		System.out.println("a()수행시작");
		try {
			b();
		} catch (TestException e){	
			System.out.println("오류 발생 : "+e.getMessage());
		}
		System.out.println("a()수행종료");
	}
	//소극적인 예외처리
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	static void c() throws TestException {
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean();		//random객체를 생성해서 nextBoolean()을 호출하는 것(true or false)
		if(flag){
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>");		//catch블록으로 이동
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}








