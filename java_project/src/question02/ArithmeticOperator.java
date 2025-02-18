package question02;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요:");
		int time = sc.nextInt();
		int h = time / 3600;
		int m = (time / 60) % 60;
		int s = time % 60;

		System.out.print("정수를 입력하세요:");
		int s = sc.nextInt();
		int m = s / 60;
		int h = m / 60;

		if (s < 60) {
			System.out.println(s + "초는" + s + "초입니다.");
		} else if (m < 60) {
			System.out.println(s + "초는" + m + "분, " + s + "초입니다.");
		} else {
			System.out.println(s + "초는" + h + "시간, " + m + "분, " + s + "초입니다.");
		}
		sc.close();
	}
}