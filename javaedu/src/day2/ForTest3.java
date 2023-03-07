package day2;

public class ForTest3 {

	public static void main(String[] args) {
		for(int n=1; n < 20; n++)
			System.out.print(n+ " ");
		System.out.println();
		//19번
		
		for(int n=10; n > 0; n--)
			System.out.print(n+ " ");
		System.out.println();
		//10번
		
		for(int n=1; n < 20; n += 3)
			System.out.print(n+ " ");
		System.out.println();
		//7번
		
		// 1월~12월 까지 하나의 행에 출력해 보자. 
		int month=1;
		for(; month <= 12; month++)		//초기식 생략
			System.out.print(month+ "월 ");
		System.out.println();
		System.out.println(month);
	}

}
