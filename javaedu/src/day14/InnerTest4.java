package day14;

interface Testable {
	final static String FS = "Interface Test";

	abstract void output(String s);
}

public class InnerTest4 {
	void pr(Testable o) {
		o.output("Test");
		System.out.println(Testable.FS);		//4.
		// System.out.println(o.su); // 자손에서 추가된 멤버는 접근할 수 없다.
	}

	public static void main(String args[]) {
		System.out.println("Main start !!");		//1.
		InnerTest4 n = new InnerTest4();
		// 이 이름 없는 Inner 클래스는 Testable 와 Object 의 자손이 된다.
		// Testable을 상속하는 것
		n.pr(new Testable() {
			int su = 100;

			//output을 구현하지 않으면 안됨_overriding
			public void output(String s) {
				System.out.println("Anonymous Class : " + s);		//2.
				System.out.println("Anonymous Class : " + su);		//3.
			}
		});
	}
}
