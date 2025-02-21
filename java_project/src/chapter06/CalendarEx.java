package chapter06;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalender(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfWeek = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);

		System.out.println(msg + " : " + year + "-" + month + "-" + day + " ");
//		System.out.println(dayOfWeek); // 일:1 월:2 화:3 ~~

		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("일요일 ");
			break;
		case Calendar.MONDAY:
			System.out.print("월요일 ");
			break;
		case Calendar.TUESDAY:
			System.out.print("화요일 ");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("수요일 ");
			break;
		case Calendar.THURSDAY:
			System.out.print("목요일 ");
			break;
		case Calendar.FRIDAY:
			System.out.print("금요일 ");
			break;
		case Calendar.SATURDAY:
			System.out.print("토요일 ");
			break;
		default:
			break;
		}

		System.out.print("(" + hourOfWeek + ")"); // 24시간 기준
		if (ampm == Calendar.AM) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}

	public static void main(String[] args) {
//		new Calendar(); abstract는 new연산자로 객체 생성 불가능
		Calendar now = Calendar.getInstance();
		printCalender("현재", now);

		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);

		printCalender("처음 데이트한 날은 ", firstDate);
	}
}