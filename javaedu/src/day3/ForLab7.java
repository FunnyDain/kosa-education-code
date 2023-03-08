package day3;

public class ForLab7 {

	public static void main(String[] args) {
//		1. ForLab7 라는 클래스를 생성한다.
//		2. STAR 라는 상수를 만든고 '*'으로 초기화 한다.
//		3. 다음과 같은 결과가 되도록 구현한다.
//
//		    *******
//		    ******
//		    *****
//		    ****
//		    ***
//		    **
//		    *
		final char STAR = '*';
		
		for (int i = 7; i > 0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print(STAR);	
			}
			System.out.println();
		}

	}

}
