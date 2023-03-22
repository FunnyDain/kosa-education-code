package day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			//데이터 도착지를 test1.db파일로 하는 바이트 출력 스트림 생성
			OutputStream os = new FileOutputStream("c:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//1byte씩 출력
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
