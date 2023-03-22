package day12;

import java.io.InputStreamReader;

public class StandardInput2 {

	public static void main(String[] args) throws Exception{
		System.out.println("입력 : ");
		InputStreamReader isr = new InputStreamReader(System.in);	//System.in : 바이트
		char munja = (char)isr.read();		//read는 한 문자만 읽음(1byte),이번에 깨지지 x
		System.out.println("입력된 문자: " + munja);
	}

}
