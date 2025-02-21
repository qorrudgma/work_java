package question06;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int years = 0;
		System.out.print("원금을 입력하세요: ");
		int principal = sc.nextInt(); // 원금
		System.out.print("연이율을 입력하세요: ");
		double rate = sc.nextDouble();
		double balance = principal;

		System.out.println("\n연도수\t원리금");

//		do {
//			years += 1;
//			balance = balance * (1.0 + rate / 100.0);
//			System.out.println(years + "\t" + balance);
//		} while (balance <= principal * 2.0);
//		System.out.println("필요한 연도수 = " + years);

		while (balance <= principal * 2.0) {
			years += 1;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years + "\t" + balance);
		}
		System.out.println("\n필요한 연도수 = " + years);

		sc.close();
	}
}