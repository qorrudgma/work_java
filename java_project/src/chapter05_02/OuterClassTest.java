package chapter05_02;

class OuterClass {
	private String secret = "Time is money";
//	public String secret = "Time is money";

	public OuterClass() {
//		new InnerClass();
//		InnerClass obj = new InnerClass();
//		obj.method();
		new InnerClass().method();
	}

	public class InnerClass { // 내부, 중첩, inner 클래스
		public InnerClass() {
			System.out.println("내부 클래스이 생성자 입니다.");
		}

		public void method() {
			System.out.println(secret);
		}
	}
}

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
//		new InnerClass(); // 내부클래스 접근 불가

//		외부에서는 외부의 private을 접근 못하지만 내부는 private 에 접근 가능
//		outer.secret = ""; // private 일때는 접근 불가

	}
}