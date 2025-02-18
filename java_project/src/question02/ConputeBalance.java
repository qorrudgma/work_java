package question02;

import java.util.Scanner;

public class ConputeBalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("구매 금액을 입력하세요: ");

		int purchaseAmount = sc.nextInt();
		int balance = 0;

		if (purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
		} else if (purchaseAmount > 100000) {
			balance = purchaseAmount - 5000;
		} else {
			balance = purchaseAmount;
		}
		System.out.println("구매 금액 = " + purchaseAmount);
		System.out.println("청구 금액 = " + balance);

		sc.close();
	}

}
