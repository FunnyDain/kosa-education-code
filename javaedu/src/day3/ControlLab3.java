package day3;

public class ControlLab3 {

	public static void main(String[] args) {
//	[ 실습6 ]
//	1. ControlLab3 이라는 클래스를 생성한다.
//	2. 다음 기능을 반복하여 처리하는 자바 프로그램을 구현한다.
//
//	   1부터 120까지의 값을 추출하여 
//	   추출된 숫자가 50 미만이면
//	             "X : 50 미만"를 출력하고
//		3, 13, 23, 33, 43 인 경우에만
//	             "X : *듀크팀*" 을 출력한다.
//	   추출된 숫자가 50 이상이고 80이하면  
//	             "X : 50 이상 80 이하"를 출력하고
//		70~79 인 경우에만  
//		"X : *턱시팀*" 을 출력한다.
//	   추출된 숫자가 81 이상이고 100이하면  
//	             아무것도 출력하지 않고 다시 난수 추출부터 진행한다.
//	   101~120 이면
//	             아무것도 출력하지 않고 수행을 종료한다.
//
//	   단!! 메시지 출력은 System.out.printf() 로 하며 이 API 를 한번만 호출하여 해결해 본다.
//	   다음은 수행 예시이다.
//
//		10 : 50 이하
//	             65 : 50 이상 80 이하
//	             23 : 50 이하
//	             23 : *듀크팀*
//		75 : 50 이상 80 이하
//	             75 : *턱시팀*
//		33 : 50 이하
//		       :

		
		while(true) {
			int num = (int)(Math.random()*120) + 1;
			String str = "";
			
			if(num<50) {
				if(num%10==3){
					str = "*듀크팀*";
				}else {
					str = "50미만";
				}
			}else if(num>=50&&num<=80) {
				if(num>=70&&num<=79) {
					str = "*턱시팀*";
				}else {
					str = "50 이상 80 이하";
				}
			}else if(num>=81&&num<=100) 
				continue;
			else 
				break;				
		 
			System.out.printf("%d : %s",num, str);
			System.out.println();
		}

	}

}
