import java.util.Calendar;
import java.util.Date;

public class CalendarTest04 {
	public static void main(String[] args) {
		// 1. Calendar 클래스를 Date 클래스로 변환
		// Calendar 인스턴스를 Date 클래스의 생성자로 넣어서 만듦
		Calendar c = Calendar.getInstance(); // 현재 날짜
		Date d = new Date(c.getTimeInMillis());

		System.out.printf("%4d년 %2d월 %2d일\n", d.getYear() + 1900, d.getMonth() + 1, d.getDate());

		// 2. Date 클래스를 Calendar 클래스로 변환
		// -> Date 인스턴스를 Calendar 클래스의 setTime() 메서드에 설정해서 만듦
		Date d1 = new Date(); // 현재 날짜
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		System.out.printf("%4d년 %2d월 %2d일\n", c1.get(Calendar.YEAR), c1.get(Calendar.MONTH) + 1, c1.get(Calendar.DATE));
		System.out.println("-----");

		// Date 인스턴스를 출력하는 방법
		System.out.println(d.toString()); // Tue Jul 16 15:43:18 KST 2024
		System.out.println(d.toGMTString()); // 16 Jul 2024 06:43:18 GMT
		System.out.println(d.toLocaleString()); // 2024. 7. 16 오후 3:43:18
		System.out.println("-----");

		// Calendar 인스턴스를 출력하는 방법
		System.out.println(c1.toString());
		System.out.println(c1.getTime()); // Tue Jul 16 15:44:05 KST 2024
	}
}
