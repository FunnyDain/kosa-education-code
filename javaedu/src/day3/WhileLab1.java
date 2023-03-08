package day3;


public class WhileLab1 {

	public static void main(String[] args) {
//		[ 실습1 ]
//				1. WhileLab1 라는 클래스를 생성한다.
//				2. 5부터 10사이의 난수를 추출한다.
//				3. 1부터 추출된 숫자값까지의 각 숫자들의 제곱값을 행단위로 출력한다.
//				   (하나의 클래스안에 for 와 while 로 각각 구현한다.)
//				  - 실행 결과
//				   ===>  7이 추출되었다면 다음과 같이 출력한다.
//
//				    [ for 결과 ]
//				     1 -> 1
//				     2 -> 4
//				     3 -> 9
//				     4 -> 16
//				     5 -> 25
//				     6 -> 36
//				     7 -> 49
//				    [ while 결과 ]
//				     1 -> 1
//				     2 -> 4
//				     3 -> 9
//				     4 -> 16
//				     5 -> 25
//				     6 -> 36
//				     7 -> 49
		
		int num = (int)(Math.random()*6) + 5;
		int i = 1;
		
		System.out.println("[for 결과]");
		for (; i <= num ; i++) {
			System.out.println(i + " -> " + i*i);
		}
		
		System.out.println("\n[while 결과]");
		
		i = 1;
		while(i<=num) {
			System.out.println(i + " -> " + i*i);
			i++;
		}
	}

}
