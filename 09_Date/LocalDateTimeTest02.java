import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest02 {
	public static void main(String[] args) {
		// LocalDateTime : LocalDate + LocalTime
		// 시스템의 날짜와 시간을 획득
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); // 2024-07-16T16:48:21.728

		// 날짜와 시간을 직접 설정 - 1번
		LocalDateTime now2 = LocalDateTime.of(2026, 2, 6, 17, 35, 40, 500);
		System.out.println(now2); // 2026-02-06T17:35:40.000000500

		// 날짜와 시간을 직접 설정 - 2번
		LocalDateTime now3 = LocalDateTime.parse("2026-02-06T18:30:35.555");
		System.out.println(now3); // 2026-02-06T18:30:35.555

		// 날짜와 시간을 직접 설정 - 3번
		LocalDateTime now4 = Year.of(2026).atMonth(2).atDay(6).atTime(18, 35, 40);
		System.out.println(now4); // 2026-02-06T18:35:40

		int year = now4.getYear();
		int month = now4.getMonthValue();
		int date = now4.getDayOfMonth();
		int hour = now4.getHour();
		int minute = now4.getMinute();
		int second = now4.getNano();

		System.out.printf("%d년 %2d월 %2d일 %2d시 %2d분 %2d초\n", year, month, date, hour, minute, second);
		System.out.println("-----");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(now4.format(dtf)); // 2026년 02월 06일 금요일 18시 35분 40초
	}
}
