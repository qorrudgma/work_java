package chapter04;

class Circle3 { // 동일한 package에 동일한 class이름이면 오류
	int radius;

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public Circle3(int radius) {
		this.radius = radius;
	}
}

class Circle4 {
}

class Circle5 {
}

class Circle6 {
}

//public class Circle7 {} public 2개 이상은 오류

public class CircleArray {
	public static void main(String[] args) {

//		Circle3[] c; // 객체배열 Circle3을 참조변수 c로 선언
//		c = new Circle3[5];

		Circle3 c[] = new Circle3[5];

		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle3(i);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
		}
	}
}