package question04;

import java.util.Scanner;

public class Print2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력>>");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
//			for (int j = 0; j < i; j++) {	=을 빼고 0부터 시작으로 바꾸기
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}