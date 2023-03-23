package day14;

class Outer {
	void pr() {
		System.out.println("Outer's pr() Method !!");
	}

	class Inner {
		void pr() {
			System.out.println("Inner's pr() Method !!");
		}
	}

	static class Static_Inner {
		void pr() {
			System.out.println("Static_Inner's pr() Method !!");
		}
	}
	
	static class Static_Inner2 {
		static void pr() {
			System.out.println("Static_Inner's pr() Method !!");
		}
	}
}

public class InnerTest1 {
	public static void main(String args[]) {
		new Outer.Static_Inner().pr();		
		Outer.Static_Inner2.pr();
		
		Outer o = new Outer();
		o.pr();
		Outer.Inner i = o.new Inner();
		i.pr();
	}
}
