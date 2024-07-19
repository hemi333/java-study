/*
< Wrapper Class > 래퍼 클래스
- 실제 존재하는 클래스가 아니라 아래에 제시하는 클래스 8개에 대한 통칭으로 사용하는 이름
- Byte, Shot, Integer, Long, Float, Double, Character, Boolean
- 8개의 클래스 기본 데이터타입 8가지에 대응되는 클래스

< Wrapper Class의 사용 목적 >
1. 8가지의 기본 데이터 타입을 객체의 세상에서도 사용하기 위함.
2. 문자열 데이터를 원래의 기본 데이터 타입을 바꿔서 사용하기 위함.
 */

// 박싱(Boxing): 기본형의 데이터를 객체형의 데이터로 만드는 것(감싸는 것)
// 언박싱(UnBoxing): 객체형의 데이터를 기본형의 데이터로 만드는 것
// 오토박싱(Auto-Boxing): 기본형의 데이터를 객체형의 데이터로 만들 때 바로 대입하여 만드는 것
// 오토언박싱(Auto-UnBoxing): 객체형의 데이터를 기본형의 데이터로 만들 때 바로 대입하여 만드는 것
public class WrapperClassTest01 {
	public static void main(String[] args) {
		int i = 10; // 기본형
		Integer ii = new Integer(i); // 객체형, 박싱(Boxing)

		int i2 = ii.intValue(); // 언박싱(UnBoxing)
		System.out.println(i2); // 10
		System.out.println("-----");

		int j = 10; // 기본형
		Integer jj = j; // 객체형, 오토박싱(Auto-Boxing)

		int j2 = jj + 10; // 오토언박싱(Auto-UnBoxing)
		System.out.println(j2); // 20
		System.out.println("-----");

		String s1 = "10"; // 문자열(정수) -> 박싱
		System.out.println(s1 + 20); // 1020
		// System.out.println(s1 - 10); // 에러

		int a = Integer.parseInt(s1) + 20; // 언박싱
		System.out.println(a); // 30

		String s2 = "3.5"; // 문자열(실수) -> 박싱
		System.out.println(s2 + 4.3); // 3.54.3

		double b = Double.parseDouble(s2) + 4.3; // 언박싱
		System.out.println(b); // 7.8

		// String s3 = "1,000";
		// int c = Integer.parseInt(s3) + 500; // NumberFormatException에러

		String s4 = "100";
		double d = Double.parseDouble(s4) + 5.5; // 정수 -> 실수로 변경하는 것은 가능
		System.out.println(d); // 105.5

		// String s5 = "5.5";
		// int e = Integer.parseInt(s5) + 3; // 실수 -> 정수로 변경하는 것은 불가, 예외 발생
		// NumberFormatException에러

		double e = 3.5;
		// int f = Integer.parseInt(e); // parseInt에 double 타입을 넣어서 에러 발생
		System.out.println("-----");
	}
}
