package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class CheckEmpLab {

	public static void main(String[] args) {
//		1. DB 서버로 접속한다.
//		2. Random 클래스의 객체를 생성하여 true 와 false 랜덤값을 추출한다.
//
//		3. true 이면
//		   emp 테이블에서 모든 직원들의 이름과 월급, 두 개의 컬럼을 추출하여
//		   다음 형식으로 표준 출력한다.
//
//		   XXX 직원의 월급은 x,xxx달러입니다. 
//		   XXX 직원의 월급은 x,xxx달러입니다.
//		   XXX 직원의 월급은 xx,xxx달러입니다.
//		         :
//		4. false 이면
//		   emp 테이블에서 모든 직원들의 이름과 입사 날짜를 입사한지 오래된 순으로 추출하여
//		   다음 형식으로 표준 출력한다.
//
//		   XXX 직원은 xxxx년 xx월 xx일에 입사하였습니다. 
//		   XXX 직원은 xxxx년 xx월 xx일에 입사하였습니다. 
//		   XXX 직원은 xxxx년 xx월 xx일에 입사하였습니다. 
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		String sql1= "SELECT ENAME, SAL FROM emp";
		String sql2= "SELECT ENAME, DATE_FORMAT(HIREDATE, '%Y년 %m월 %d일')HIREDATE FROM emp order by HIREDATE desc";
		
		boolean random = new Random().nextBoolean();		//한번만 사용할 것이므로
		

		if(random) {
			try(Connection conn = DriverManager.getConnection(url, user, passwd);		//DriverManager abstract클래스
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql1);){
				if(rs.next()) {
					do {
						System.out.printf("%s 직원의 월급은 %,d달러입니다.\n", rs.getString("ENAME"), rs.getInt("SAL"));
					}while(rs.next());
				}else {
					System.out.println("추출되는 행이 없음");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			try(Connection conn = DriverManager.getConnection(url, user, passwd);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql2);){
				if(rs.next()) {
					do {
						System.out.printf("%s 직원은 %s에 입사하였습니다. \n", rs.getString("ENAME"), rs.getString("HIREDATE"));
					}while(rs.next());
				}else {
					System.out.println("추출되는 행이 없음");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
