package question08;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		Random r = new Random();
		System.out.print("정수 몇개?");
		int count = sc.nextInt();
		int[] arr = new int[count];
		int i = 0;

		while (set.size() < count) {
			int num = r.nextInt(100) + 1;
			String num1 = String.valueOf(num);
			set.add(num1);
			System.out.print(arr[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
			i++;
		}
		sc.close();
	}
}