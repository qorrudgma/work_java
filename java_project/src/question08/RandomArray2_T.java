package question08;

import java.util.Scanner;

public class RandomArray2_T {
	// 난수의 중복체크하는 메소드
	public static boolean exists(int a[], int to, int r) {
		for (int i = 0; i < to; i++) {
			if (a[i] == r) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 100 + 1);
			if (exists(arr, i, r)) {
				i--;
				continue;
			}
			arr[i] = r;
			System.out.print(arr[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}
}