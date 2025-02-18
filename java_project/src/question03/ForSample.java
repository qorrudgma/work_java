package question03;

public class ForSample {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			if (i == 10) {
				System.out.print(i + "=");
			} else {
				System.out.print(i + "+");
			}
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
			sum += i;
			if (i < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}
}