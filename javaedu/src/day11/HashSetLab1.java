package day11;

import java.util.HashSet;
import java.util.Set;

public class HashSetLab1 {
	
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			if(set.add((int)(Math.random()*21)+10)) {
				
			}else {
				i--;
			}
		}
		int count = 0;
		System.out.print("오늘의 로또 번호 : ");
		for (Integer i : set) {
			count++;
			
			if(count == 10)
				System.out.print(i);
			else
				System.out.print(i + ", ");
				
		}
	
		

	}

}
