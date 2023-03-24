package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectSubqueryEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		Scanner scan = new Scanner(System.in);
		System.out.print("부서명을 입력하세요 : ");
		
		//입력하는 직원명에 알맞는 정보를 찾아준다.
		//그런데 emp에 직원명이 없으므로 dept에서와 emp의 부서 넘버 demtno와 일치하는 직원명을 찾는 원리
		//join으로도 해결가능
		//select하는 최종결과가 1(테이블1사용)이다 서브쿼리, 최종결과가 여러개이다.(테이블 2개이상 사용)하면 join 
		String departmentname = scan.nextLine();
		ResultSet rs = stmt.executeQuery("SELECT ename, job, sal, deptno  FROM emp "		//공백을 꼭 줘야함
				+ "WHERE deptno = (SELECT deptno FROM dept WHERE dname = '" + departmentname + "')");

		if (rs.next()) {
			System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
			System.out.println("  -----------------------------------");
			do {
				System.out.printf("%10s%12s%8d%4d\n", rs.getString("ename"), rs.getString("job"), 
						rs.getInt("sal"), rs.getInt("deptno"));
			} while (rs.next());
		} else {
			System.out.println("\n추출되는 직원 정보가 없습니다.");
		}
		scan.close();
		rs.close();
		stmt.close();
		conn.close();
	}
}
