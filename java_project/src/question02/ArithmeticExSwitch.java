package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("연산>>");
		int num1 = sc.nextInt();
		String txt = sc.next();
		int num2 = sc.nextInt();
		int result = 0;

		switch (txt) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 + num2;
			break;
		case "*":
			result = num1 + num2;
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				sc.close();
				return;
			} else {
				result = num1 / num2;
			}
			break;
		default:
			System.out.println("사칙연산이 아닙니다.");
			return;
		}
		System.out.println(num1 + txt + num2 + "의 계산 결과는 " + result);
	}
}