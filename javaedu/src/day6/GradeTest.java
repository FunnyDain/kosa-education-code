package day6;

import java.util.Scanner;

class GradeExpr{
	
	private int[] jumsu;
	
	GradeExpr(int[] jumsu){
		this.jumsu = new int[jumsu.length];
		for (int i = 0; i < jumsu.length; i++) {
			this.jumsu[i] = jumsu[i];
			System.out.println(this.jumsu[i]);
		}
	}
	
	double getAverage(){
		int sum = 0;
		for(int score : this.jumsu) {
			sum += score;
		}
		return	(double)sum / jumsu.length; 
	}
	
	int sum = 0;
	int getTotal(){
		for(int score : this.jumsu) {
			sum += score;
		}
		return sum;
	}
	
	int getGoodScore() {
		int max = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(max < jumsu[i])
				max = jumsu[i];
		}
		return max;
	}
	
	int getBadScore() {
		int min = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if(min > jumsu[i])
				min = jumsu[i];
		}
		return min;
	}
}



public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 갯수: ");
		int count = sc.nextInt();
		
		int[] jumsu = new int[count];
		System.out.print("점수들: ");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
		}
		GradeExpr grade = new GradeExpr(jumsu);
		
		for (int i = 0; i < jumsu.length; i++) {
			if(i == jumsu.length -1)
				System.out.printf("%d\n", jumsu[i]);
			else	
				System.out.printf("%d,", jumsu[i]);
		}
		
		System.out.println("총점 : " + grade.getTotal());
		System.out.println("평균 : " + grade.getAverage());
		System.out.println("최고 점수 : " + grade.getGoodScore());
		System.out.println("최저 점수 : " + grade.getBadScore());
	}

}
