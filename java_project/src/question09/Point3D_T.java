package question09;

public class Point3D_T extends Point2 {
	int x;
	int y;
	int z;

	public Point3D_T(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}

	public void moveUp() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	@Override
	public String toString() {
		return ("(" + x + "," + y + "," + z + ")의 점");
	}

	public static void main(String[] args) {
		Point3D_T p = new Point3D_T(1, 2, 3);
		System.out.println(p.toString() + "입니다.");

		p.moveUp();
		System.out.println(p.toString() + "입니다.");

		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");

	}

}