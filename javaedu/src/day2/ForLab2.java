package day2;

public class ForLab2 {

	public static void main(String[] args) {
	
//		[ 실습 4 ]
//				1. ForLab2 이라는 클래스를 만든다.
//				2. 다음과 같은 결과가 출력되도록 구현한다.
//
//				    9 : 홀수
//				    8 : 짝수
//				    7 : 홀수
//				    6 : 짝수
//				    5 : 홀수
//				    4 : 짝수
				    
		for(int i=9; i>3; i--) {
			if(i%2 == 1) {
				System.out.println(i + " : 홀수"); 
			}else {
				System.out.println(i + " : 짝수"); 				
			}
		}

	}

}
