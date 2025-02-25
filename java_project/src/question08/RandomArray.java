package question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("정수 몇개?");
		int count = sc.nextInt();
		int[] arr = new int[count];

		for (int i = 0; i < arr.length; i++) {
			int num = r.nextInt(100) + 1;
			arr[i] = num;
			System.out.print(arr[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}
}