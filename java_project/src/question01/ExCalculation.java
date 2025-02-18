package question01;

import java.util.Scanner;

//class Aaa{}  클래스가 여러개 존재해도 퍼블릭클래스를 찾아감
//public class Caa{}  퍼블릭클래스는 하나만 만들어야한다
public class ExCalculation {

	public static void Aaa() {
		System.out.println("777");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("2개의 실수 입력>>");
		
		float num1=sc.nextFloat();
		float num2=sc.nextFloat();
		
		System.out.println("두수의 덧셈은 " + (num1 + num2));
		System.out.println("두수의 뺄셈은 " + (num1 - num2));
		System.out.println("두수의 곱셈은 " + (num1 * num2));
		System.out.println("두수의 나눗셈음 " + (num1 / num2));
		
		sc.close();
	}
}