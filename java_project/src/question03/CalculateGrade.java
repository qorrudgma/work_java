package question03;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String cheating;
		int attendrate;
		int totalscore;
		String grade = "";

		for (int i = 1; i < 9; i++) {
			System.out.print("부정행위 여부(true/false): ");
			cheating = sc.next();
			System.out.print("출석률(0~100사이의 정수값): ");
			attendrate = sc.nextInt();
			System.out.print("총점(0~100사이의 정수값): ");
			totalscore = sc.nextInt();

			if (cheating.equals("true") || attendrate < 80) {
				grade = "F";
			} else if (cheating.equals("false")) {
				if (totalscore >= 90) {
					grade = "A";
				} else if (totalscore >= 80) {
					grade = "B";
				} else if (totalscore >= 70) {
					grade = "C";
				} else if (totalscore >= 60) {
					grade = "D";
				} else {
					grade = "F";
				}
			}
			System.out.println("학점 = " + grade);
		}
		sc.close();
	}

}
