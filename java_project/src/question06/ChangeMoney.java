package question06;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		int res, money;
		System.out.print("금액을 입력하세요>>");
		money = sc.nextInt();

		// 다시 확인
//		for (int i = 0; i < unit.length; i++) {
//			res = money / unit[i];
//			if (res > 0) {
//				System.out.println(unit[i + 1] + "원 짜리" + res + "매");
//				money = money % unit[i];
//			}
//		}

		res = money / unit[0];
		if (res > 0) {
			System.out.println(unit[0] + "원 짜리" + res + "매");
		}
		for (int i = 0; i < unit.length - 1; i++) {
			money = money % unit[i];
			res = money / unit[i + 1];
			if (res > 0) {
				System.out.println(unit[i + 1] + "원 짜리" + res + "매");
			}
		}
		sc.close();
	}
}