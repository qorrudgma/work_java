package question03;

import java.util.Scanner;

public class ThreeSixNine_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, ten, one, count = 0;

		System.out.print("10~99 사이의 정수를 입력하시오: ");
		num = sc.nextInt();

		ten = num / 10;
		one = num % 10;

		if (ten % 3 == 0) {
			count++;
		}
		if (one % 3 == 0 && one != 0) {
			count++;
		}
		if (count == 2) {
			System.out.println("박수짝짝");
		} else if (count == 1) {
			System.out.println("박수짝");
		} else {
			System.out.println("없음");
		}
		sc.close();
	}
}
