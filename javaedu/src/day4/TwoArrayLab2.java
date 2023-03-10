package day4;


public class TwoArrayLab2 {
//	[ 실습 2 ]
//	1. TwoArrayLab2 라는 클래스를 만든다.
//	2. 다음의 내용대로 char 타입의 2차원 배열을 생성한다.
//	 
//	         'B', 'C', 'A', 'A'
//	         'C', 'C', 'B', 'B'
//	         'D', 'A', 'A', 'D'
//
//	3. 4개의 원소를 갖는 int 타입의 배열을 생성한다.
//	    첫번째 원소에는 'A' 문자의 개수    
//	    두번째 원소에는 'B' 문자의 개수    
//	    세번째 원소에는 'C' 문자의 개수    
//	    네번째 원소에는 'D' 문자의 개수    
//	    를 저장한다.
//
//	4. 출력형식
//	    A 는 x개 입니다.
//	    B 는 x개 입니다.
//	    C 는 x개 입니다.
//	    D 는 x개 입니다.	  

	public static void main(String[] args) {
		
		//2
		char[][] charArr = {
				{'B', 'C', 'A', 'A'},
				{'C', 'C', 'B', 'B'},
				{'D', 'A', 'A', 'D'}
		};

		//3
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		
		//전체 돌때 중첩된 for문 필수
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				switch(charArr[i][j]) {
					case 65 :
						aCount++;
						break;
					case 66 :
						bCount++;
						break;
					case 67 :
						cCount++;
						break;
					case 68 :
						dCount++;
						break;
				}
			}
		}
		
		
		int[] intArr = {aCount,bCount,cCount,dCount};
		char alph = 'A';
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("%c는 %d개입니다.%n",alph,intArr[i]);
			++alph;
		}
		
	}

}
