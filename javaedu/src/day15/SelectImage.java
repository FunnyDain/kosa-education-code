package day15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.util.Iterator;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectImage {
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
				PreparedStatement pstmt = conn.prepareStatement("SELECT filename, imgcontent FROM imgtest WHERE filename = ?");) {
			System.out.print("읽으려는 이미지의 파일명을 입력하세요 : ");
			String name = scan.nextLine();
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String imgName[] = rs.getString("filename").split("\\.");	//정규표현식, 여기서 .만 그대로 쓰면 제대로 점을 인식하지 못함
				for (int i = 0; i < imgName.length; i++) {
					System.out.println(imgName[i]);
				}
				File imgFile = new File("c:/Temp/"+imgName[0]+new Date().getTime()+"."+imgName[1]);		//imgName[1]확장자
				InputStream is = rs.getBinaryStream("imgcontent");
				FileOutputStream fos = new FileOutputStream(imgFile);
				byte[] b = new byte[2048];		//2048byte씩 읽어온다.
				int n;
				while ((n = is.read(b)) > 0) {
					fos.write(b, 0, n);
				}
				fos.close();
			} else {
				System.out.print(name + "이라는 파일명으로 저장된 이미지가 존재하지 않습니다. ");
			}
			System.out.println("이미지 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
