package question04;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int num1, num2, num3, num4, num5, num6, num7;

		if (num / 50000 > 0) {
			num1 = num / 50000;
			System.out.println("오만원권" + num1 + "매");
		}
		if (num / 10000 > 0 && num / 10000 < 5) {
			num2 = num / 10000;
			System.out.println("만원권" + num2 + "매");
		}
		if ((num % 10000) / 1000 > 0) {
			num3 = (num % 10000) / 1000;
			System.out.println("천권" + num3 + "매");
		}
		if ((num % 1000) / 100 > 0) {
			num4 = (num % 1000) / 100;
			System.out.println("qordnj권" + num4 + "매");
		}

		sc.close();
	}
}