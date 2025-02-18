package question03;

public class Gugudan {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int a = i * j;
				System.out.print(i + "*" + j + "=" + (a) + "\t");
			}
			System.out.println();
		}
	}
}