package day7;

class Multiplication {
	private int dan;
	private int number;

	Multiplication() {
	}

	Multiplication(int dan) {
		this.dan = dan;
	}

	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication{

	GuGuDanExpr(){};
	
	GuGuDanExpr(int dan){
		super(dan);
	}
	
	GuGuDanExpr(int dan, int number){
		super(dan, number);
	}

	public static void printAll() {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
}

public class GuGuDanApp {
	public static void main(String[] args) {
		int dan = (int)(Math.random()*20) + 1;
		int number = (int)(Math.random()*20) + 1;		
		
		if(dan<10) {
			GuGuDanExpr gugudan = new GuGuDanExpr(dan, number);
			if(number<10) {
				System.out.print(dan + "*" + number + "=");
				gugudan.printPart();				
			}else {
				gugudan = new GuGuDanExpr(dan);
				System.out.printf("%d단 :",dan);
				gugudan.printPart();
			}
		}else {
			GuGuDanExpr.printAll();
		}
		
		
	}
}


