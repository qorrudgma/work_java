package chapter02;

public class ByteOperationExample {

	public static void main(String[] args) {

		byte result1=10+20;
		
		System.out.println(result1);
		
		byte x=10;
		byte y=10;
//		byte resylt2 = x+y;		//연산이 되면서 int로 변환되었다 그래서 오류가남(연산하게되면 강제로 int로 변환된다)
		byte result2 = (byte)(x+y);	//따라서 byte로 만듬
		
		System.out.println(result2);
		
		
		
		
		
	}

}
