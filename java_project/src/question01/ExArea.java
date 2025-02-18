package question01;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오>>");

		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();

		if (num3 == 0) {
			float area = (num1 * num2) / 2;
			System.out.println("삼각형의 넓이는 " + area);
		} else {
			float area = ((num1 + num2) * num3) / 2;
			System.out.println("사다리꼴의 넓이는 " + area);
		}
		sc.close();
	}
}