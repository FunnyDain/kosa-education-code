package mvclab.controller;

import java.util.Iterator;
import java.util.List;

import mvclab.model.StudentDAO;
import mvclab.model.StudentDTO;

public class StudentController {
	
	public void printAll() {
		StudentDAO stDao = new StudentDAO();
		List<StudentDTO> slist = stDao.getAllStudent();
		for(StudentDTO stu : slist) {
			System.out.printf("학생의 이름은 %s이고 점수는 %d입니다.\n",stu.getName(),stu.getScore());
		}
		System.out.println();
		return;
	}
	
	public void printScore(String name) {
		StudentDAO stDao = new StudentDAO();
		StudentDTO stDto = new StudentDTO();
		stDto.setName(name);
		
		if(stDao.getScore(stDto) < 0) 
			System.out.printf("%s학생은 존재하지 않습니다.",name);
		else
			System.out.printf("%s학생의 점수는 %d입니다.",name,stDao.getScore(stDto));

		return;
	}
	
	public void insert(String name, int score) {
		StudentDAO stDAO = new StudentDAO();
		Boolean result = stDAO.insertStudent(new StudentDTO(name,score));
		if(result) 
			System.out.println("입력 성공");
		else
			System.out.println("입력 실패");
		return;
	}
	
	public void update(String name, int score) {
		StudentDAO stDAO = new StudentDAO();
		boolean result = stDAO.updateStudent(new StudentDTO(name, score));
		if(result)
			System.out.printf("%s학생의 점수를 변경했습니다.", name);
		else
			System.out.printf("%s학생은 존재하지 않습니다.", name);
		return;
	}

	public void delete(String name) {
		StudentDAO stDAO = new StudentDAO();
		StudentDTO stDTO = new StudentDTO();
		stDTO.setName(name);
		boolean result = stDAO.deleteStudent(stDTO);
		if(result)
			System.out.printf("%s 학생의 데이터를 삭제했습니다.\n", stDTO.getName());
		else
			System.out.printf("%s 학생은 존재하지 않습니다.", stDTO.getName());
		return;
	}
	
	
	
}
