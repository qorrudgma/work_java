package chapter03;

public class ContinueTest {

	public static void main(String[] args) {
		int count = 0;
		String s = "no news is good news";

		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));	//해당 인덱스 값의 문자
//			if (s.charAt(i) == 'n') {
//				count += 1;
//			}
			if (s.charAt(i) != 'n') {
				continue; // 여기서 끊고 위로 돌아감 다음으로 안넘김
			}
			count += 1;
		}
		System.out.println("문장에서 발견된 n의 갯수: " + count);
	}
}