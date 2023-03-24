package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select ename, job, sal, deptno from emp where ename like '%T%'");		//이름에 T가 포함되어 있는
		//ename like 'A%' : A로 시작하는
		//ename like 'A_' : A로 시작하면서 뒤에 문자가 1개가 있는 것
		//ename like 'A_ _' : A로 시작하면서 뒤에 문자가 2개가 있는 것
		//ename like '%A' : A로 끝나는
		//ename like '%A%' : A를 포함하고 있는
		
		
		System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
		System.out.println("  -----------------------------------");
		while (rs.next()) {
				System.out.printf("%10s%12s%8d%4d\n", 
						rs.getString("ename"), rs.getString("job"), 
						rs.getInt("sal"), rs.getInt("deptno"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
