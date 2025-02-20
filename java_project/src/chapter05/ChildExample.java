package chapter05;

public class ChildExample extends Parent {
	public static void main(String[] args) {
		// parent 클래스에 기본 생성자 만들어서 호출하고,
		// chld 클래스에 기본 생성자 만들어서 호출
		Parent parent = new Child(); // upcasting(super class 타입으로 sub class 객체 생성)
		parent.field1 = "date1";
//		parent.field2 = "date2"; // upcasting 된 객체는 서브클래스 멤버 접근 불가

		parent.method1();
		parent.method2();
//		parent.method3(); // upcasting 된 객체는 서브클래스 멤버 접근 불가

		Child child = (Child) parent; // down casting
		// down casting 객체는 서브클래스 멤버 접근 가능
		child.field2 = "yyy";
		child.method3();
	}
}