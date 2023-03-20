package day11;

public class StringBufferTest {

	public static void main(String[] args) {		
		StringBuffer buffer = new StringBuffer();
		String str = "자바프로그래밍";
     	buffer.append(str);

        System.out.printf("%s\n", buffer);
        buffer.reverse();
        System.out.printf("%s\n", buffer);
        System.out.printf("길이 : %d\n", buffer.length());
        buffer.append(str);
        buffer.append(str);
        buffer.append(str);
        System.out.printf("%s\n", buffer);
        
        StringBuffer bf1 = new StringBuffer("가나다");
        StringBuffer bf2 = new StringBuffer();
        bf2.append("가나다");
        System.out.printf("%b\n", bf1.equals(bf2));		//false, 주의! equals를 오버라이딩 하지 않았음
        System.out.printf("%b\n", bf1 == bf2);
        System.out.printf("%b\n", bf1.toString().equals(bf2.toString()));	//true, 그래서 문자열로 변환후 equals 사용가능
	}
}










