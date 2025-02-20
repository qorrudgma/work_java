package chapter06;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	// 매개변수로 객체를 받는다
	public static void print(Object obj) { // Object obj=new Point(2,3); 업캐스팅
		// 실행중인 클래스
		System.out.println(obj.getClass());
		System.out.println(obj.getClass().getClass());
		System.out.println(obj.hashCode()); // 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString()); // 패키지.클래스@16진수 해시코드
		System.out.println(obj); // 위랑같음
	}

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}
}