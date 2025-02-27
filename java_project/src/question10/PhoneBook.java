package question10;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneBook {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<String, String> phone = new HashMap<>();

		System.out.print("인원수>>");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 간 없이 입력)>>");
			sc.nextLine();
			StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
			System.out.println(st.nextToken() + st.nextToken());
			// phone.put(st.nextToken(), st.nextToken()); //이부분에서 계속 입력이 안되는데 그 이유 찾기
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.err.print("검색할 이름>>");
			String n = sc.next();
			if (n.equals("그만")) {
				break;
			}

			if (phone.get(n) == null) {
				System.out.println(n + "은(는) 없습니다.");
			} else {
				System.out.println(n + "의 번호는 " + phone.get(n) + "입니다.");
			}
		}

		sc.close();
	}
}