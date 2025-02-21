package chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#"); // heap 메모리에 저장
		String b = new String(",C++ "); // heap 메모리에 저장

		System.out.println(a.length()); // 문자열 길이 (스페이스 포함)
		System.out.println(a.contains("#")); // 해당 문자열을 포함하고있으면 참
		System.out.println(a.contains("*"));

		a = a.concat(b); // 문자열 연결 /새로운 문자열을 가리킴
		System.out.println(a);

		a = a.trim(); // 앞뒤 공백제거
		System.out.println(a);

		a = a.replace("C#", "java"); // 문자열 대체 C# 대신 java 로 대체
		System.out.println(a);

		String s[] = a.split(","); // ,를 기준으로 문자열에 저장
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열 " + i + ":" + s[i]);
		}

		a = a.substring(5); // 해당 인덱스 부터 시작
		System.out.println(a);

		char c = a.charAt(2); // 해당 인덱스의 문자
		System.out.println(c);
	}
}