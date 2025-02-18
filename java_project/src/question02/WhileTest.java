package question02;

public class WhileTest {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;

		while (n < 100) {
			sum += n;
			n += 2;
		}
		System.out.println(sum);
	}
}