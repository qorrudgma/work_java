package question05;

public class ReturnArray2 {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int makeArray[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			makeArray[i] = array[i] + 100;
			System.out.print(makeArray[i] + " ");
		}
	}
}