package chapter02;

public class TypeConversion {

	public static void main(String[] args) {

		byte b=127;
		int i=10;
		
		System.out.println(b+i);
		System.out.println(10/4);		//정수끼리라서 출력도 정수로나옴
		System.out.println(10.0/4);		//정수실수로 계산하거라 실수로 결과나옴
		System.out.println(2.9+1.8);
		System.out.println();
		System.out.println((int)2.9 + 1.8);	//2.9를 정수취급해서 2으로 계산함
		System.out.println((int)2.9 + (int)1.8);
		System.out.println((int)(2.9+1.8));
	}

}
