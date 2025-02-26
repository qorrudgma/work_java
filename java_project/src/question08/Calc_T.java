package question08;

import java.util.Scanner;

class Add3 {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a + b;
	}
}

class Sub3 {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a - b;
	}
}

class Mul3 {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a * b;
	}
}

class Div3 {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		int res = 0;
		try {
			res = a / b;
		} catch (Exception e) {
			System.out.println("0 으로 나눌 수 없습니다.");
		}
		return res;
	}
}

public class Calc_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String a = sc.next();

		Calculator calc = null;

		switch (a) {
		case "+":
			calc = new Add2();
			break;
		case "-":
			calc = new Sub2();
			break;
		case "*":
			calc = new Mul2();
			break;
		case "/":
			calc = new Div2();
			break;
		default:
			System.out.println("지원하지 않는 연산자입니다.");
			sc.close();
			return;
		}
		// 다시해야함
		System.out.println(calc.calculate());

		sc.close();
	}
}