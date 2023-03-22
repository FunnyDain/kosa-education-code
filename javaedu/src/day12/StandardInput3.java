package day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput3 {

	public static void main(String[] args) throws Exception{
		System.out.println("입력 : ");
		InputStreamReader isr = new InputStreamReader(System.in);	//System.in : 바이트
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();		//한 행씩 읽어드림
		System.out.println("입력된 문자: " + str);
	}

}
