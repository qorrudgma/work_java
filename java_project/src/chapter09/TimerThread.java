package chapter09;

public class TimerThread extends Thread {
	int n = 0;

	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000); // 1초마다 실행
			} catch (InterruptedException e) {
				e.printStackTrace(); // printStackTrace: 메소드로 예외 처리 기본 메시지를 출력
			}
		}
	}
}