import java.util.Calendar;

//public class DateId { // public을 쓸 수 있는 클래스는 파일명과 일치하는 클래스 뿐이다. 그 외의 클래스에서 사용시 에러 발생
class DateId {
	// int는 -21억~21억까지 밖에 기억 못함, long은 900경 정도까지
	private static long count = 0; // 클래스 변수
	private long id; // 인스턴스 변수

	// 클래스 초기자, 클래스 블럭, static 초기자(정적 초기자), static 블럭(정적 블럭)
	static {
		Calendar c = Calendar.getInstance(); // new를 통해 인스턴스를 만들지 못하는 메서드는 .getInstance()로 생성
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1;
		long date = c.get(Calendar.DATE);
		count = year * 10000000 + month * 100000 + date * 1000;

		System.out.printf("오늘은 %4d년 %2d월 %2d일 입니다.\n", year, month, date);
	}

	public DateId() {
		id = ++count;
	}

	// getter
	public static long getCount() {
		return count;
	}

	public long getId() {
		return id;
	}
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();

		System.out.println("a's id = " + a.getId()); // 날짜를 붙인 일련번호 출력
		System.out.println("b's id = " + b.getId());
		System.out.println("c's id = " + c.getId());

	}
}
