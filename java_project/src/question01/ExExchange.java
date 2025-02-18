package question01;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();	
		Double dollar = dollar(won);
		Double euro = euro(won);
		System.out.println(won +"원은 $"+ dollar +"입니다.");
		System.out.println(won +"원은 E"+ euro +"입니다.");
		
		sc.close();
	}
	public static double dollar(int num) {
		double d = num/1100;
		return d;
	}
	public static double euro(double num) {
		double e = num/1500;
		return e;
	}
}