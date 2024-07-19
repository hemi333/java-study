
public class StringTest14 {
	public static void main(String[] args) {
		String s1 = ""; // 빈 문자열 -> 에러가 아니지만, 문제가 발생할 가능성 높음
		String s2 = null; // null -> 아무곳도 참조하지 않은 상태 -> 에러 발생
		String s3;

		// 방법1 - 연산자 활용
		if (s1 == "") System.out.println("빈 문자열입니다.");

		// 방법2 - 메서드 활용 -> 추천
		// isEmpty(): 빈 문자열인지의 여부를 판별하는 메서드
		if (s1.isEmpty()) System.out.println("빈 문자열입니다.");

		// 방법1 - null은 참조를 비교해야 하므로, 연산자를 통해 비교
		if (s2 == null) System.out.println("널 문자열입니다.");
		
		// null은 값으로 비교할 수 없음
		// if(s2.equals(null)) System.out.println("널 문자열입니다."); // NullPointerException
		// if(s2.compareTo(null) == 0) System.out.println("널 문자열입니다."); // NullPointerException
		// System.out.println(s3);
	}
}
