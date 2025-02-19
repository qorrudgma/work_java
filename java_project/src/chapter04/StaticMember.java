package chapter04;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate;

//	메소드를 사용해서 멤버 변수를 접근해서 사용(직접적인 값 수정을 막음 -> 보안)
//	getter(ex)gerAbc: 값을 가져올때),setter(ex)serAbc: 값을 저장할때) 메소드 사용해서 멤버변수 사용
	public static void setRate(double rate) {
//		매개변수를 static(클래스)멤버로 저장
		CurrencyConverter.rate = rate;
	}

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("환율(1달러)>>");
		double rate = sc.nextDouble();

		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("100$는 " + CurrencyConverter.toKWR(100) + "원 입니다.");

		sc.close();
	}
}
