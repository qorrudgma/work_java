
package question03;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = "";
		System.out.println("exit를 입력하면 종료합니다.");
		while (true) {
			System.out.print(">>");
			a = sc.next();
			if (a.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		}
		sc.close();
	}
}