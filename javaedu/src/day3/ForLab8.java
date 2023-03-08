package day3;

import java.util.Iterator;

public class ForLab8 {

	public static void main(String[] args) {
	
//		10*5
//		[ 실습4 ] 모양 출력(중첩 for)
//		1. ForLab8 라는 클래스를 생성한다.
//		2. 다음과 같은 결과가 되도록 구현한다.
//
//		    	********** 
//				 ********** 
//			  	  ********** 
//			 	   ********** 
//				    **********
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");				
			}
		}
	}

}
