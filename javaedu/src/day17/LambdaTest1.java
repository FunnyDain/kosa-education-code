package day17;

//함수형 인터페이스
interface Sample {
	int calc(int n);
}

class MyTest {
	static void pr(Sample p) {
		System.out.println(p.calc(10));
	}
}

public class LambdaTest1 {
	public static void main(String[] args) {
		class SampleImpl implements Sample {
			public int calc(int n) {
				return n + 1;
			}
		}
		Sample obj = new SampleImpl();
		MyTest.pr(obj);

		MyTest.pr(new Sample() {
			public int calc(int n) {
				return n + 10;
			}
		});

		MyTest.pr((int n) -> {
			return n + 100;
		});
		MyTest.pr((n) -> {
			return n + 100;
		});
		MyTest.pr(n -> {
			return n + 100;
		});
		MyTest.pr(n -> n + 100);
	}
}
