package day3;

public class ControlLab2 {

	public static void main(String[] args) {
//		[ 실습5 ]
//		1. ControlLab2 이라는 클래스를 생성한다.
//		2. 다음 기능을 반복하여 처리하는 자바 프로그램을 구현한다.
//
//		   1부터 10까지의 값을 행단위로 출력하는데 3의 배수와 4의 배수는 제외한다.
//		   반드시 continue 문을 사용하여 해결한다.
//
//			1
//			2
//			5
//			7
//			10
		int num = 0;
		while(num<10) {
			num++;
			if(num%3==0||num%4==0) {
				continue;
			}else {
				System.out.println(num);				
			}
		}		
	}

}
