package question02;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score, year;

		while (true) {
			System.out.print("점수를 입력하세요(0~100): ");
			score = sc.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수를 다시 입력해주세요.");
				continue;
			}
			System.out.print("학년을 입력하세요(1~4): ");
			year = sc.nextInt();
			if (year < 1 || year > 4) {
				System.out.println("점수를 다시 입력해주세요.");
				continue;
			}
			break;
		}
		if (year == 4) {
			if (score >= 70) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
			}
		} else {
			if (score >= 65) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
			}
		}

//		if (year == 4) {
//			if (score >= 70) {
//				System.out.println("합격!");
//			} else {
//				System.out.println("불합격!");
//			}
//		} else {
//			if (score >= 65) {
//				System.out.println("합격!");
//			} else {
//				System.out.println("불합격!");
//			}
//		}
		sc.close();
	}
}
