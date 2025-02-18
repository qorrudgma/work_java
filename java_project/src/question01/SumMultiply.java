package question01;

import java.util.Scanner;

public class SumMultiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("2개의 정수 입력>>");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("두수의 합은 " + (num1 + num2));
		System.out.println("두수의 곱은 " + (num1 * num2));
		
		sc.close();
	}

}
