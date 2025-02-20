package chapter05;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override // 오버라이딩(void: 리턴타입 일치, draw: 메소드명 일치, 매개변수 없는거 일치)
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEX {
	// 여기다 적는이유?
	static void paint(Shape p) {
		// Shape p = new Line(); upcasting
		// 업캐스팅에 의해서 슈처클래스의 드로우 메소드로 갔다가 오버라이딩 되서 라인으로 간다.
		// 동적 바인딩
		p.draw();
	}

	public static void main(String[] args) {
//		Line line = new Line();
//		paint(line);
		paint(new Line()); // 위에 두줄을 한줄로 적음

//		Shape shape = new Shape();
//		paint(shape);
		paint(new Shape()); // 위에 두줄을 한줄로 적음

		paint(new Rect());
		paint(new Circle());
	}
}