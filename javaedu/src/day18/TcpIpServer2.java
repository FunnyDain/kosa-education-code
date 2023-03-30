package day18;
import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class TcpIpServer2 {
	public static void main(String args[]) {
		ServerSocket serverSocket = null;
		try {
			// 서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"서버가 준비되었습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				// 서버소켓
				System.out.println(getTime()+"연결요청을 기다립니다.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+ socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				
				System.out.println("getPort():"+socket.getPort());
                System.out.println("getLocalPort():" +socket.getLocalPort());

				// 소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);

				// 원격 소켓(remote socket)에 데이터를 보낸다.
				osw.write("[서버로부터의 공지] 어서요세용... "+socket.getInetAddress()+"님....");
				System.out.println(getTime()+"데이터를 전송했습니다.");

				// 스트림과 소켓을 닫아준다.
				osw.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	} 
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
} 
