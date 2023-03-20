package day11;

import java.util.HashMap;

public class HashMapExample1 {
	public static void main(String args[]) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("해리", Integer.valueOf(95));
		map.put("헤르미온느", 100);
		map.put("론", 85);
		map.put("드레이코", 93);
		map.put("네빌", 70);
		map.put("헤르미온느", 55); // JDK 1.5 Auto Boxing 구문
		//총 6개
		System.out.println(map);
		Integer num = map.get("헤르미온느");
		System.out.println("헤르미온느의 성적은? " + num);
		System.out.println(map);
	}
}
