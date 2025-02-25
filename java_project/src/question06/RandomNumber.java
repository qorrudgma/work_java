package question06;

import java.util.Random;

public class RandomNumber {

//	public static void main(String[] args) throws InterruptedException {
	public static void main(String[] args) {
		Random generator = new Random();
		int rNumber;

//		generator.nextInt(); // int범위에서 난수 생성
//		generator.nextInt(10); // 0~9 난수
//		int a = generator.nextInt(10) + 1; // 변수 선언
//		generator.nextDouble();
//		double b = generator.nextDouble() + 1;

		while (true) {
			rNumber = generator.nextInt(100) + 1;
//			Thread.sleep(1000);
			System.out.println(rNumber);
			if (rNumber == 7) {
				break;
			}
		}
	}
}