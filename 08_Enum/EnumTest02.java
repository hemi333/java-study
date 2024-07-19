import java.util.Calendar;

// 문잔데 숫자처럼 쓰고 숫자인데 문자로 씀
// 열거형은 0번부터 1씩 증가하는 정수를 갖는다.
// 문자열을 정수처럼 사용할수 있는 방법
enum Week {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumTest02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar는 추상클래스인데 getInstance로 추상클래스도 인스턴스를 만들수 있게 해 줌

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0~11의 정수를 리턴
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int week = cal.get(Calendar.DAY_OF_WEEK); // 1~7의 상수를 리턴, 1:일, 7:토
		System.out.printf("%4d년 %2d월 %2d일 (%d)요일", year, month, day, week);
		System.out.println();

		Week weekday = null;
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			weekday = Week.SUNDAY;
			break;
		case Calendar.MONDAY:
			weekday = Week.MONDAY;
			break;
		case Calendar.TUESDAY:
			weekday = Week.TUESDAY;
			break;
		case Calendar.WEDNESDAY:
			weekday = Week.WEDNESDAY;
			break;
		case Calendar.THURSDAY:
			weekday = Week.THURSDAY;
			break;
		case Calendar.FRIDAY:
			weekday = Week.FRIDAY;
			break;
		case Calendar.SATURDAY:
			weekday = Week.SATURDAY;
			break;
		}

		System.out.printf("%4d년 %2d월 %2d일 %s", year, month, day, weekday);

	}
}
