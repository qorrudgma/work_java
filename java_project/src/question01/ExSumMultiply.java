package question01;

import java.util.Scanner;

public class ExSumMultiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("2자리수 정수 입력(10~99)>>");
		int num1 = sc.nextInt();
		int a = num1 / 100;
		int b = (num1 / 10) % 10;
		int c = num1 % 10;
		System.out.println("100의 자리와 10의 자리의 합은 " + (a + b));
		System.out.println("10의 자리와 1의 자리의 합은 " + (b * c));

		sc.close();
	}

}
