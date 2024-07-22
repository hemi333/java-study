import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

/*
LocalDate, LocalTime, LocalDateTime
- 기존의 날짜 클래스의 단점을 계산하여 만든 클래스
- 날짜와 시간에 대한 다양한 기능을 포함
- java 1.8 버전에서 도입
 */
public class LocalDateTimeTest01 {
	public static void main(String[] args) {
		// now(): 현재의 날짜 시간
		// of(): 지정하는 값
		
		// 1. LocalDate
		LocalDate d1 = LocalDate.now();
		System.out.println(d1); // 2024-07-16

		// 날짜를 설정 - 1번
		LocalDate d2 = LocalDate.of(2024, 7, 26);
		System.out.println(d2); // 2024-07-26

		// 날짜를 설정 - 2번
		LocalDate d3 = LocalDate.parse("2024-07-26");
		System.out.println(d3); // 2024-07-26

		//
		int year = d3.getYear();
		int month = d3.getMonthValue(); // 월의 값은 1~12, 월에 대해서 보정이 필요 없음.
		Month m = d3.getMonth(); // enum 타입
		int date = d3.getDayOfMonth();
		DayOfWeek w = d3.getDayOfWeek(); // enum 타입
		System.out.println(w);
		// 우리나라 요일로 변경
		String week;
		switch (w) {
		case MONDAY:
			week = "월";
			break;
		case TUESDAY:
			week = "화";
			break;
		case WEDNESDAY:
			week = "수";
			break;
		case THURSDAY:
			week = "목";
			break;
		case FRIDAY:
			week = "금";
			break;
		case SATURDAY:
			week = "토";
			break;
		case SUNDAY:
			week = "일";
			break;
		}
		System.out.printf("%d년 %2d월 %2d일\n", year, month, date); // 2024년 7월 26일
		System.out.printf("%d년 %s %2d일\n", year, m, date); // 2024년 JULY 26일
		System.out.println("-----");

		// 2. LocalTime 클래스
		// 시스템의 시간을 획득
		LocalTime t1 = LocalTime.now();
		System.out.println(t1); // 16:41:26.805

		// 시간을 설정 - 1번
		LocalTime t2 = LocalTime.of(18, 30, 35);
		System.out.println(t2); // 18:30:35

		// 시간을 설정 - 2번 - 인스턴스에 시간을 더하여 설정
		LocalTime t3 = t2.plusHours(3);
		System.out.println(t3); // 21:30:35

		// 시간을 설정 - 3번 - 인스턴스에 시간을 더하여 설정
		LocalTime t4 = t2.minusHours(3);
		System.out.println(t4); // 15:30:35

		// 시간을 설정 - 4번 - 타임존을 설정
		LocalTime t5 = LocalTime.now(ZoneId.of("Europe/Paris")); // 09:41:26.807
		System.out.println(t5);

		// 10-3승 : milliSecond, 10-6승: microSecond, 10-9승: nanoSecond
		int hour = t5.getHour();
		int minute = t5.getMinute();
		int second = t5.getSecond();
		int nanoSecond = t5.getNano(); // nano second: 10억분의 1초(10-9승)
		System.out.printf("%02d시 %02d분 %02d초 %02d나노초\n", hour, minute, second, nanoSecond);

	}
}
