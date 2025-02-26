package question09;

class Point2 {
	private int x, y;

	public Point2(int x, int y) {
		this.x = 1;
		this.y = 2;
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

public class ColorPoint_T extends Point2 {
	String color;

	public ColorPoint_T(int x, int y, String color) {
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
		ColorPoint_T cp = new ColorPoint_T(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}