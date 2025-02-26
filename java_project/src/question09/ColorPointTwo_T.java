package question09;

class PointTwo2 {
	private int x, y;

	public PointTwo2(int x, int y) {
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

public class ColorPointTwo_T extends PointTwo2 {
	String color;

	public ColorPointTwo_T() {
		this(0, 0);
	}

	public ColorPointTwo_T(int x, int y) {
		super(y, x);
		this.color = "BLACK";
	}

	public ColorPointTwo_T(int x, int y, String color) {
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
		ColorPointTwo_T zeroPoint = new ColorPointTwo_T();
		System.out.println(zeroPoint.toString() + "입니다.");

		ColorPointTwo_T cp = new ColorPointTwo_T(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}