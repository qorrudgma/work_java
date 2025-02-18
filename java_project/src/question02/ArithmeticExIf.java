package question02;

import java.util.Scanner;

public class ArithmeticExIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("연산>>");
		int num1 = sc.nextInt();
		String txt = sc.next();
		int num2 = sc.nextInt();
		int result = 0;

		if (txt.equals("+")) {
			result = num1 + num2;
		} else if (txt.equals("-")) {
			result = num1 - num2;
		} else if (txt.equals("*")) {
			result = num1 * num2;
		} else if (txt.equals("/")) {
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				sc.close();
				return;// 프로그램 종료 근데 스캐너를 안받으면 경고뜸
			} else {
				result = num1 / num2;
			}
		} else {
			System.out.println("사칙연산이 아닙니다.");
			return;
		}
		System.out.println(num1 + txt + num2 + "의 계산 결과는 " + result);
	}
}