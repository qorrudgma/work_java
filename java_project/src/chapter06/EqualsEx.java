package chapter06;

class Point3 {
	private int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 이거 주석 했을때는 아래가 다르고 이거주석풀면 같다고나옴
	// 오버라이딩해서 객체의 값을 비교
	@Override
	public boolean equals(Object obj) { // 업
		Point3 p = (Point3) obj; // 다운
		if (x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);

		if (a == b) { // a와b가 다르다
			System.out.println("a == b");
		} else {
			System.out.println("a != b");
		}

		// equals: 기본은 객체 비교
		if (a.equals(b)) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is equal not to b");
		}

		if (a.equals(c)) {
			System.out.println("a is equal to c");
		} else {
			System.out.println("a is equal not to c");
		}
	}
}