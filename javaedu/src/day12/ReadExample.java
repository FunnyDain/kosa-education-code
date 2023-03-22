package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);		
				if(num == -1) break;
				
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			is.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
