package question10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DicApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> str = new HashMap<>();
		str.put("사랑", "love");
		str.put("아기", "baby");
		str.put("돈", "money");
		str.put("미래", "future");
		str.put("희망", "hope");

		System.out.println("한영 단어 검색 프로그램 입니다.");
		String s = null;
		while (s != "그만") {
			System.err.print("한글 단어?");
			s = sc.next();
			if (s.equals("그만")) {
				break;
			}
			if (str.get(s) == null) {
				System.out.println(s + "은(는) 저희 사전에 없습니다.");
			} else {
				System.out.println(s + "은(는) " + str.get(s));
			}
		}
		sc.close();
	}
}