import java.util.Calendar;

public class CalendarTest02 {
	public static void main(String[] args) {
		// Calendar 클래스의 다양한 기능
		Calendar c = Calendar.getInstance();

		System.out.printf("오늘은 %d년 %2d월 %2d일\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE));
		System.out.println("올해의 몇 번째 주: " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달의 몇 번째 주: " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇 일: " + c.get(Calendar.DATE));
		System.out.println("이달의 몇 일: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇 일: " + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("-----");

		// 두 개의 날짜 사이의 차이 (초, 분, 시간, 일)
		// 동계 올림픽 - 이탈리아, 밀라노-코르티나딤해초
		// 2026년 2월 6일
		// 문제) 현시점(2024/7/16)에서 다음 동계 올림픽까지 몇 일이 남았는지 계산하도록 프로그래밍 하시오.
		Calendar c1 = Calendar.getInstance(); // 현시점
		Calendar c2 = Calendar.getInstance(); // 동계 올림픽 설정

		// c2.set(2026, 1, 6); // 2026년 2월 6일
		c2.set(2026, Calendar.FEBRUARY, 6); // 2026년 2월 6일

		long diff = c2.getTimeInMillis() - c1.getTimeInMillis();
		System.out.printf("두 날짜의 차이: %d 밀리초\n", diff); // 밀리초: 1000분의 1초
		System.out.printf("두 날짜의 차이: %d 초\n", diff / 1000); // 초
		System.out.printf("두 날짜의 차이: %d 분\n", diff / 1000 / 60); // 분
		System.out.printf("두 날짜의 차이: %d 시\n", diff / 1000 / 60 / 60); // 시간
		System.out.printf("두 날짜의 차이: %d 일\n", diff / 1000 / 60 / 60 / 24); // 일
	}
}
