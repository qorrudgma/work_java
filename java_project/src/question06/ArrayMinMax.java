package question06;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양수 10개를 입력하세요.");
		int max = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("가장 작은 수는 " + min + "이고, 가장 큰 수는 " + max + "이고,");
		System.out.println("최소값+최댓값은 " + (min + max) + "입니다.");

		sc.close();
	}
}