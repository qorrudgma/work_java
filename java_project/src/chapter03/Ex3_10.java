package chapter03;

// 4년 전체 평균학점의 평균 구하기
// 2차원 배열 이용해서 원소로 초기화
// 1행1열 부터 4행 2열까지

public class Ex3_10 {
	public static void main(String[] args) {
		double sum = 0;
		// 만점 기준 4.5
		double score[][] = { { 3.3, 3.4 }// 1행 1열,2열 1학년
				, { 3.5, 3.6 } // 2행 1열,2열 2학년
				, { 3.7, 4.0 } // 3행 1열,2열 3학년
				, { 4.1, 4.2 } // 4행 1열,2열 4학년
		};

		for (int i = 0; i < score.length; i++) {// 4행 4번 반복
			for (int j = 0; j < score[i].length; j++) {// 2열 2번 반복 첫번째 원소(배열)의 길이
				sum += score[i][j];// 모든 원소들을 합친다.
			}
		}

		int n = score.length; // 행의 크기
		int m = score[0].length; // 열의 크기
		System.out.println("4년 전체 평점 평균: " + sum / (n * m));
	}
}