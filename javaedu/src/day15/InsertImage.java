package day15;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			return;
		} 
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner scan = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO imgtest (filename, imgcontent) VALUES (?, ?)")){
			System.out.print("저장할 이미지 파일명을 절대 패스로 입력하세요 : ");
			String name = scan.nextLine();
			File imgFile = new File(name);
			if (imgFile.exists()) {
				FileInputStream fin = new FileInputStream(imgFile); 		//객체 생성
				pstmt.setString(1, imgFile.getName()); 		//c:/iotest/myimage/cuteone.jpg : imgFile.getName() 파일 이름만 추출
				pstmt.setBinaryStream(2, fin, (int)imgFile.length());		//이미지이므로 string이 아닌 bite로 읽어야함
				pstmt.executeUpdate(); 		//이미지 db테이블에 들어감
				System.out.println("이미지 삽입 성공");
			} else {
				System.out.println("[오류] 이미지가 존재하지 않음");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
