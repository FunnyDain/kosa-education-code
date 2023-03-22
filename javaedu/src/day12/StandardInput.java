package day12;

public class StandardInput {

	public static void main(String[] args) throws Exception{
		System.out.println("입력 : ");
		char munja = (char)System.in.read();		//read는 한 문자만 읽음(1byte), 한글을 2byte라서 깨짐
		System.out.println("입력된 문자: " + munja);
	}

}
