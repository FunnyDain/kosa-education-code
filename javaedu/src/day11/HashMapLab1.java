package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapLab1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("나라이름을 입력하세요: ");
			String country = sc.next();
			System.out.println("인구 수를 입력하세요: ");
			Integer countryNum = sc.nextInt();
				if(map.containsKey(country)) {
					System.out.printf("나라명 %s는 이미 저장되었습니다\n", country);			
					i--;
				}else {
					map.put(country, countryNum);
					System.out.println("저장 되었습니다.\n");
				}

		}
		System.out.print("5개가 모두 입력되었습니다.\n입력된 데이터 : ");
		
		int count = 0;
		for (Entry<String, Integer> entrySet : map.entrySet()) {
			count++;
			if(count == 5)
				System.out.print(entrySet.getKey() + "(" + entrySet.getValue() + ") ");
			else
				System.out.print(entrySet.getKey() + "(" + entrySet.getValue() + "), ");
		}
		
		sc.close();
			
	}

}
