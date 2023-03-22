package day12;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {

	public static void main(String[] args) {
		
//		- 구현 기능
//		다음과 같은 내용을 추출하여 c:/Temp/event.txt 라는 파일에 저장한다.
//		c:/Temp 디렉토리의 존재여부를 채크하고 존재하지 않으면 디렉토리를 
//		생성한다.  출력내용은 다음과 같다.
//
//		2023년 5월 5일은 X요일입니다.
//		2023년 6월 6일은 X요일입니다.
//
//
//		정상적으로 수행되면 
//		화면에 “저장이 완료되었습니다.”
//		예외 발생시
//		화면에 "파일에 저장하는 동안 오류가 발생했습니다."
//		를 출력하는 프로그램을 구현한다.
		

		
		String path = "c:/Temp";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try (FileWriter writer = new FileWriter("c:/Temp/event.txt", true);
				PrintWriter out = new PrintWriter(writer);) {
			LocalDate targetDate1 = LocalDate.of(2023, 5, 5);
			LocalDate targetDate2 = LocalDate.of(2023, 6, 6);
					
			String str1 = "2023년 5월 5일은 " + targetDate1.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN) + "요일입니다.\n";
			String str2 = "2023년 6월 6일은 " + targetDate2.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN) + "요일입니다.";
			out.write(str1);
			out.write(str2);
			System.out.println("저장이 완료되었습니다.");
	
		}catch(Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
		
		
				
				
	
	}

}
