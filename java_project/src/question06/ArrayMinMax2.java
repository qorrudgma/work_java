package question06;

import java.util.Scanner;

public class ArrayMinMax2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양수 10개를 입력하세요.");
		int max = 0;
		int min = Integer.MAX_VALUE;

		int numarr[] = new int[10];

		for (int i = 0; i < 10; i++) {
			numarr[i] = sc.nextInt();
			if (numarr[i] > max) {
				max = numarr[i];
			}
			if (numarr[i] < min) {
				min = numarr[i];
			}
		}
		System.out.println("가장 작은 수는 " + min + "이고, 가장 큰 수는 " + max + "이고,");
		System.out.println("최소값+최댓값은 " + (min + max) + "입니다.");

		sc.close();
	}
}