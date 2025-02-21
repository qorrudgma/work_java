package question06;

import java.util.Random;

public class TwoDArray {
	public static void main(String[] args) {
		Random r = new Random();

		int numArr[][] = new int[4][4];

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = r.nextInt(10) + 1;
//				numArr[i][j] = (int) (Math.random() * 10 + 1);	이게 더 느리다 두배정도
				System.out.print(numArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}