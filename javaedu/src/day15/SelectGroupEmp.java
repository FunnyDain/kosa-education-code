package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectGroupEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ifnull(deptno,'미정') deptno, concat(count(*),'명') su FROM emp GROUP BY deptno");
		//group by : 4group, 미정(null이였음), 10명, 20명 30명
		//그룹당위로 count명
		//논리적으로 하나로 묶는다.	
				
		System.out.printf("%8s%12s\n", "부서명", "근무하는 인원");
		System.out.println("  -------------------------------");
		while (rs.next()) {
			System.out.printf("%10s%12s\n", rs.getString("deptno"), rs.getString("su"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
