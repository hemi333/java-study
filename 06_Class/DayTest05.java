
class Day {
	// 인스턴스 변수
	private int year = 1;
	private int month = 1;
	private int date = 1;
	String[] weekDay = { "일", "월", "화", "수", "목", "금", "토" };

	// 생성자 오버로딩
	// default 생성자
	public Day() {

	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this(year);
		this.month = month;
	}

	// 생성자
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}

	// 생성자 오버로딩
	// ★복사 생성자
	// this(): 자신이 속한 생성자를 호출하는 것.
	public Day(Day d) {
		// Day(d.year, d.month, d.date); // 생성자는 인스턴스 생성때에만 호출되므로 이렇게 쓰면 안된다!
		this(d.year, d.month, d.date);
	}

	// getter
	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDate() {
		return this.date;
	}

	// setter
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	// 날짜 설정 메서드
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	// 요일 계산 메서드
	// 제라의 공식: 0~6 사이의 정수로 리턴
	// 0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;

		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + d) % 7;
	}

	// 날짜 비교 메서드
	public boolean equalDay(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	// 출력 메서드 1번
	public void printDay() {
		System.out.printf("%4d년 %2d월 %2d일 %s요일\n", year, month, date, weekDay[dayOfWeek()]);
	}

	// 출력 메서드 2번
	public String toString() {
		return String.format("%4d년 %2d월 %2d일 %s요일\n", year, month, date, weekDay[dayOfWeek()]);
	}

}

// 다양한 생성자의 활용
public class DayTest05 {
	public static void main(String[] args) {
		Day day1 = new Day(); // 초기값
		Day day2 = new Day(2024);
		Day day3 = new Day(2025, 8);
		Day day4 = new Day(2024, 7, 5);
		Day day5 = new Day(day4); // 복사 생성자

		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
	}
}
