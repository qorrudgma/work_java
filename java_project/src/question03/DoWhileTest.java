package question03;

public class DoWhileTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		do {
			sum += i;
			i += 2;
		} while (i < 100);

//		do {
//			if (i > 99) {
//				break;
//			}
//			sum += i;
//			i += 2;
//		} while (true);

		System.out.println(sum);
	}
}