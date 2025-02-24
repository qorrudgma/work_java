package question06;

import java.util.Scanner;

public class ArrayList_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = new String();
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = sc.next();
		}
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}

		int longestIndex = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
		}

		System.out.println("\n가장 긴 이름은: " + a.get(longestIndex));
		sc.close();
	}
}