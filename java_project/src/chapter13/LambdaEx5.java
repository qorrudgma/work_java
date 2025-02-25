package chapter13;

@FunctionalInterface // 추상메소드 1개만 쓰도록 체크 2개이상시 오류
interface Myfunction5<T> {
	void print(T x);
}

public class LambdaEx5 {
	public static void main(String[] args) {
		Myfunction5<String> f1 = (x) -> System.out.println(x);
		f1.print("ABC");

		Myfunction5<Integer> f2 = (x) -> System.out.println(x);
		f2.print(Integer.valueOf(100));
		f2.print(200); // auto boxing
	}
}