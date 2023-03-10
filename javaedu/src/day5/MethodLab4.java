package day5;



public class MethodLab4 {
//	[ 실습 4 ]
//	1. 클래스명 : MethodLab4
//
//	2. 구현해야 하는 추가 메서드 (static 붙여서)
//	   매개변수 : int 타입으로 2 개
//	   리턴값 : int 타입으로 1개
//	   메서드명 : 임의로
//	   기능 : 전달받은 2개의 데이터 중에서 큰 값에서 작은 값의 
//	            차를 리턴 두 값이 동일하면 0 을 리턴한다.
//	           10, 20 이 전달되면 ---> 10 리턴
//	           20, 5 가 전달되면 ---> 15 리턴
//	           5, 30 이 전달되면 ---> 25 리턴
//	           6, 3 이 전달되면  ---> 3 리턴
//
//	3. main() 메서드에서는 
//	   1부터 30 사이의 난수 2 개를 추출하여 2번에서 구현된 메서드를 호출하고
//	   리턴되는 결과를 가지고 다음과 같은 형식으로 출력한다.
//	   "X 와 Y 의 차는 W 입니다."
//	   ----> 5회 반복
//
//		[ 실행 결과 ]
//
//		X 와 Y 의 차는 W 입니다.
//		X 와 Y 의 차는 W 입니다.
//		X 와 Y 의 차는 W 입니다.
//		X 와 Y 의 차는 W 입니다.
//		X 와 Y 의 차는 W 입니다.
	
	
				
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*30)+1;
		int num2 = (int)(Math.random()*30)+1;

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d와 %d의 차는 %d입니다.\n", num1, num2, compare(num1, num2));			
		}
	}
	
	static int compare(int num1, int num2) {
		int minus = 0;
		if(num1 - num2 > 0) {
			minus = num1 - num2;
		}else if(num1 == num2) {
			minus = 0;
		}else {
			minus = num2 - num1;
		}
		return minus;
	}

}
