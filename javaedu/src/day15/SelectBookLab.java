package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SelectBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";


		int num = 0;
		ResultSet rs = null;

		try(Scanner sc = new Scanner(System.in);
			Connection conn = DriverManager.getConnection(url, user, passwd);
			Statement stmt = conn.createStatement();) {

			while (true) {
				System.out.println(
						"1. 모두 출력하기\n"
						+ "2. 가격이 높은 순으로 출력하기\n"
						+ "3. 20000이상의 도서들만 출력하기\n"
						+ "4. 웹 프로그래밍 도서들만 출력하기\n"
						+ "5. 데이터베이스와 인프라 도서들만 출력하기\n"
						+ "6. 도서명에 '자바'를 포함하는 도서들만 출력하기\n"
						+ "7. 분류별 도서 가격의 평균을 출력하기");
				System.out.print("\n원하는 메뉴의 번호를 선택: ");

				num = sc.nextInt();
				int print = 0;

				switch (num) {
				case 1:
					rs = stmt.executeQuery("select * from book");
					print = 1;
					break;
				case 2:
					rs = stmt.executeQuery("select * from book order by price desc");
					print = 1;
					break;
				case 3:
					rs = stmt.executeQuery("select title, price from book where price>=20000");
					print = 2;
					break;
				case 4:
					rs = stmt.executeQuery("select title, price from book where kind='b02'");
					print = 2;
					break;
				case 5:
					rs = stmt.executeQuery("select title, price from book where kind='b04'||kind='b05'");
					print = 2;
					break;
				case 6:
					rs = stmt.executeQuery("select title, price from book where title like '%자바%'");
					print = 2;
					break;
				case 7:
					rs = stmt.executeQuery("select kind, format(avg(price), 0) price from book group by kind");

					print = 3;
					break;
		
				}
			
				switch (print) {
				case 1:
					while(rs.next()) {
						System.out.printf("%d\t%s\t%,d원\t%s\n", rs.getInt("id"), rs.getString("title"), rs.getInt("price"), rs.getString("kind"));			
					}
					break;
				case 2:
					while(rs.next()) {
						System.out.printf("%s\t%,d원\n",rs.getString("title"),rs.getInt("price"));						
					}
					break;
				case 3:
					Map<String,String> map = new HashMap<>();
					map.put("b01","프로그래밍 언어");
					map.put("b02","웹 프로그래밍");
					map.put("b03","빅데이터");
					map.put("b04","데이터베이스");
					map.put("b05","인프라");

					while(true) {
						if(rs.next()) {
							System.out.printf("%s들의 가격 평균은 %s원 입니다\n",map.get(rs.getString("kind")),rs.getString("price"));	
						}else {
							System.out.println("데이터가 없습니다.");
							break;
						}	
					}
				}
				System.out.println("계속 처리하겠습까?? >> y/n");
				String answer = sc.next();
				if(!answer.equalsIgnoreCase("y")) {
					System.out.println("프로그램을 종료합니다.");
					break;				
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

}
