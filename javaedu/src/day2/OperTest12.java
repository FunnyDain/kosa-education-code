package day2;

public class OperTest12 {

	public static void main(String[] args) {
		int num = 100;
		
		System.out.println(num > 100 && ++num == 101); // false
		System.out.println(num);  // 100
		
		System.out.println(num > 100 || ++num == 101); // true
		System.out.println(num);  // 101, why?? num > 100 && ++num == 101에서 num > 100부터 거짓이므로 ++num == 101가 실행되지 않았다. 
	}

}
