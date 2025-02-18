package question01;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = 0;

		if (num1 > num2) {
			if (num2 < num3) {
				num4 = num3;
			} else {
				num4 = num2;
			}
		} else if (num1 < num2) {
			if (num2 < num3) {
				num4 = num2;
			} else {
				num4 = num1;
			}
		} else {

		}
		System.out.println("중간값은 " + num4);
		sc.close();
	}

}
