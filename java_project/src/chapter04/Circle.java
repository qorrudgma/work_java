package chapter04;

public class Circle {
	// 맴버변수(필드)
	int radius;
	String name;

	// 오버로딩 같은 클래스를 여러개 만드는거(매개변수의 갯수가 다르면 여러개 만들기 가능)
	public Circle() {
	} // {} 클래스하고 이름이 똑같은 메소드: 생성자(기본)

	public Circle(int a) {
	} // 클래스하고 이름이 똑같은 메소드: 생성자(매개변수 1개)

//	public Circle(int a, int b) {} // 클래스하고 이름이 똑같은 메소드: 생성자(매개변수 2개)

	public Circle(int a, int c) {// 매개변수가 달라도 갯수가 같으면 안됌
	} // 클래스하고 이름이 똑같은 메소드: 생성자(매개변수 2개)

	public double getArea() {// 맴버함수(매소드)
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle pizza; // 참조변수 선언(태명과 비슷), Circle 이 클래스(객체를 생성하는 틀/판)
//		new Circle(); // 이름이 없는 Circle
		pizza = new Circle(); // 객체생성 이름이 pizza
		pizza.radius = 10; // 멤버변수 값 셋팅

		pizza.name = "자바피자"; // 멤버변수 값 셋팅
		double area = pizza.getArea(); // 멤버함수 호출

		System.out.println(pizza.name + "의 면적은 " + area); // 멤버변수 값 사용

		Circle donut = new Circle();

		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();

		System.out.println(donut.name + "의 면적은 " + area);

	}
}