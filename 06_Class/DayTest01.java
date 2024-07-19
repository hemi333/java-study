import java.util.Scanner;

/*
날짜 클래스
- 클래스명: Day
- 인스턴스 변수: year 년, month 월, date 일
- 인스턴스 메서드: getter/setter, 전체 날짜 설정 메서드, 요일 메서드

*/

class Day {
	// 인스턴스 변수
	private int year;
	private int month;
	private int date;

	// 생성자
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
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
}

public class DayTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekDay = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.println("생년월일을 입력하시오.");
		System.out.print("년 입력: ");
		int y = sc.nextInt();
		System.out.print("월 입력: ");
		int m = sc.nextInt();
		System.out.print("일 입력: ");
		int d = sc.nextInt();

		// 인스턴스 생성
		Day birth = new Day(y, m, d);

		// 인스턴스 복사 - 참조를 복사 (Shallow Copy)
		Day xDay = birth;

		// 변경
		// 문제점: birth의 인스턴스를 복사하여 xDay의 날짜를 변경하였으나, 실제로는 birth의 날짜도 변경되었다.
		// birth의 값을 복사한 것이 아니라, 참조(주소값)를 복사했기 때문에 실제로는 birth의 값을 변경하게 된 것이다.
		xDay.set(1999, 12, 25);
		xDay.setYear(2024);

		// 출력
		System.out.printf("birthday = %4d년 %2d월 %2d일 %s요일\n", birth.getYear(), birth.getMonth(), birth.getDate(),
				weekDay[birth.dayOfWeek()]);

		System.out.printf("xDay     = %4d년 %2d월 %2d일 %s요일", xDay.getYear(), xDay.getMonth(), xDay.getDate(),
				weekDay[xDay.dayOfWeek()]);

		sc.close();
	}
}
