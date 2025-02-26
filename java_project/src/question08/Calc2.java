package question08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

abstract class Calculator {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("두 정수와 연산자를 입력하시오>>");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		String a = st.nextToken();

		Calculator calc;

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
			br.close();
			return;
		}
		calc.setValue(num1, num2);
		if (calc instanceof Div2 && num2 == 0) {
			bw.write("계산할수 없습니다.\n");
		} else {
			bw.write(Integer.toString(calc.calculate()));
		}
		bw.flush();

		bw.close();
	}
}