package question04;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양수 7개를 입력하세요.");

		int numarr[] = new int[7];
//		int min = 0;
		int min = Integer.MAX_VALUE;// int타입의 가장 큰 숫자

		for (int i = 0; i < 7; i++) {
			numarr[i] = sc.nextInt();
//			if (i == 0) {
//				min = numarr[i];
//			}
			if (min > numarr[i]) {
				min = numarr[i];
			}
		}
		System.out.println("가장 작은 수는 " + min + "입니다.");
		sc.close();
	}
}