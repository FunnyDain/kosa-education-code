package day17;

public class ThreadEx14 {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		//1초후에 main실행
		thread.interrupt();
	}
}

class PrintThread2 extends Thread {
	public void run() {
		while (true) {
			System.out.println("실행 중");
			if (Thread.interrupted()) {		//return값 true
				//해야할 자원정리가 있다면 여기에서
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
