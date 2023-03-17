package day5;



public class MethodLab7 {

//	[ 실습 2 ]
//
//	1. 클래스명 : MethodLab7
//	2. 정의해야 하는 메서드(2개)
//	   메서드명 : powerArray
//	   매개변수 타입 : int
//	   리턴값의 타입 : int[]
//	   기능 : 1부터 10까지의 값으로 구성되는 배열을 만들어 
//	           매개변수에 전달된 값만큼 배수로 element 값들을 변경하여 리턴한다.
//
//	   메서드명 : printArray
//	   매개변수 타입 : int[]
//	   리턴값의 타입 : void
//	   기능 : 매개변수를 통해서 전달된 배열을 element 값들을 다음 형식으로 출력한다. 
//
//		x,x,x,x,x,x,x,x,x,x
//
//
//	3. main() 메서드에서 powerArray() 를 다음과 같이 아규먼트를 전달하여 3번 호출하고 리턴된
//	   배열을 printArray() 에 전달하여 각 element 값을 출력한다.
//	   
//		powerArray(2);
//		powerArray(3);
//		powerArray(4);
//
//	             [ 실행 결과 ]
//		2,4,6,8,10,12,14,16,18,20
//	 	3,6,9,12,15,18,21,24,27,30
//		4,8,12,16,20,24,28,32,36,40	
		
		
	public static void main(String[] args) {
		printArray(powerArray(2));
		printArray(powerArray(3));
		printArray(powerArray(4));
	}
	
	
	static int[] powerArray(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*num;
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
		System.out.println();
		return;
	}
	
	

}
