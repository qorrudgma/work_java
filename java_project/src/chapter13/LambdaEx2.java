package chapter13;

interface Myfunction2 {
	int calc(int x); // 람다식으로 구현할 추상 메소드
}

public class LambdaEx2 {
	public static void main(String[] args) {
		Myfunction2 square = x -> x * x;
		System.out.println(square.calc(3));
	}
}