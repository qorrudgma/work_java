package chapter02;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시간을 입력하세요: ");

		final int RATE = 10000;
		int hour = sc.nextInt();
		int pay;

		if (hour > 8) {
			pay = (int) (RATE * 8 + (RATE * (hour - 8) * 1.5));
		} else {
			pay = RATE * hour;
		}
		System.out.println("급여는 " + pay + "입니다.");

		sc.close();
	}
}