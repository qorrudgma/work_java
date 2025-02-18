package question05;

public class ReturnArray3 {
	int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int makeArray[] = new int[10];

	public int[] getArea() {
		for (int i = 0; i < array.length; i++) {
			makeArray[i] = array[i] + 100;
		}
		return makeArray;
	}

	public static void main(String[] args) {
		ReturnArray3 arr = new ReturnArray3();
		System.out.println(arr);
	}
}