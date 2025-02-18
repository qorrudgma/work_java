package chapter02;

import java.util.Scanner;

public class GradingSwich {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char grade;
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10:
//			grade='A';		아래가같은 출력이나 결과를 가진다면 case만 적어서 바로 다름 case를 적으면 아래랑 같은 결과를 가진다.
//			break;
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
			break;
		}
//		if (score >= 90) {
//			grade='A';
//		} else if (score >= 80) {
//			grade='B';
//		} else if (score >= 70) {
//			grade='C';
//		} else if (score >= 60) {
//			grade='D';
//		} else {
//			grade='F';
//		}
		System.out.println("학점은 "+ grade +"입니다.");
	}
}