package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
	
		//getClass().getName() : 인터페이스를 상속받는 자식클래스의 객체가 나옴(인터페이스는 객체 생성이 안되기 때문에)
		System.out.println(conn.getClass().getName());		//com.mysql.cj.jdbc.ConnectionImpl, 
	
		Statement stmt = conn.createStatement();
		System.out.println(stmt.getClass().getName());		//com.mysql.cj.jdbc.StatementImpl
		
		//format(sal, 0) 소수점은 없어! 대신 format 함수를 사용하면 반환값은 String, sal = 별칭, 아무거나
		ResultSet rs = stmt.executeQuery("select ename, job, format(sal, 0) sal, deptno  from emp");
		//select된 결과가 없다면 null이 아닌 비어있는 ResultSet객체가 리턴됨
		
		System.out.println(rs.getClass().getName());		//com.mysql.cj.jdbc.StatementImpl
		
		System.out.printf("%10s%10s%10s%10s\n", "성명", "직무", "급여", "부서");
		System.out.println("  -----------------------------------------");
		while (rs.next()) {		//next()무조건 1행씩 읽음
				System.out.printf("%10s%10s%10s원%10d\n", 
//						1.컬럼명
						rs.getString("ename"), rs.getString("job"), 
						rs.getString("sal"), rs.getInt("deptno"));
						
//						//2. 컬럼 순서별로 인덱스 값
//						rs.getString(1), rs.getString(2), 
//						rs.getString(3), rs.getInt(4));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
