package day10;

interface InterCalculator {

	int add(int x, int y);

	int sub(int x, int y);

//default 선택적 오버라이딩
	default int mul(int x, int y) {
		return x * y;
	}
	
//static은 오버라이딩 의미가 없음. 부모꺼
	static void print() {		 
        System.out.println("사칙 연산 처리");
    }
}

class Calculator implements InterCalculator {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		return x - y;
	}
	
	/*@Override 선택적 오버라이딩
    public int mul(int x, int y) {
        System.out.println(x + "와 " + y + "를 곱합니다.");
        return x * y;
    }*/
	
	public int div(int x, int y) {
		if (y != 0)
			return x/y;
		return 0;
	}
}

public interface InterfaceTest3 {
	public static void main(String[] args) {
		InterCalculator cal = new Calculator();
		System.out.println("5 * 3 = " + cal.mul(5, 3));
		System.out.println("5 + 3 = " + cal.add(5, 3));
		System.out.println("5 - 3 = " + cal.sub(5, 3));
		System.out.println("5 - 3 = " + ((Calculator)cal).div(5, 3));
		InterCalculator.print();		//인터페이스 이름으로만 접근가능
	}
}