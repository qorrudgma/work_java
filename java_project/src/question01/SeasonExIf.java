package question01;

import java.util.Scanner;

public class SeasonExIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12)>>");
		int i = sc.nextInt();

//		if (1 <= i && i <= 12) {
//			if (i >= 3 && i <= 5) {
//				System.out.println("봄");
//			} else if (i >= 6 && i <= 8) {
//				System.out.println("여름");
//			} else if (i >= 9 && i <= 11) {
//				System.out.println("가을");
//			} else {
//				System.out.println("겨울");
//			}
//		} else {
//			System.out.println("잘못입력");
//		}
//		

		// 이중으로 쓰는것 보다는 조건을 길게 쓰는게 더 좋다
		if (i >= 3 && i <= 5) {
			System.out.println("봄");
		} else if (i >= 6 && i <= 8) {
			System.out.println("여름");
		} else if (i >= 9 && i <= 11) {
			System.out.println("가을");
		} else if (i == 12 || i == 1 || i == 2) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력");
		}

		sc.close();
	}

}
