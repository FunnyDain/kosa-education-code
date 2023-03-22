package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CopyLab {

	public static void main(String[] args) {
		SimpleDateFormat Date1 = new SimpleDateFormat("yyyy_mm_dd");
		String date = "sample_" + Date1.format(new Date()) + ".txt";
		String path = "c:/iotest/" + date;
		System.out.println(path);
		
		File dir = new File("c:iotest/");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		String data = " ";
		String temp = " ";
		try(FileReader reader = new FileReader("c:/kosastudy/resources/0321/sample.txt");
				BufferedReader bReader = new BufferedReader(reader);){
			
			while((data = bReader.readLine()) != null) {
				temp += data +"\n";
			}
			System.out.println(temp);
		} catch (FileNotFoundException e1) {
			System.out.println("sample.txt 파일을 찾을 수 없습니다.");
		} catch (IOException e2) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		} 
		
		
		try(FileWriter writer = new FileWriter(path,true); 
				BufferedWriter fWriter = new BufferedWriter(writer);){
			fWriter.write(temp);
			System.out.println("저장이 완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
		
		
		

	}

}
