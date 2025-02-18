package chapter04;

public class Circle2 {
	int radius; // 4. 반지름을 1로한다
	String name;

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public Circle2() { // 2. 생성자 호출됨
		radius = 1; // 3. radius = 1
		name = "";
	}

	// 매개변수와 멤버변수가 같을때 this 사용하면 경고창 없애줌
	public Circle2(int radius, String n) {
		this.radius = radius;
		name = n;
	}

	public static void main(String[] args) {
//		Circle2 pizza; // pizza 참조변수
//		new Circle2(); // 객체 생성하면서 생성자 호출(기본 생성자가 없으면 자동으로 생성해서 호출)
		// 기본생성자가 없지만 17줄이있으면 호출한건있는데 없기때문에 안됌 생성하려면 아무것도 없어야함
		// 호출해서 위에 11줄로가고 반지름을 1로하고 이름은 없는 상태로 만든다

		// 1. 객체 생성하면서 생성자 호출
//		Circle2 pizza = new Circle2();
//		double area = pizza.getArea();
//
//		System.out.println(area);

//		new Circle2(10); // 매개변수 하나짜리 생성자는 없어서 오류
		Circle2 pizza = new Circle2(10, "자바피자"); // 선언?객체 생성?
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle2 donut = new Circle2(2, "도넛");
		area = donut.getArea();
		System.out.println(donut.name + "의 크기는 " + area);
	}
}