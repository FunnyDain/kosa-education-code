package day17;

class ThreadEx15 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx15());
		t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다.
		t.start();			//run메서드 호출

		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(2000);		//2초 동안 쉬었다가
			} catch (InterruptedException e) {
			}
			System.out.println(i);			//20까지 출력 

			if (i == 5)
				autoSave = true;
		}

		System.out.println("프로그램을 종료합니다.");		//setDaemon이 없다면, 자식스레드가 죽지 않아서 main스레드도 죽지 않음
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000); // 3초마다
			} catch (InterruptedException e) {
			}

			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if (autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
