package day6;

import java.util.Date;


public class DateTest {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today.toString());	
		System.out.println(today.toLocaleString());		//되도록 사용하지 말아라

	}

}
