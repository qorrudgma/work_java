package chapter02;

public class CastingExample {
	public static void main(String[] args) {
	
		int intValue = 44032;
		char charValue = (char)intValue;
		
		System.out.println(charValue);
		
//		long longValue=500;
		long longValue=5000999888L;		//아래에서 강제 변환으로 잘려서 출력됨
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue = (int)doubleValue;		//인트로 변환하면서 소숫점 짤림
		
		System.out.println(intValue);
		
		
	}
}