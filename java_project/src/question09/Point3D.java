package question09;

public class Point3D {
	int x;
	int y;
	int z;

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void move(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveUp() {
//		this.z = z + 1;
		z++;
	}

	public void moveDown() {
//		this.z = z - 1;
		z--;
	}

	@Override
	public String toString() {
		return ("(" + x + "," + y + "," + z + ")의 점");
	}

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
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