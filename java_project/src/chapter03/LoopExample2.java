package chapter03;

import java.util.Scanner;

public class LoopExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요: ");

		int n = sc.nextInt();
		int i = 1;

		while (i < 10) {
			System.out.println(n + "*" + i + "=" + n * i);
			i++;
		}
	}
}