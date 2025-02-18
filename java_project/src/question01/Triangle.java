package question01;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 3개를 입력하시오>>");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (checkedTriangle(a, b, c)) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 안됩니다.");
		}
		sc.close();
	}

	public static boolean checkedTriangle(int a, int b, int c) {
		return (a + b > c) && (a + c > b) && (c + b > a);
	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수 3개를 입력하시오>>");
//
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		if ((a + b <= c) || (a + c <= b) || (c + b <= a)) {
//			System.out.println("삼각형이 안됩니다.");
//		} else {
//			System.out.println("삼각형이 됩니다.");
//		}
//		sc.close();
//	}
}