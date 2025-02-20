package question06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int numberToGuess = r.nextInt(10) + 1;
		int guess;

		// 이코드보다 아래 코드가 더 좋은 코드 위는 간결하지만 가독성이 떨어지고 유지보수가 힘듬
//		while (true) {
//			System.out.print("추축한 숫자를 입력하세요: ");
//			guess = sc.nextInt();
//			if (guess == numberToGuess) {
//				System.out.println("맞추셨습니다.");
//				break;
//			} else if (guess > numberToGuess) {
//				System.out.println("추축한 숫자가 틀렸습니다.\n추측한 숫자가 너무큽니다.");
//			} else if (guess < numberToGuess) {
//				System.out.println("추축한 숫자가 틀렸습니다.\n추측한 숫자가 너무작습니다.");
//			}
//		}

		System.out.print("추축한 숫자를 입력하세요: ");
		guess = sc.nextInt();
		while (guess != numberToGuess) { // 조건 잘 생각하기 무한루프 빠져나갈 조건을 직관적이게 표현할수있는 조건 걸기
			System.out.println("추축한 숫자가 틀렸습니다.");
			if (guess > numberToGuess) {
				System.out.println("추측한 숫자가 너무큽니다.");
			} else {
				System.out.println("추측한 숫자가 너무작습니다.");
			}
			System.out.print("추축한 숫자를 입력하세요: ");
			guess = sc.nextInt();
		}
		System.out.println("맞추셨습니다.");
		sc.close();
	}
}