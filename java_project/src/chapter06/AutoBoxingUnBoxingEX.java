package chapter06;

public class AutoBoxingUnBoxingEX {
	public static void main(String[] args) {
		int n = 10;
		// n을 값으로 가지는 객체 생성
		Integer intobject = Integer.valueOf(n); // boxing
		Integer intobject2 = n; // auto boxing
		System.out.println("intobject = " + intobject);
		System.out.println("intobject2 = " + intobject2);

//		int m = intobject.intValue() + intobject.intValue(); // unboxing
		int m = intobject + intobject; // auto unboxing
		System.out.println(m);
	}
}