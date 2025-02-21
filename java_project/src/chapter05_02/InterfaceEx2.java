package chapter05_02;

import java.util.Scanner;

interface PhoneInterface2 {
	final int TIMEOUT = 100;

	void sendCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("** Phone **");
	}
}

// 인터페이스 간의 상속 => extends 사용
// 클래스와 인터페이스 => implements 사용
interface MobilePhoneInterface extends PhoneInterface2 {
	void sendSMS();

	void receiveSMS();
}

interface MP3Interface {
	void play();

	void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요.");
	}

	public void schedule() {
		System.out.println("일정 관리 합니다.");
	}

	public void call() {
		sendCall();
		receiveCall();
	}

	public void sns() {
		sendSMS();
		receiveSMS();
	}

	public void mp3() {
		play();
		stop();
	}

	public void calc() {
		System.out.println(calculate(3, 8));
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SmartPhone phone = new SmartPhone();

		phone.sns();
		phone.sns();
		phone.sns();

		System.out.println(phone.calculate(3, 8));
		phone.calc();
		phone.schedule();

		sc.close();
	}
}