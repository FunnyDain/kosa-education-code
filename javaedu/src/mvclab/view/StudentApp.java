package mvclab.view;

import java.util.Scanner;

import mvclab.controller.StudentController;

public class StudentApp {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int num ;
		String name = "";
		int score = 0;
		
		StudentController stC = new StudentController();
		loop: while(true) {
			System.out.println("\n처리하려는 기능을 선택하세요");
			System.out.print("1. 학생 정보 출력\n"
					+ "2. 학생 정보 입력\n"
					+ "3. 학생 정보 삭제\n"
					+ "4. 학생 정보 수정\n"
					+ "5. 학생 점수 확인\n"
					+ "6. 종료\n"
					+ "입력 : ");
			num = Integer.parseInt(sc.nextLine());
			switch(num) {
				case 1 : 
					stC.printAll();
					break;
				case 2 :
					System.out.println("학생의 이름을 입력하시오.");
					name = sc.nextLine();
					System.out.println("학생의 점수를 입력하시오");
					score = Integer.parseInt(sc.nextLine());
					stC.insert(name, score);
					break;
				case 3:
					System.out.println("삭제할 학생의 이름을 입력하시오");
					stC.delete(sc.nextLine());
					break;
				case 4:
					System.out.println("수정할 학생의 이름을 입력하시오.");
					name = sc.nextLine();
					System.out.println("수정할 학생의 점수를 입력하시오");
					score = Integer.parseInt(sc.nextLine());
					stC.update(name, score);
					break;
				case 5:
					System.out.println("점수를 확인하고 싶은 학생의 이름을 입력하시오");
					name = sc.nextLine();
					stC.printScore(name);
					break;
				case 6:
					System.out.println("종료합니다.");
					break loop;
				default :
					System.out.println("1~6사이를 입력하시오.");
			}
		}

	}

}
