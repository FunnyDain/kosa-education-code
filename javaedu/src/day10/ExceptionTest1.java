package day10;
public class ExceptionTest1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("수행시작");
		Thread.sleep(5000);		//sleep은 static인걸 알 수 있다.
		System.out.println("수행종료");
	}
}
