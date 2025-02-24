package question06;

public class StringTokenizerEx {
	static void split(String a) {
		String s[] = a.split("/");
	}

	static void print(String s[]) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) {
		String a = new String("홍길동/장화/홍련/콩쥐/팥쥐");
		split(a);
	}
}