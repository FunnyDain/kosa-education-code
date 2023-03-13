package day6;

import day5.MethodLab5;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		bonus = 0;		//생략해도 됌, int는 자동으로 0초기화
	}
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	int getSalary(int grade) {
		int result = 0;
		switch(grade) {
			case 1 :
				result = this.bonus + 100;
				break;
			case 2: 
				result = this.bonus + 90;
				break;
			case 3: 
				result = this.bonus + 80;
				break;
			case 4: 
				result = this.bonus + 70;				
				break;
		}
		return result;
	}
}

public class SalaryExam {

	public static void main(String[] args) {
		int month = MethodLab5.getRandom(12);
		int grade = MethodLab5.getRandom(4);	
		SalaryExpr money;
		
		
		if(month%2 == 0)
			money= new SalaryExpr(100);		//보너스 100
		else
			money= new SalaryExpr();
		
		System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, money.getSalary(grade));
		
	}

}
