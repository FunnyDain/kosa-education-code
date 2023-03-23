package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectEmpLab {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Scanner sc = new Scanner(System.in);

		System.out.println("직원의 이름을 검색하시오 : ");
		String inputName = sc.next();



		while (true) {
			String sql = "Select ENAME, DATE_FORMAT(HIREDATE, '%Y년 %m월') HIREDATE, DEPTNO from emp where ENAME Like '"
					+ inputName + "'";
			try (Connection conn = DriverManager.getConnection(url, user, passwd);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);) {
				if (rs.next()) {
					System.out.printf("%s 직원은 근무중입니다. \n%s 에 입사했고 현재 %s 번부서에서 근무하고 있습니다.", rs.getString("ENAME"),
							rs.getString("HIREDATE"), rs.getString("DEPTNO"));
					break;
				} else {
					System.out.printf("%s 직원은 근무하지 않습니다.\n", inputName);
					System.out.println("더 검색하시겠습니까? 검색하고 싶다면 y / 원하지 않으면 n를 입력하시오.");
					String answer = sc.next();
					if (answer.equals("y")) {
						System.out.println("직원의 이름을 검색하시오 : ");
						inputName = sc.next();
						continue;
					} else
						break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

//		try(Connection conn = DriverManager.getConnection(url,user,passwd);
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(sql);){
//			if(rs.next()) {
//				do{
//					if(rs.getString("ENAME").toLowerCase().equals(inputName)) {
//						System.out.printf("%s 직원은 근무중입니다. \n%s 에 입사했고 현재 %s 번부서에서 근무하고 있습니다.", rs.getString("ENAME"), rs.getString("HIREDATE"), rs.getString("DEPTNO"));
//						break;
//					}
//					else 
//						System.out.printf("%s 직원은 근무하지 않습니다.\n", inputName);	
//						System.out.println("더 검색하시겠습니까? 검색하고 싶다면 y / 원하지 않으면 n를 입력하시오.");
//						String answer = sc.next();
//						if(answer.equals("y")) {
//							System.out.println("직원의 이름을 검색하시오 : ");
//							inputName = sc.next().toLowerCase();
//							continue;
//						}else
//							break;
//				}while(rs.next());
//			}else {
//				System.out.println("추출되는 행이 없습니다.");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

	}

}
