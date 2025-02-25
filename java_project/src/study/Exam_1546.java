package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 첫줄 시험과목 갯수
 * 둘째줄 시험 점수들
 * 최댓값 M
 * 점수/M*100
 * 평균 구하기
 * 3
 * 40 80 60
 * 75.0
 * 3
 * 10 20 30
 * 66.666667
 */
public class Exam_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		double[] num = new double[count];
		double sum = 0;
		double max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			num[i] = (arr[i] / max) * 100;
			sum += num[i];
		}
		System.out.print(sum / count);
		br.close();
	}
}