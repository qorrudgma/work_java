package chapter03;

import java.util.Scanner;

public class InputExcoption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, n = 0;

		System.out.println("정수 3개 입력:");

		for (int i = 0; i < 3; i++) {
			System.out.print(">>");
			try {
				n = sc.nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); // 이거는 문자열을 입력받은게 n에 들어가지 못하게 넘긴다
				i--; // 다시 입력받기위해 카운트 감소
				continue; // 다시 위로 간다
			}
			sum += n;
		}
		System.out.println("합은 " + sum);
		sc.close();
	}
}