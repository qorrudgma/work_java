package chapter13;

interface Myfunction4 {
	int calc(int x, int y);
}

public class LambdaEx4 {
	public static void main(String[] args) {
		printMultiply(3, 4, (x, y) -> x * y);
	}

	static void printMultiply(int x, int y, Myfunction4 f) {
		System.out.println(f.calc(x, y));
	}
}