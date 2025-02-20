package chapter05;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent; // 다운캐스팅
			System.out.println("method1 - child 로 변환 성공");
		} else {
			System.out.println("method1 - child 로 변환 실패");
		}
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);

		Parent parentB = new Parent();
		method1(parentB);
	}
}