package question02;

import java.util.Scanner;

public class ExGlobalStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("매수금액을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int num2 = sc.nextInt();
		double num3 = 0;

		if (num1 < num2) {
			num3 = (num2 - num1) * 0.22;
		} else {
			num3 = 0;
		}
		System.out.println("양도세 = " + num3);
		sc.close();
	}
}
