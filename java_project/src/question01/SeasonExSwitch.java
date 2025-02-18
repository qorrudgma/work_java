package question01;

import java.util.Scanner;

public class SeasonExSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12)>>");
		int i = sc.nextInt();

		switch (i) {
		case 1:
		case 2:
		case 12:
			System.out.println("봄");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("여름");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("가을");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("겨을");
			break;
		default:
			System.out.println("잘못입력");
			break;
		}

//		String x = "";
//		if (i >= 3 && i <= 5) {
//			x = "a";
//		} else if (i >= 6 && i <= 8) {
//			x = "b";
//		} else if (i >= 9 && i <= 11) {
//			x = "c";
//		} else if (i == 12 || i == 1 || i == 2) {
//			x = "d";
//		} else {
//			x = "";
//		}
//
//		switch (x) {
//		case "a":
//			System.out.println("봄");
//			break;
//		case "b":
//			System.out.println("여름");
//			break;
//		case "c":
//			System.out.println("가을");
//			break;
//		case "d":
//			System.out.println("겨을");
//			break;
//		default:
//			System.out.println("잘못입력");
//			break;
//		}

		sc.close();
	}

}
