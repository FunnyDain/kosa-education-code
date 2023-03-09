package day4;

import java.util.Iterator;

public class ArrayLab3 {


	public static void main(String[] args) {
//		[ 실습 3 ]
//		1. ArrayLab3 라는 클래스를 하나 만든다.
//		2. 'J', 'a', 'v', 'a' 라는 element 로 구성되는 char 타입의 배열을 만든다.
//		3. 각 원소들의 값에서 대문자는 소문자로 소문자는 대문자로 변환하여 저장한다.
//		4. 배열의 element 들을 다음과 같이 출력한다.
//		     j
//		    A
//		    V
//		    A
		//2
		char[] ary = {'J', 'a', 'v', 'a'};
		
		//3,4 방법1
//		for (int i = 0; i < ary.length; i++) {
//			if(Character.isLowerCase(ary[i])) {
//				ary[i] = Character.toUpperCase(ary[i]);
//			}else {
//				ary[i] = Character.toLowerCase(ary[i]);				
//			}
//			System.out.println(ary[i]);
//		}
		
		//3,4 방법2
		for (int i = 0; i < ary.length; i++) {
			if(ary[i]>='A'&& ary[i]<='Z') {
				ary[i] += 32;
			}else if(ary[i]>='a'&& ary[i]<='z'){
				ary[i] -= 32;				
			}
		}
		
		for(char c : ary) {
			System.out.println(c);
		}
		
	}

	
	
}
