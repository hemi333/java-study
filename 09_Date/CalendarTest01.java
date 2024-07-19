import java.util.Calendar;

// Calendar 클래스
// - Date 클래스의 단점을 보완하고, 계산해서 성능을 향상시킨 클래스
// - Java 1.1 버전부터 사용
// - 추상 클래스, new를 사용해서 인스턴스 생성 불가, getInstance() 메서드 사용
public class CalendarTest01 {
	public static void main(String[] args) {
//		Calendar c = new Calendar(); // 추상 클래스이기 때문에 안됨.
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		System.out.printf("%d년 %2d월 %2d일\n", year, month, date);

		// 요일 확인
		// 0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토
		int week = c.get(Calendar.DAY_OF_WEEK);

		// 요일 계산 - 1번 방법
		String[] weekDay = { "일", "월", "화", "수", "목", "금", "토" };

		// 요일 계산 - 2번 방법
		String weekTemp = "";
		switch (c.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			weekTemp = "일";
			break;
		case Calendar.MONDAY:
			weekTemp = "월";
			break;
		case Calendar.TUESDAY:
			weekTemp = "화";
			break;
		case Calendar.WEDNESDAY:
			weekTemp = "수";
			break;
		case Calendar.THURSDAY:
			weekTemp = "목";
			break;
		case Calendar.FRIDAY:
			weekTemp = "금";
			break;
		case Calendar.SATURDAY:
			weekTemp = "토";
			break;
		}

//		int hour = c.get(Calendar.HOUR); // 12시간으로 계산
		int hour = c.get(Calendar.HOUR_OF_DAY); // 24시간으로 계산
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND); // 1000분 1초

		// 0: 오전, 1: 오후
		int ampm = c.get(Calendar.AM_PM);

		// 오전, 오후 계산 - 1번 방법
		String[] ap = { "오전", "오후" };

		// 오전, 오후 계산 - 2번 방법
		String ap2;
		if (ampm == Calendar.AM)
			ap2 = "오전";
		else
			ap2 = "오후";

		System.out.printf("%s %2d시 %2d분 %2d초 %3d밀리초\n", ap[ampm], hour, minute, second, millisecond);
		System.out.printf("%s %2d시 %2d분 %2d초 %3d밀리초\n", ap2, hour, minute, second, millisecond);
		System.out.println("-----");

		// 2. 날짜를 직접 설정하는 방법
		// 파리 올림픽 - 2024년 7월 26일 17시 35분 40초
		Calendar c2 = Calendar.getInstance();
		c2.set(2024, 7, 26, 17, 35, 40);

		year = c2.get(Calendar.YEAR);
		month = c2.get(Calendar.MONTH);
		date = c2.get(Calendar.DATE);
		week = c2.get(Calendar.DAY_OF_WEEK);
		hour = c2.get(Calendar.HOUR);
		minute = c2.get(Calendar.MINUTE);
		second = c2.get(Calendar.SECOND);
		System.out.printf("%d년 %2d월 %2d일\n", year, month, date);
	}
}
