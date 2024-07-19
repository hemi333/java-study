
public class StringBufferTest02 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");

		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("-----");

		// == 참조를 비교 : 잘못된 방법
		if (sb1 == sb2) { // 참조를 비교하기 때문에 "두 문자열은 다릅니다." 출력
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

		// equals() : 잘못된 방법
		// StringBuffer 클래스는 Object 클래스의 equals() 메서드를 오버라이딩하지 않음
		// Object 클래스의 equals 메서드를 그대로 사용함. -> 참조를 비교
		if (sb1.equals(sb2)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

		// 해결책
		// StringBuffer 클래스의 인스턴스를 비교할 때는 String 클래스로 변경하여 비교함.
		// String 클래스만 equals() 메서드를 오버라이딩 함
		String s1 = sb1.toString();
		String s2 = sb2.toString();
//		if (sb1.toString().equals(sb2.toString())) {
		if (s1.equals(s2)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

	}
}
