package question08;

import java.util.Scanner;

class Add {
	int calculate(int x, int y) {
		return y + x;
	}
}

class Sub {
	int calculate(int x, int y) {
		return y - x;
	}
}

class Mul {
	int calculate(int x, int y) {
		return y * x;
	}
}

class Div {
	int calculate(int x, int y) {
		return y / x;
	}
}

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String n = sc.next();

		if (n.equals("+")) {
			Add add = new Add();
			int r = add.calculate(num1, num2);
			System.out.print(r);
		} else if (n.equals("-")) {
			Sub sub = new Sub();
			int r = sub.calculate(num1, num2);
			System.out.print(r);
		} else if (n.equals("*")) {
			Mul mul = new Mul();
			int r = mul.calculate(num1, num2);
			System.out.print(r);
		} else if (n.equals("/")) {
			Div div = new Div();
			int r = div.calculate(num1, num2);
			System.out.print(r);
		}
		sc.close();
	}
}