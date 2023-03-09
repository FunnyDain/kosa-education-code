package day4;

import java.util.Iterator;

public class LottoMachine1 {

	public static void main(String[] args) {
//		[ 실습 5 ] 
//		1. LottoMachine1 이라는 클래스를  생성한다.
//		2. 1부터 45 사이의 난수 6개를 추출하여 다음 형식으로 출력한다.
//		    단, 6개 숫자는 중복을 허용하지 않는다.
//
//		    [ 출력형식 ]
//
//		    오늘의 로또 번호 - x, x, x, x, x, x
		
//		만약에 hash set을 사용하면 중복을 허용하지 않기 때문에 굿~
		
		int lotto[] = new int[45];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] += (i+1);
		}
		
		int temp;
		int j;
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45);		//+1 하면 인덱스이므로 x
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
		}
	
		
		System.out.print("오늘의 로또 번호 - ");
		for (int k = 0; k < 6; k++) {
			if(k == 5) {
				System.out.print(lotto[k]);				
			}else {
				System.out.print(lotto[k] + ", ");
			}
		}
		
		//방법2. 
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45)+1;
//			for (int k = 0; k < i; k++) {
//				if(lotto[i] == lotto[k])
//					i--;
//			}
//		}
		


	}

}
