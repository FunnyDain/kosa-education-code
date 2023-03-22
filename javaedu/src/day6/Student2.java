package day6;

import java.io.Serializable;

public class Student2 implements Serializable{
	//저장시 멤버가 3개인데 수정됨 = 직렬화된 객체와 다시 만들려는 객체 클래서 멤버변수 갯수가 다를 때,
	//uid라도 일치하면 맞는 얘들이라도 넣어주겠다는 뜻
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	String subject;
	
	
	public Student2(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public void printStudentInfo() {
		System.out.printf("%s학생의 나이는 %d입니다.\n",name,age);
	}
	void study() {
		System.out.printf("%s학생은 %s과목을 학습합니다.\n",name,subject);
	}
}

