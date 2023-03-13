package day5;

public class MethodLab8 {

//	[ 실습 3 ]
//
//	1. 클래스명 : MethodLab8
//	2. 정의해야 하는 메서드
//	   메서드명 : addEven
//	   매개변수 타입 : int...
//	   리턴값의 타입 : int
//	   기능 : 0 개 이상의 int 타입의 데이터들을 전달받아 짝수들의 합만 구하여 리턴한다.  
//	           아규먼트가 한 개도 전달되지 않으면 -1을 리턴한다.
//
//	3. 다음과 같이 addEven() 을 호출하고 리턴 결과를 화면에 출력한다.
//
//		addEven(10, 2, 5, 13, 7)
//		addEven(11, 22, 33, 44, 55, 66)
//		addEven()
//		addEven(100, 101, 103)
//
//		 [ 실행 결과 ]
//
//		호출 1 : 12
//		호출 2 : 132
//		호출 3 : -1
//		호출 4 : 100
				
				
	public static void main(String[] args) {
		
		System.out.println("호출 1: " + addEven(10, 2, 5, 13, 7));
		System.out.println("호출 2: " + addEven(11, 22, 33, 44, 55, 66));
		System.out.println("호출 3: " + addEven());
		System.out.println("호출 4: " + addEven(100, 101, 103));

	}
	
	static int addEven(int... num) {
		int sum = 0;
		
		if(num.length>0) {
//			for (int i = 0; i < num.length; i++) {
//				if(num[i] % 2 == 0) {
//					sum += num[i];					
//				}
//			}
			for(int n : num) {
				if(n % 2 == 0) {
					sum += n;
				}
			}
			return sum;
		}else
			return -1;
	}
}
