package day13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ImageIOLab {

	public static void main(String[] args) {
//	(1) list.txt 파일의 내용을 읽는다.
//	     파일 안에는 이미지 이름과 읽어올 이미지의 URL 이 존재한다.
//	(2) 지정된 URL로 이미지 파일을 읽어와서 c:/iotest/myimage 폴더에 
//	     이미지 이름으로 저장한다.(10개)
//
//	     생성되는 이미지 파일명은  cuteone.jpg, cutetwo.jpg .... cuteten.jpg 이다.
//
//	(3) 구현된 소스와 이미지 파일 10개를 압축하여 제출한다.

	String path = "c:/iotest/myimage/";
	File isDir = new File(path);
	if(!isDir.exists()) {
		isDir.mkdir();
	}
	
	List<String> urlList = new ArrayList<>();
	List<String> nameList = new ArrayList<>();
	
	try(FileReader reader = new FileReader("C:/kosastudy/resources/0322/list.txt");
			BufferedReader br = new BufferedReader(reader);){
		String data;
		
		while(true) {
			data = br.readLine();
			if(data == null) break;
			String [] strArr = data.split(",");
			nameList.add(strArr[0]);
			urlList.add(strArr[1]);
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("파일이 없습니다.");
	} catch (IOException e1) {
		System.out.println("파일을 읽을 수 없습니다.");
	}
	
	
	
	try {
		URL req = null;
		String imgUrl = "";
		String fileName = "";
		
		for (int i = 0; i < urlList.size(); i++) {
			req = new URL(urlList.get(i));
			InputStream is = req.openStream();
			FileOutputStream fos = new FileOutputStream(path + nameList.get(i) + ".jpg");
		
			int input = 0;
			while(true) {
				input = is.read();
				if(input == -1)
					break;
				fos.write(input);
			}
			fos.close();
		}
		System.out.println("성공적으로 저장했습니다.");
	}catch (MalformedURLException e) {
		System.out.println("URL문자열 오류 : " + e.getMessage());
	} catch (IOException e) {
		System.out.println("IO 오류 : " + e.getMessage());
	}
	
	
		
	}

}
