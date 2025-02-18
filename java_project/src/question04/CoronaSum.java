package question04;

import java.util.Scanner;

public class CoronaSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int num[][] = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 }, { 41, 42, 43 }, { 51, 52, 53 }, { 61, 62, 63 },
//				{ 71, 72, 73 }, { 81, 82, 83 }, { 91, 92, 93 }, { 101, 102, 103 }, { 111, 112, 113 },
//				{ 121, 122, 123 } };

		int num[][] = new int[12][3];
		int sum = 0;
		while (true) {
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					try {
						System.out.print((i + 1) + "월 " + (j + 1) + "번 도시에 발생한 코로나 환자수>>");
						num[i][j] = sc.nextInt();
						sum += num[i][j];
					} catch (Exception e) {
						System.out.println("숫자가 아님");
						j--;
						sc.next();
						continue;
					}
				}
				System.out.println();
			}
			System.out.println("1년 전체 코로나 환자수는 " + sum);
			break;
		}
		sc.close();
	}
}