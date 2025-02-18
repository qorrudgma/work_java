package question04;

import java.util.Scanner;

public class PrintAsterisk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = null;

		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 3; j++) {
					arr[i][j] = sc.nextInt();
				}
			} else {
				for (int j = 0; j < 2; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
		}
		System.out.println(arr);
		sc.close();
	}
}