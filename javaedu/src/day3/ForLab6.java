package day3;

public class ForLab6 {

	public static void main(String[] args) {
//		[ 실습 2 ] 모양 출력(중첩 for)
//		1. ForLab6 라는 클래스를 만든다.
//		2. char 타입으로 상수를 하나 만들어 '&'로 초기화 한다.
//		    (상수를 만드는 방법은 변수 선어시 앞에 final 을 붙인다.)
//		3. 5부터 10사이의 난수를 하나 추출한다.
//		4. 추출된 숫자가 5라면 반복문을 사용하여 다음과 같이 출력한다.
//				&
//				&&
//				&&&
//				&&&&
//				&&&&&
//			    
//			     추출된 숫자가 7이라면 반복문을 사용하여 다음과 같이 출력한다.
//		
//				&
//				&&
//				&&&
//				&&&&
//				&&&&&
//				&&&&&&
//				&&&&&&&
		
		final char EX = '&';
		int num = (int)(Math.random()*6) + 5;
		for(int i=0; i<num; i++) {
			for(int j=0; i>=j; j++) {
				System.out.print(EX);
			}
			System.out.println();
		}
		
		
	}
}
