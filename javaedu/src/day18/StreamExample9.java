package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample9 {
	public static void main(String[] args) {
		// 문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(System.out::println);		//공백 문자를 기준으로 flatMap
//		flatMap, 다시 말해 중복된 스트림을 1차원으로 평면화 시키는 메서드
//		stream안에 또 스트림(Arrays.stream())을 1차원으로, element들로 나옴
//		flatMap을 map으로도 출력해보기

		System.out.println();

		// 문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream().flatMapToInt(data -> {		//int
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(number -> System.out.println(number));
	}
}