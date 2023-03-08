package day3;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
				//홀수는 실행되지 않는다.
			}
			System.out.print(i + " ");
		}
	}

}
