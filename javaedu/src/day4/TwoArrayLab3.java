package day4;


public class TwoArrayLab3 {

//	[ 실습 3 ]
//
//	1. TwoArrayLab3 라는 클래스를 만든다.
//	2. 다음의 내용대로 int 타입의 2차원 배열을 생성한다.
//	   데이터는 4주간의 요일별 게임 시간이다.
//
//          일   월  화   수  목  금   토  
//	   1주 	5,  2,  1,  0,  2,  3,  6
//	   2주	4,  3,  2,  1,  1,  0,  5
//	   3주	3,  1,  2,  1,  3,  1,  3
//	   4주	4,  3,  1,  0,  4   2,  7
	   
//	   월별 게임시간의 합을 구하고 7개의 방을 갖는 int 타입의 배열을 생성해서 저장하고 출력한다. 이 때 저장 순서는 일~ 토 순이다.
//
//		일요일 : 16시간
//		월요일 : 9시간
//		화요일 : 6시간
//		수요일 : 2시간
//		목요일 : 10시간
//		금요일 : 6시간
//		토요일 : 21시간
//
//	   주별 게임 시간의 합을 구하고 7개의 방을 갖는 int 타입의 배열을 생성해서 저장하고 출력한다.
//
//		1주차 : 19시간
//		2주차 : 16시간
//		3주차 : 14시간
//		4주차 : 21시간
	
	public static void main(String[] args) {

		int dayArr[][] = {
				{5,2,1,0,2,3,6},
				{4,3,2,1,1,0,5},
				{3,1,2,1,3,1,3},
				{4,3,1,0,4,2,7}
		};
		
		int[] dayHour = new int[7];
		
		int[] weekHour = new int[4];
		
		//월별 시간
		for (int i = 0; i < dayArr[0].length; i++) {	//7	
//			System.out.println(i);
			for (int j = 0; j < dayArr.length; j++) {	
				dayHour[i] += dayArr[j][i];
			}
		}
		
		//switch문 사용안하고 배열사용도 가능
		//char[] week = {'월','화','수','목','금','토','일'};
		
		
		for (int i = 0; i < dayHour.length; i++) {
			switch(i) {
				case 0:
					System.out.print("월요일 : ");
					break;
				case 1:
					System.out.print("화요일 : ");
					break;
				case 2:
					System.out.print("수요일 : ");
					break;
				case 3:
					System.out.print("목요일 : ");
					break;
				case 4:
					System.out.print("금요일 : ");
					break;
				case 5:
					System.out.print("토요일 : ");
					break;
				case 6:
					System.out.print("일요일 : ");
					break;
					
			}
			System.out.println(dayHour[i] + "시간");			
		}
		
		System.out.println();
		
		//주차 시간
		for (int i = 0; i < dayArr.length; i++) {		//4
			for (int j = 0; j < dayArr[i].length; j++) {		//7
				weekHour[i] += dayArr[i][j];
			}
			
		}
		
		for (int i = 0; i < weekHour.length; i++) {
			System.out.println((i+1) + "주차 : " + weekHour[i] + "시간");			
		}


	}

}
