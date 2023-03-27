package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBookLab {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(url,user,passwd);
			stmt = conn.createStatement();
			stmt.executeUpdate("create table book (id int primary key auto_increment, title varchar(90), price int, kind char(3))");
			System.out.println("book 테이블 생성 완료!");
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
