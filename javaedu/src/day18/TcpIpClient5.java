package day18;
import java.net.*;
import java.io.*;

public class TcpIpClient5 {
	public static void main(String args[]) {
		try {
			String serverIp = "192.168.3.119";
                     // 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIp, 8888); 
			System.out.println("[ 메시지 송수신 서버에 연결되었습니다. ]");			
		
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {  
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();  
		}  
	} 
} 