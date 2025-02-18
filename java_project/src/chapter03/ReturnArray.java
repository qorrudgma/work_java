package chapter03;

public class ReturnArray {
//	makeArray(): 메소드
//	int[]: 반환(리턴) 타입(리턴을 안하면 오류)
//	static int[4] makeArray() {	크기 표시 안됌
	static int[] makeArray() {
		int temp[] = new int[4]; // 여기서 크기 표시
//		return temp[];	배열이라해도 반환할때는 []는 빼야함
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}

	public static void main(String[] args) {
		// 메소드호출
		int arr[] = makeArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}