package question09;

class Circle {
	private int x, y, radius;

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle b = (Circle) obj;
		if (x == b.x && y == b.y) {
			return true;
		} else {
			return false;
		}
	}
}

public class CircleApp {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("a:" + a);
		System.out.println("b:" + b);

		if (a.equals(b)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}
}
