package day14;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
	public static void main(String[] args) {
		//1. jdbc드라이버 로딩, java6버전부터 굳이 직접 로딩안해도 됌, 내부적으로 알아서 찾음
		//.jar : java클래스를 모아놓은 파일
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//jdbc마다 
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			return;
		} 
		
		//db서버에 접속
		//여기서 url은 jdbc url
		//jdbc:접속할 DB서버이름://jdbc드라이버에 대한 정보와 드라이버에게 전달할 정보(이 부분은 드라이버마다 다름), 
		//3306 : mysql은 보통 3306포트를 열어놓고 있음, ip주소
		//edudb : 데이터베이스명
		//외부접속이므로 사용 다하면 close()해야함
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";	
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);){
			DatabaseMetaData md = conn.getMetaData();
			//잘 출력되면 연결과 세팅이 잘되었다.
			System.out.println("DBMS 서버 명 : "+md.getDatabaseProductName());
			System.out.println("DBMS 서버 버전 : "+md.getDatabaseProductVersion());
			System.out.println("사용자명 : "+md.getUserName()); 						
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
