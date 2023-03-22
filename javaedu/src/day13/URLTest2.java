package day13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}
		try {
			URL req = new URL("http://img.etnews.com/news_ebuzz/afieldfile/2012/01/04/c_bk010101_87984_3.jpg");
			InputStream is = req.openStream();		//요청을 보내 대기중
			String fileName = "c:/iotest/duke.jpg";
			FileOutputStream fos = new FileOutputStream(fileName);
			int input = 0;
			while (true) {		//binary로 받음
				input = is.read();
				if (input == -1)
					break;
				fos.write(input);
			}
			fos.close();
			System.out.println("duke.jpg가 성공적으로 저장되었습니다.");
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application"		//Runtime.getRuntime().exec("시스템 명령어"); : 응용프로그램을 기동할 수 있음, chrome브라우저에서 보이게
					+ "\\chrome.exe "+fileName);
		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
	}
}
