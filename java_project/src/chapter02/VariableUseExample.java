package chapter02;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour=3;
		int minute=5;
		
		System.out.println(hour+minute);
		System.out.println(hour+"시"+minute+"분");//숫자가있지만 문자열이 포함되있어서 문자열이된다
		
		int totalMinute = hour*60+minute;
		
		System.out.println(totalMinute+"분");
	}
}