package question06;

public class BabySum {

	public static void main(String[] args) {
		int baby[][] = new int[120][5];
		int sum = 0;

		for (int month = 0; month < baby.length; month++) {
			for (int country = 0; country < baby[month].length; country++) {
				baby[month][country] = ((month + 1) * 100) + (country + 1);
				sum += baby[month][country];
			}
		}
		System.out.println(sum);
	}
}