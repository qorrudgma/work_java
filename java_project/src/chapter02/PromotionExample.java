package chapter02;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue=10;
		int intvalue=byteValue;
		System.out.println("intvalue: " + intvalue);
		
		char charValue='가';
		intvalue = charValue;
		System.out.println("intvalue: " + intvalue);

		intvalue=50;
		long longvalue=intvalue;
		System.out.println("longvalue: " + longvalue);
		
		longvalue=100;
		float floatValue=longvalue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue=100.5F;
		double doubleValue=floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		
	}
}