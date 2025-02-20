package chapter05;

class Point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // 객체를 생성, 멤버는 4개, 생성자 호출(기본)
		p.set(1, 2);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
		cp.setColor("red");
		cp.showColorPoint();
	}
}
