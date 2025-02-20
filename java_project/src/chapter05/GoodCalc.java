package chapter05;

import java.util.Scanner;

abstract class Calculator { // 추상클래스(추상메소드는 없어도 됨)
//	public int add(int a, int b) {
//		return 1;
//	}
//	public abstract int add(int a, int b) {	return 1;}	//오류
	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator { // 추상메소드 오버라이딩 해서 구현해야함
//public abstract class GoodCalc extends Calculator {//추상클래스는 구현 불필요
	public static void main(String[] args) {
//		Calculator calculator = new Calculator(); // 추상클래스는 객체 생성 안됌
		Scanner sc = new Scanner(System.in);

		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(5, 5));
		System.out.println(calc.subtract(10, 5));
		System.out.println(calc.average(new int[] { 2, 3, 4 }));

		sc.close();
	}

	@Override // @는 어노테이션(시스템 주석) => 생략해도 문제 없음
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}