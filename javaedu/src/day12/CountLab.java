package day12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLab {

	public static void main(String[] args) {

		int count = 0;
		String dir = "c:/kosastudy/resources/0321/yesterday.txt";
		String word = "yesterday";

		try(FileReader reader = new FileReader(dir);
				BufferedReader br = new BufferedReader(reader);) {
			String data;
			while(true) {
				data = br.readLine();
				if(data == null) 
					break;
				else if(data.contains("yesterday")) 
					count++;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e1) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			System.out.printf("yesterday라는 단어는 %d개 있습니다.", count);
		}
		
	}


}