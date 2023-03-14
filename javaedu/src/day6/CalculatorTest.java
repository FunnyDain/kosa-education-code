package day6;

import java.util.Scanner;

class CalculatorExpr{
	private int num1;
	private int num2;
	
	CalculatorExpr(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int getAddition() {
		return num1 + num2;
	}
	
	int getSubtraction() {
		return num1 - num2;
	}
	
	int getMultiplication() {
		return num1 * num2;
	}
	
	double getDivision() {
		return (double)num1 / num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		CalculatorExpr cal = new CalculatorExpr(num1, num2);
		System.out.printf("입력된 숫자 : %d, %d\n", num1, num2);
		System.out.printf("덧셈: %d\n", cal.getAddition());
		System.out.printf("뺄셈: %d\n", cal.getSubtraction());
		System.out.printf("곱셈: %d\n", cal.getMultiplication());
		System.out.printf("나눗셈: %f\n", cal.getDivision());
		
		while(true) {
			System.out.println("계속 진행하시겠습니까? o/x");
			String answer = sc.next();
			if(answer.equals("o")) {
				System.out.println("숫자 두개를 입력하시오.");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				CalculatorExpr cal2 = new CalculatorExpr(num1, num2);
				System.out.printf("덧셈: %d\n", cal2.getAddition());
				System.out.printf("뺄셈: %d\n", cal2.getSubtraction());
				System.out.printf("곱셈: %d\n", cal2.getMultiplication());
				System.out.printf("나눗셈: %f\n", cal2.getDivision());
			}else if(answer.equals("x")){
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		sc.close();
	}

}
