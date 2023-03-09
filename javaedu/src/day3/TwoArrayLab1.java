package day3;

import java.util.Iterator;

public class TwoArrayLab1 {

//	[ 실습 1 ]
//	1. TwoArrayLab1 라는 클래스를 만든다.
//	2. 4개의 행과 4개의 열을 갖는 int 타입의 2차원 배열을 생성한다.
//	 
//	3. 다음과 같은 구성이 되도록 생성된 2차원 배열에 데이터를 대입한다.
//
//	    10, 12, 14, 16
//	    18, 20, 22, 24
//	    26, 28, 30, 32
//	    34, 36, 38, 40
//
//	4. 출력형식
//
//	    	1행 1열의 데이터 : 10
//	   	3행 4열의 데이터 : 32
//		행의 갯수 : 4
//		열의 갯수 : 4
//		3행의 데이터들 : 26 28 30 32
//		2열의 데이터들 : 12 20 28 36
//	             왼쪽 대각선 데이터들 : 10 20 30 40
//	             오른쪽 대각선 데이터들 : 16 22 28 34
//
//	   (*) 이 실습 문제를 해결할 때 제시된 배열은 4행 4열이지만 3행 3열 또는 5행 5열 등
//	       사이즈가 다른 정방행열인 경우에도 요구사항이 처리될 수 있게 구현한다.            

	public static void main(String[] args) {
		//2
		int[][] ary = new int[4][4];
		
		//3
		int plus = 2;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = 8 + plus;
				plus += 2;
				if(j == ary.length-1) {
					System.out.println(ary[i][j]);
				}else {
					System.out.print(ary[i][j] + ",");					
				}
			}
		}
		
		//4
		System.out.println("\n1행의 1열의 데이터: " + ary[0][0]);
		System.out.println("3행의 4열의 데이터: " + ary[2][3]);
		System.out.println("행의 갯수: " + ary.length);
		System.out.println("열의 갯수: " + ary[ary.length-1].length);
		
		//왼쪽 대각선
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				if(i == j) {
					System.out.print(ary[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		//오른쪽 대각선
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				if((i+j) == ary.length-1) {
					System.out.print(ary[i][j] + " ");					
				}
			}
		}

	}

}
