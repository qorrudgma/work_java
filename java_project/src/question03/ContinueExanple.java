package question03;

import java.util.Scanner;

public class ContinueExanple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, sum = 0;
		System.out.println("정수를 5개 입력하세요.");
		for (int i = 0; i < 5; i++) {
			a = sc.nextInt();
			if (a > 0) {
				sum += a;
			}
		}
		System.out.println("양수의 합은 " + sum);
		sc.close();
	}
}