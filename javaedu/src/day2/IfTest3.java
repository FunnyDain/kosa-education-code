package day2;

public class IfTest3 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("추출된 num 값 : "+num);
		System.out.println(1);
		if (num % 2 == 1)
			System.out.println(2);
		System.out.println(3);
		if (num % 2 == 0) {
			//코드블럭
			System.out.println(4);
			System.out.println(5);
		}
		System.out.println(6);
		System.out.println(7);
	}

}
