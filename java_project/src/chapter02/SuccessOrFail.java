package chapter02;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		
		int score = sc.nextInt();
		
//		if (score >= 80)		// 하나만 적는경우 뒤에 하나만 됌  다쓰려면 {} 추가해야함
//			System.out.println("축하합니다!");
//			System.out.println("합격입니다.");
//		if (score >= 80) System.out.println("축하합니다!"); System.out.println("합격입니다.");	//바로뒤 하나만됌  다쓰려면 {} 추가해야함
		
		
//		if (score >= 80) {
//			System.out.println("축하합니다! 합격입니다.");
//		}
		
		sc.close();
	}

}
