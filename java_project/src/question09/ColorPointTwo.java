package question09;

class PointTwo {
	private int x, y;

	public PointTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPointTwo extends PointTwo {
	String color;

	public ColorPointTwo() {
		super(0, 0);
		this.color = "BLACK";
	}

	public ColorPointTwo(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	@Override
	public String toString() {
		return (color + "색의 (" + getX() + "," + getY() + ")의 점");
	}

	private void setColor(String string) {
		this.color = string;
	}

	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPointTwo cp = new ColorPointTwo(10, 10, "YELLOW");
		cp.setXY(5, 5);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}