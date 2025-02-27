package question09;

class Circle2 implements Shape {
	int r;

	public Circle2(int r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + r + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return r * r * PI;
	}
}

class Oval implements Shape {
	int x;
	int y;

	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		return x * 0.5 * y * 0.5 * PI;
	}
}

class Rect implements Shape {
	int x;
	int y;

	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(x + "x" + y + "크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		return x * y;
	}
}

public class Shapes2 {
	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle2(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);

		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}
}