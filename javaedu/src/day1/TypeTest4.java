package day1;
public class TypeTest4 {
	public static void main(String[] args) {
		char c1 = 'A';          	//문자 저장
		char c2 = 65;          	//유니코드 직접 저장
		char c3 = '\u0041';    	//유니코드 직접 저장
		
		char c4 = '가';         	//문자 저장
		char c5 = 44032;      	//유니코드 직접 저장
		char c6 = '\uAC00';	//유니코드 직접 저장		
		
		System.out.println(c1);		//A
		System.out.println(c2);		//A
		System.out.println(c3);		//A
		System.out.println(c4);		//가
		System.out.println(c5);		//가		
		System.out.println(c6);		//가		
	}
}
