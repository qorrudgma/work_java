package question08;

import java.util.Scanner;

abstract class Calculator {
	int a;
	int b;

	void setValue(int x, int y) {
		a = x;
		b = y;
	}

	abstract int calculate();
}

class Add2 extends Calculator {
	@Override
	int calculate() {
		return a + b;
	}
}

class Sub2 extends Calculator {
	@Override
	int calculate() {
		return a - b;
	}
}

class Mul2 extends Calculator {
	@Override
	int calculate() {
		return a * b;
	}
}

class Div2 extends Calculator {
	@Override
	int calculate() {
		return a / b;
	}
}

public class Calc2 {
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
		calc.setValue(num1, num2);
		System.out.println(calc.calculate());

		sc.close();
	}
}