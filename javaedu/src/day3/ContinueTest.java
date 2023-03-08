package day3;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		while(true) {
			num = (int)(Math.random()*31);
			if (num == 0) {
				System.out.println("\n종료");
				break;
			}
			if (num > 26) {
				System.out.println('@');
				continue;		//밑에 문장을 수행하지 않고, 조건문으로 이동
			}
			System.out.printf("%d(%c)", num, (char)(96+num));				
		}
	}
}
