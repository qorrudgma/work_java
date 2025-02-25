package chapter13;

interface Myfunction {
	int calc(int x, int y); // 람다식으로 구현할 추상 메소드
}

public class LambdaEx1 {
	public static void main(String[] args) {
		Myfunction add = (x, y) -> {
			return x + y;
		}; // 람다식
//		Myfunction minus = (x, y) -> {return x - y;};
		Myfunction minus = (x, y) -> x - y;

		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(1, 2));
	}
}