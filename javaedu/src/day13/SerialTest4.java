package day13;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
import day6.Student2;

public class SerialTest4 {
   public static void main(String[] args) throws Exception{ 
	   
	   //static 제외 멤버변수 값을 바이트 값을 보여주는 게 직렬화
	   //+ 클래스 이름
      FileInputStream fis = 
    		  new FileInputStream("c:/iotest/test2.ser"); 
      ObjectInputStream ois = new ObjectInputStream(fis); 
      Date value1 = (Date)ois.readObject();
      Date value2 = (Date)ois.readObject();
      Student2 st = (Student2)ois.readObject();
      System.out.println("Date객체 데이터 : " + value1); 
      System.out.println("Date객체 데이터 : " + value2); 
      System.out.println("Student객체 데이터 : ");
      st.printStudentInfo();
      ois.close();
      fis.close();
   }
}



