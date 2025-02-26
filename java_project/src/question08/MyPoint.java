package question08;

public class MyPoint {
	private int x, y;
//	int x;
//	int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p.toString());

		if (p.equals(q)) {
			System.out.println("같은점");
		} else {
			System.out.println("다른점");
		}
	}
}