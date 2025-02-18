package question03;

import java.util.Scanner;

public class Tesla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("매수 수량을 입력하시오>>");
		int num = sc.nextInt();
		int d = num * 520;
		int h = d / 100;
		int t = (d - (h * 100)) / 10;
		System.out.println("100달러짜리 " + h + "매");
		if (t != 0) {
			System.out.println("10달러짜리 " + t + "매");
		}

		sc.close();
	}

}
