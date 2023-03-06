package day1;
public class TypeTest3 {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; //컴파일러는 int로 간주하기 때문에 에러 발생
		long var3 = 7777777777L;		  //선언했지만 사용하지 않았기 때문에 경고, 좋지 않는 코드 
		
		
		long var4 = 1000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
