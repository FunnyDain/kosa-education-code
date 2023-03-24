package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectSalEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url,user,passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ename, concat(format(sal, 1),'달러') fsal FROM emp ORDER BY sal DESC");		//format(sal, 1) 소수점 1자리까지
		System.out.printf("%-8s%-8s\n", "성명", "급여");
		System.out.println("  --------------------------");
		while (rs.next()) {
			System.out.printf("%-10s%-12s\n", rs.getString("ename"), rs.getString("fsal"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
