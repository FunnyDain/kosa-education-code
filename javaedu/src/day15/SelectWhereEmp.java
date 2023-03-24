package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectWhereEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ename, sal, comm FROM emp WHERE comm is not null");	//0이라고 비교하면 안됨! commission이 0으로 정해졌을 수도 있으므로 null로 비교
		System.out.printf("%8s%8s%8s\n", "성명", "급여", "커미션");
		System.out.println("  -----------------------------------");
		while (rs.next()) {
			System.out.printf("%10s%10d%10d\n", rs.getString("ename"), rs.getInt("sal"), rs.getInt("comm"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
