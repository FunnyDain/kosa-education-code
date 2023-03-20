package day11;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("java");
//		list.add(100);		//Integer로 저장됨
		list.add("servlet");
		list.add("jdbc");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		for (String value : list) {
			System.out.println(value);
		}
		System.out.println();

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
}
