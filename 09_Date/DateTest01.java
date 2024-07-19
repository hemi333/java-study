import java.util.Date;

// Date 클래스 - Java 1.0 버전부터 사용
public class DateTest01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d = new Date();

		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1; // 월은 0 ~ 11의 값
		int date = d.getDate();
		System.out.printf("%d년 %2d월 %2d일\n", year, month, date);

		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		System.out.printf("%2d시 %2d분 %2d초\n", hour, minute, second);
		System.out.println("-----");

		// 날짜와 시간을 직접 설정하는 방법 - 1번
		Date d2 = new Date();
		d2.setYear(2024);
		d2.setMonth(7);
		d2.setDate(26);
		d2.setHours(12);
		d2.setMinutes(20);
		d2.setMinutes(30);

		System.out.printf("%d년 %2d월 %2d일\n", d2.getYear(), d2.getMonth(), d2.getDate());
		System.out.printf("%2d시 %2d분 %2d초\n", d2.getHours(), d2.getMinutes(), d2.getSeconds());
		System.out.println("-----");

		// 날짜와 시간을 직접 설정하는 방법 - 2번
		Date d3 = new Date(2024, 7, 16, 17, 35, 40);
		System.out.printf("%d년 %2d월 %2d일\n", d3.getYear(), d3.getMonth(), d3.getDate());
		System.out.printf("%2d시 %2d분 %2d초\n", d3.getHours(), d3.getMinutes(), d3.getSeconds());
		System.out.println("-----");

	}
}
