package day18;

interface ActionExpression {
	void exec(Object... param);		//... 가변, Object... 어떤 타입이든 가능
}

interface FuncExpression<T> {
	T exec(Object... param);		//무슨 타입을 리턴할지 모름 T 제네릭
}

public class LambdaTest12 {
	public static void test1(ActionExpression action) {
		action.exec("hello world");
	}

	public static void test2(FuncExpression<String> func) {
		String ret = func.exec("hello world","aa","111","가나다");
		System.out.println(ret);
	}

	public static void main(String[] args) throws Exception {
		test1(new ActionExpression() {
			public void exec(Object... data) {
				System.out.println("Test1 - " + data[0]);
			}
		});
		test2(new FuncExpression<String>() {  //변수 선언을 안했으므로 여긴서 <String> 생략못함
			public String exec(Object... data) {
				System.out.println(data[0]);
				return "OK1";
			}
		});

		test1((Object... data) -> System.out.println("Test2 - " + data[0]));

		test2((Object... data) -> {
			System.out.println(data[0]);
			return "OK2";
		});
		
		test1(data -> System.out.println("Test3 - " + data[0]));

		test2(data -> {
			System.out.println(data[0]);
			return "OK3";
		});
	}
}
