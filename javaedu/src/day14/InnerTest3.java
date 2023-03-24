package day14;

abstract class Test {
	Test() {
		System.out.println("No Argument sample");
	}
	abstract void output(String s);
}


public class InnerTest3 {
	void pr(Test o) {
		o.output("Test");
	}

	public static void main(String args[]) {
		System.out.println("Main start !!");		//1. 
		InnerTest3 n = new InnerTest3();
		
		//추상클래스는 원래 객체 생성함 익명객체가 Test의 자식이 된 것임
		//익명객체가 생성되기전에 그 부모인 Test클래스의 객체도 생성되기 때문에 "No Argument sample"먼저 호출됨
		n.pr(new Test() {		//new Test() : 익명 객체
			int su = 100;

			//추상클래스이기 때문에 구현_overriding
			public void output(String s) {
				System.out.println("Anonymous Class : " + s);
				System.out.println("Anonymous Class : " + su);
			}
		});
	}
}
