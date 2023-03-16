package day9;
import java.net.*;
public class InetAddressTest {
	public static void main(String[] args) throws Exception {
		
		//ip주소를 얻기 위한 객체 생성 InetAddress
		//생성자가 아닌 팩토리 메서드 static getLocalHost()를 사용하도록 설계함
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet);
		inet = InetAddress.getByName("www.naver.com");
		System.out.println(inet);
		
	}
}
