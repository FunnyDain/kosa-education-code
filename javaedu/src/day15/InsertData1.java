package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			return;
		} 
		Connection conn = null;
		Statement stmt = null;
		try {
			String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "jdbctest";
			String passwd = "jdbctest";
			conn = DriverManager.getConnection(url, user, passwd);	
			System.out.println("데이터베이스에 접속했습니다.");
			stmt = conn.createStatement();		
			stmt.executeUpdate("insert into student values ('둘리', 100)");		//모든 컬럼을 삽입하고 순서가 맞기 때문에 into뒤에 컬럼명 리스를 안 적어도 됨
			stmt.executeUpdate("insert into student values ('또치', 90)");
			stmt.executeUpdate("insert into student values ('도우너', 95)");
			stmt.executeUpdate("insert into student values ('희동이', 80)");
			stmt.executeUpdate("insert into student values ('마이콜', 85)");
			stmt.executeUpdate("insert into student values ('고길동', 60)");
			stmt.executeUpdate("insert into student values ('짱구', 90)");
			stmt.executeUpdate("insert into student values ('짱아', 75)");
			System.out.println("student 테이블에 데이터 삽입 완료");						
		} catch (SQLException se1) {
			System.out.println(se1.getMessage());
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException se2) {
				System.out.println(se2.getMessage());
			}
		}
	}
}
