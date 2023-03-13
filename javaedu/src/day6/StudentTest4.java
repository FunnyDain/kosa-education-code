package day6;

class Student4{
	String name;
	int age;
	String subject;
	
	Student4(){
		//this메서드 : 생성자 안에서 다른 생성자를 호출하는 용도
		this("듀크",28,"스프링");   //생성자 메서드에서만 사용 가능, 첫행
	}
	
	Student4(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	void printStudentInfo() {
		System.out.printf("%s학생의 나이는 %d입니다.\n",name,age);
	}
	void study() {
		System.out.printf("%s학생은 %s과목을 학습합니다.\n",name,subject);
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
}

public class StudentTest4 {

	public static void main(String[] args) {

		Student4[] st = new Student4[4];
		st[0] = new Student4("둘리",10,"HTML5");
		st[1] = new Student4("또치",10,"CSS3");
		st[2] = new Student4("도우너",10,"JavaScript");
		st[3] = new Student4();
		
		for(Student4 obj : st) {
			System.out.println(obj);
			obj.printStudentInfo();
			obj.study();
			System.out.println("=========================");
		}
		
		st[3].setSubject("JPA");		//spring => JPA
		st[3].study();
	}

}
