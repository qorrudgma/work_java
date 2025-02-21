package chapter05_01;

public class Main {
	public static void main(String[] args) {
//		new Animal(); 추상클래스라 객체 생성 안됌
//		new Bird();
		Animal a; // 선언은 가능
		Penguin p = new Penguin();
		p.swim(); // 멤버 5개중 하나 선택함

		Bird p2 = new Penguin(); // upcasting
//		p2.swim(); upcasting은 슈퍼클래스의 멤버만 접근 가능
		p2.walk();
		Penguin p3 = (Penguin) p2; // downcasting
		p3.swim();

		Bird d = new Duck(); // upcasting
		d.eat(); // 슈퍼클래스에있어서 사용가능
		Duck d2 = (Duck) d; // downcasting
		d2.fly(); // 다운캐스팅으로 모든 멤버 접근가능

		Animal d3 = new Duck(); // 추상클래스를 참조변수 선언
		int x = d3.life;
		System.out.println("x=> " + x);

//		new Swim2(); // 인터페이스는 객체 생성 못한다.
		Swim2 s = new Penguin(); // 인터페이스를 참조변수 선언

		// 인터페이스가 인터페이스 배열 2개를 가리킨다.
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin(); // s[0]=>참조변수
		s2[1] = new Duck(); // s[1]=>참조변수
		s2[0].swim();
		s2[1].swim();
		s2[2] = new Penguin(); // 컴파일 단게는 알수 없고, 런타임 실행시 오류발생
	}
}