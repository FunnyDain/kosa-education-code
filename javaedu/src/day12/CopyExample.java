package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) {
		String originFileName = "c:/Temp/test.jpg";
		String targetFileName = "c:/Temp/test2.jpg";
		
		try {
			InputStream is = new FileInputStream(originFileName);
			OutputStream os = new FileOutputStream(targetFileName);
			
			//최대 1024바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				if(num == -1)break;
				
				os.write(data, 0 , num);
			}
			
			os.flush();
			os.close();
			is.close();
			System.out.println("복사가 잘 되었습니다.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
