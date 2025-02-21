package chapter06;

public class wrapperEX {
	public static void main(String[] args) {
		char c1 = '4', c2 = 'F';

//		isDigit 숫자 체크하는 메소드
		if (Character.isDigit(c1)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		if (Character.isDigit(c2)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		// isAlphabetic 영문자 체크하는 메소드
		if (Character.isAlphabetic(c1)) {
			System.out.println("영문자");
		} else {
			System.out.println("영문자 아님");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println("영문자");
		} else {
			System.out.println("영문자 아님");
		}

		System.out.println(Integer.parseInt("-123")); // 문자열을 정수로 변환했다
		System.out.println(Integer.toHexString(28)); // 숫자를 16진수로 바꿈
		System.out.println(Integer.toBinaryString(28)); // 숫자를 2진수로 바꿈
		System.out.println(Integer.bitCount(28)); // 2진수에서 1의 갯수

		Double d = Double.valueOf(3.14); // 3.14를 포함하는 객체를 가리키는 d참조변수
		System.out.println(d.toString()); // 문자열 3.14출력
		// parseDouble 문자열을 실수로 바꾼다
		System.out.println(Double.parseDouble("3.14")); // 실수 3.14

		boolean b = (4 > 3);
		// Boolean.toString: 불린값을 문자열로 변환
		System.out.println(Boolean.toString(b));
		// Boolean.toString: 문자열을 불린값으로 변환
		System.out.println(Boolean.parseBoolean("false"));
	}
}