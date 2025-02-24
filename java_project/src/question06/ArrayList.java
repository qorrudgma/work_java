package question06;

import java.util.Scanner;

public class ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[4];
		String max = "";
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			arr[i] = sc.next();
			if (max.length() < arr[i].length()) {
				max = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("\n가장 긴 이름은: " + max);
		sc.close();
	}
}