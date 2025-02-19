package question06;

import java.util.Scanner;

public class MutipleOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 10개를 입력하시오>>");
		int numarr[] = new int[10];

		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = sc.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int j = 0; j < numarr.length; j++) {
			if (numarr[j] % 3 == 0) {
				System.out.print(numarr[j] + " ");
			}

		}
		sc.close();
	}
}