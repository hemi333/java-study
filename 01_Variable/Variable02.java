
public class Variable02 {
	public static void main(String[] args) {
		// 접미사: 정수 또는 실수 상수 뒤에 붙여서 사용하는 문자
		float pi = 3.14F; // 실수 상수(double)을 float로 인식하도록 하는 것
		long a = 100L; // 정수 상수(int)를 long형으로 인식하도록 하는 것

		// 다음처럼 각 자료형의 MAX, MIN 값을 가져올 수 있다.
		System.out.println(Short.MAX_VALUE); // 32767
		System.out.println(Short.MIN_VALUE); // -32767
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483647
		System.out.println(Long.MAX_VALUE); // 9223372036854775807
		System.out.println(Long.MIN_VALUE); // -9223372036854775807
		System.out.println(Float.MAX_VALUE); // 3.4028235E38
		System.out.println(Float.MIN_VALUE); // 1.4E-45
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE); // 4.9E-324
	}
}
