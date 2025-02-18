package question03;

import java.util.Scanner;

public class Multiple_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		boolean multiple = true;
		// 카운트 세개를 만들어서 함

		while (multiple) {
			System.out.print("양의 정수를 입력하세요: ");
			num = sc.nextInt();
			if (num % 3 == 0) {
				System.out.println("3의 배수이다.");
				multiple = true;
			}
			if (num % 5 == 0) {
				System.out.println("5의 배수이다.");
				multiple = true;
			}
			if (num % 8 == 0) {
				System.out.println("8의 배수이다.");
				multiple = true;
			}
			System.out.println();
			if (num % 3 != 0 && num % 5 != 0 && num % 8 != 0) {
				System.out.println("어느 배수도아니다.");
				multiple = false;
			}
			if (multiple = false) {
				System.out.println("어느 배수도아니다.");
				multiple = false;
			}

		}

		sc.close();
	}

}
