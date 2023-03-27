package mvclab.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day16.mvc.MySQLConnect;

public class StudentDAO {
	
	//데이터 삽입	
	public boolean insertStudent(StudentDTO dto) {
		boolean result = false;		
		try(Connection conn = day16.mvc.MySQLConnect.connect();
				PreparedStatement pstmt = conn
				.prepareStatement("insert into student (name, score) valuse (?,?)");
				){
				pstmt.setString(1, dto.getName());
				pstmt.setInt(2, dto.getScore());
				System.out.println("student테이블에 데이터 삽입 완료");
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//데이터 읽기
	public List<StudentDTO> getAllStudent(){
		List<StudentDTO> slist = null;
		Connection conn = day16.mvc.MySQLConnect.connect();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select name,score from student order by score desc");){
			slist = new ArrayList<StudentDTO>();
			while(rs.next()) {
				StudentDTO stu = new StudentDTO();
				stu.setName(rs.getString("name"));
				stu.setScore(rs.getInt("score"));
				slist.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		MySQLConnect.close(conn);
		return slist;
	}
	
//점수만 출력하기
//존재하지 않는 학생명으로 호출한 경우에는 -1리턴
	public int getScore(StudentDTO dto) {
		int result = -1;
		Connection conn = day16.mvc.MySQLConnect.connect();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select score from student where name = '" + dto.getName() + "'");){
			if(rs.next()) {
				result = rs.getInt("score");
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	//데이터 수정하기
	public boolean updateStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = day16.mvc.MySQLConnect.connect();
		try(PreparedStatement pstmt = conn.prepareStatement("update student set name = ?, score = ? where name = ?");
				) {
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getScore());
			pstmt.setString(3, dto.getName());
			if(pstmt.executeUpdate() == 0)
				result = false;
			else
				result = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		MySQLConnect.close(conn);
		return result;
	}
	
	//데이터 제거하기
	public boolean deleteStudent(StudentDTO dto) {
		boolean result = false;
		Connection conn = day16.mvc.MySQLConnect.connect();
		try(PreparedStatement pstmt = conn.prepareStatement("delete from student where name=?")){
			pstmt.setString(1, dto.getName());
			if(pstmt.executeUpdate() == 0)
				result = false;
			else
				result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		MySQLConnect.close(conn);
		return result;
	}
	

}
