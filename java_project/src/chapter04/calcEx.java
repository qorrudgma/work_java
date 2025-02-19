package chapter04;

class Calc {
//	non static(인스턴스) 멤버는 객체 생성해야 사용가능
//	public int abs(int a) {
	public static int abs(int a) {
		return a > 0 ? a : -a;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}
}

public class calcEx {
	public static void main(String[] args) {

		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(10, 8));

	}
}