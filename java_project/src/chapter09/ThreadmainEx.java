package chapter09;

public class ThreadmainEx {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName(); // 현재 실행중인 스레드의 이름
		Long id = Thread.currentThread().getId(); // 현재 실행중인 스레드의 고유번호
		int priority = Thread.currentThread().getPriority(); // 현재 실행중인 스레드의 우선순위
		Thread.State s = Thread.currentThread().getState(); // 현재 실행중인 스레드의 상태 
		//RUNNABLE: 6가지 상태중 하나

		System.out.println("현재 스레드 이름: " + name);
		System.out.println("현재 스레드 ID: " + id);
		System.out.println("현재 스레드 우선순위 값: " + priority);
		System.out.println("현재 스레드의 상태: " + s);
	}
}