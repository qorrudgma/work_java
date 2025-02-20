package question06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		Random r = new Random();

		double sum = 0;
		int numArr[] = new int[10];

		System.out.print("랜덤한 정수들: ");
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = r.nextInt(10) + 1;
			System.out.print(numArr[i] + " ");
			sum += numArr[i];
		}
		System.out.println("\n평균은 " + sum / numArr.length);
	}
}