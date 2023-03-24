package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBookLab {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		int count = 1;
		try(Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner sc = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO book(title,price,kind) VALUES (?,?,?)")) {
				String title = "";
				int price = 0;
				String kind = "";
				String aws = "";
			while(true) {
				System.out.print("도서명을 입력하세요 : ");
				title = sc.nextLine();
				System.out.print("가격을 입력하세요 : ");
				price = Integer.parseInt(sc.nextLine());
				System.out.print("도서분류에 대한 넘버를 입력하세요.\n1.프로그래밍 언어\n2.웹 프로그래밍\n3.빅데이터\n4.데이터베이스\n5.인프라\n선택(1~5) :");
				kind = sc.nextLine();
				switch(kind) {
					case "1" :
						kind = "b01";
						break;
					case "2" :
						kind = "b02";
						break;
					case "3" :
						kind = "b03";
						break;
					case "4" :
						kind = "b04";
						break;
					case "5" :
						kind = "b05";
						break;
				}
				pstmt.setString(1, title);
				pstmt.setInt(2, price);
				pstmt.setString(3, kind);
				pstmt.executeUpdate();
				
				System.out.println("정보가 입력되었습니다.\n계속 입력하겠습니까?(y/n) : ");
				aws = sc.nextLine();
				
				if(aws.equalsIgnoreCase("y")) {
					count++;
					continue;
				}else {
					System.out.printf("%d개의 데이터 입력 완료!",count);
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
				
	}

}
