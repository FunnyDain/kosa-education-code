package day11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		
		try {
			Reader reader = null;
			reader = new FileReader("c:/Temp/test.txt");
		
			while(true) {
				int data = reader.read();		//타입 int여야함
				if(data == -1) break;
				System.out.println("");
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
