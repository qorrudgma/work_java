package package11;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	// 매개변수 갯수는 같아도 타입이 달라서 가능 (오버로딩)
	public A(boolean b) {
	}

	A(int b) { // default 접근 지정자
	}

//	private A(String s) { // private 접근 지정자 (본인 클래스만 가능)
	A(String s) {
	}
}