import java.time.LocalDateTime;

public class DecimalFormatTest02 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.println(now);

		// LocalDate, LocalTime, LocalDateTime 클래스의 출력 포맷을 설정하는 방법
		// 포맷 형식
		// yyyy: 년도 4자리, yy: 년도 2자리
		// MM: 월 2자리, M: 월 1자리
		// dd: 일 2자리, d: 일 1자리
		// HH: 24시간, hh: 12시간
		// mm: 분 2자리, m: 분 1자리
		// ss: 초 2자리, s: 초 1자리, sss: 밀리 세컨드
		// a: 오전 또는 오후
		// E: 한글 1글자 요일

	}
}
