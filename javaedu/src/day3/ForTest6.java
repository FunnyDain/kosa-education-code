package day3;

public class ForTest6 {      

	public static void main(String[] args) {
		final char DECO = '*';		//상수(final) : 한번 값을 할당받으면 재할당 받을 수 없다. 관례적으로 모두 대문자로 
		int count = (int)(Math.random()*20);
		for(int n=0; n < count; n++)
			System.out.print(DECO);		
	}
}
