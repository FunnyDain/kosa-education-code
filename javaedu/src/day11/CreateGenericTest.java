package day11;

import java.util.Date;

public class CreateGenericTest {

	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.put("다다인멋져");
		String s1 = v1.get();
		System.out.println(s1);

		Value2 v2 = new Value2();
		v2.put("다인멋져");
		String s2 = (String)v2.get();
		System.out.println(s2);
		v2.put(new Date());
		Date d1 = (Date)v2.get();
		System.out.println(d1);
		
		Value3<String> v3 = new Value3<String>();
		v3.put("다인멋져");
		String s3 = v3.get();
		System.out.println(s3);
		Value3<Date> v4 = new Value3<>();
		Date d2 = v4.get();
		System.out.println(d2);
		
	}

}

class Value1{
	//기본생성자이므로 obj null값
	//String객체만 생성 가능
	String obj;
	void put(String obj) {
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}

class Value2{
	//기본생성자이므로 obj null값
	//어떤 타입의 객체든 생성 가능
	//String객체만 생성 가능
	Object obj;
	void put(Object obj) {
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}

//형변환 안해도 됨
class Value3<T>{
	T obj;
	void put(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}