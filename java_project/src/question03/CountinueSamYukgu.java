package question03;

public class CountinueSamYukgu {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
		}

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				System.out.print("짝 ");
				continue;
			}
			System.out.print(i + " ");

		}
	}

}
