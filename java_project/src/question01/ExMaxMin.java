package question01;

import java.util.Scanner;

public class ExMaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 3개 입력>>");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int max = 0;// 이렇게 변수 해서 거기다 넣는걸로 하면 좀더 짧게 할수있음
		int min = 0;

		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("최대값은 " + num1);
			if (num2 > num3) {
				System.out.println("최소값은 " + num3);
			} else {
				System.out.println("최소값은 " + num1);
			}
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("최대값은 " + num2);
			if (num1 > num3) {
				System.out.println("최소값은 " + num3);
			} else {
				System.out.println("최소값은 " + num1);
			}
		} else {
			System.out.println("최대값은 " + num3);
			if (num1 > num2) {
				System.out.println("최소값은 " + num2);
			} else {
				System.out.println("최소값은 " + num1);
			}

		}
	}

}
