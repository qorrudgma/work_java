package chapter09;

public class TestThread {
	public static void main(String[] args) {
		// 스레드 객체 생성
		TimerThread th = new TimerThread();
		// 스레드 샐행되면서 JVM 스케줄링
		th.start();
	}
}
