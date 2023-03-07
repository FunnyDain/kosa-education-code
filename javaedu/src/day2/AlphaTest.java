package day2;

public class AlphaTest {

	public static void main(String[] args) {
		
//		1. AlphaTest 라는 클래스를 생성한다.
//		2. num 이라는 변수를 int 타입으로 선언하여 1~26 사이의 난수값을 추출하여 저장한다.   
//		3. num이 1이면 'A' 문자, 2면 'B' 문자 .... 26이면 'Z' 문자를 다음 형식으로 출력한다.
//
//		    1이 추출된 경우라면  		
//			추출된 숫자 : 1
//			A
//		    3이 추출된 경우라면  		
//			추출된 숫자 : 3
//			C
//		    26이 추출된 경우라면  		
//			추출된 숫자 : 26
//			Z
//		위의 결과를 만들기 위해서 변수선언과 식 정의 그리고 if 문 사용 여부 등은 모두 임의로 정한다.
		
		//
		//65가 A
		//66가 Bd
		int num = (int)(Math.random() * 26) + 1;
		char alpha= (char)(num + 64);
	
		System.out.printf("%d이 추출된 경우라면 %n추출된 숫자 : %d %n %c", num, num, alpha);
	}

}
