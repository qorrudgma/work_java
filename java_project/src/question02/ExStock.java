package question02;

import java.util.Scanner;

public class ExStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kospi, rate;

		while (true) {
			System.out.print("코스피 지수를 입력하세요(1800~2500): ");
			kospi = sc.nextInt();
			if (kospi < 1800 || kospi > 2500) {
				System.out.println("코스피 지수는(1800~2500)사이입니다");
				continue;
			}
			System.out.print("환율을 입력하세요(1100~1200): ");
			rate = sc.nextInt();
			if (rate < 1100 || rate > 1200) {
				System.out.println("환율은(1100~1200)사이입니다");
				continue;
			}
			break;
		}
		if (rate >= 1150) {
			if (kospi >= 2200) {
				System.out.println("상승장");
			} else {
				System.out.println("횡보장");
			}
		} else {
			if (kospi >= 2300) {
				System.out.println("상승장");
//				} else if (kospi >= 2000 && kospi <= 2299) { 이처럼 할필요없는게 어차피 2299이상이 되면 위에서 상승장으로 이미 출력이 되기 때문에 굳이 적을필요는 없다.
			} else if (kospi >= 2000) {
				System.out.println("횡보장");
			} else {
				System.out.println("하락장");
			}
		}
		sc.close();
	}

}
