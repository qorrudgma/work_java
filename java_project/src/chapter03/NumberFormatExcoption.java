package chapter03;

public class NumberFormatExcoption {

//문자열을 정수로 변환 안될때를 대비해서 예외처리

	public static void main(String[] args) {
		String stringNumber[] = { "23", "12", "3", "998", "aaa", "9.98" };
		int i;

		for (i = 0; i < stringNumber.length; i++) {
			try {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			} catch (Exception e) {
				System.out.println(stringNumber[i] + "는 정수로 변환 할 수 없습니다.");
			}

		}
	}

}
