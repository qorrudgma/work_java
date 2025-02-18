package question03;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int ten;
		int one;

		while (true) {
			while (true) {
				System.out.print("10~99 사이의 정수를 입력하시오: ");
				num = sc.nextInt();
				if (num < 10 || num > 100) {
					System.out.println("숫자 범위를 확인해주세요(10~99)");
					continue;
				}
				break;
			}
			ten = num / 10;
			one = num % 10;

			if (num / 10 == 0) {
				System.out.println("없다 배의 배수");
			} else {
				if (ten % 3 == 0) {
					if (one % 3 == 0) {
						System.out.println("박수짝짝");
					} else {
						System.out.println("박수짝");
					}
				} else {
					if (one % 3 == 0) {
						System.out.println("박수짝");
					} else {
						System.out.println("없다");
					}
				}
			}
			sc.close();
		}
	}
}