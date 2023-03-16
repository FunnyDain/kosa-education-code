package day9;

public class TimeTest { 
      public static void main(String[] args) { 
            Time t = new Time(12, 35, 30); 
            System.out.println(t); 
            t.hour = 30;
            System.out.println(t); 
            t.minute = -10;
            System.out.println(t); 
      } 
}

//default : 동일한 패키지 내에서만 접근가능, 기본
//public > protected > default > private
class Time { 
      int hour; 
      int minute; 
      int second; 

      Time(int hour, int minute, int second) { 
            this.hour = hour; 
            this.minute = minute; 
            this.second =second; 
      } 

      public String toString() { 
//    	  printf = 화면을 내보내기만 해서, 다른 곳에 쓸 수 없음
    	  return String.format("%d시 %d분 %d초", hour, minute, second); // System.out.printf() - 화면으로 출력, 문자열로 return하는 메서드
      } 
} 