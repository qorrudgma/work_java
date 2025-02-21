package chapter05_02;

interface PhoneInterface {
	/*
	 * 이것들을 강제로 다 만들어야함? 그럼 추상은? 추상으로 만들어도 어차피 다 만드는거아닌가? abstract 적은거만 강제고 아닌거는 그냥?
	 * 근데 인터페이스는? 인터페이스도 같은거아닌가? 인터페이스는 abstract가 기본이라서 그냥 다 해라 이건가 실행은 내가 정하는거지만
	 * 적는건 다 적어야한다.?
	 * 
	 */
//	public static final int TIMEOUT=100;
	final int TIMEOUT = 100; // 생략

//	public abstract void sendCall();
	void sendCall(); // 생략

//	public abstract void receibeCall();
	void receiveCall(); // 생략

//	default void printLogo(); default(일반메소드)는 구현해야한다
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	// 고유 기능
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

	public void doEverything() {
		printLogo();
		sendCall();
		receiveCall();
		flash();
	}

}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo(); // 인터페이스 상속받아서 사용
		phone.sendCall(); // 추상 메소드 구현해서 사용
		phone.receiveCall(); // 추상 메소드 구현해서 사용
		phone.flash(); // 고유 기능
		System.out.println();
		phone.doEverything();

	}
}