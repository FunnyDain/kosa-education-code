package day8;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo("가나다");
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:/Temp"));	//파일객체
		//운영체제 구분자 다름
		//window :\
		//mac : /
		//임시파일에 Temp많이 사용
		
		printObjectInfo(new int[10]);
		printObjectInfo(new double[5]);
		printObjectInfo(100);		//Integer
		
		
		//타입이 다양하지만 다형성 덕분에 에러가 안됌
		//java5 - autoboxing
		//: 객체가 와야할 자리인데 기본형이 와도 객체로 바꿔주는 것
		
		
	}
	
	static void printObjectInfo(Object o) {
		if(o instanceof String) {
			System.out.println("문자열 객체의 클래스명 : " + o.toString() + "-" + ((String)o).length());
			//getClass()리턴값 Object			
		}else {
			System.out.println("전달된 객체의 클래스명 : " + o.getClass().getName());			
		}
	}

}
