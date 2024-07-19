
public class StringBufferTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(s1.hashCode()); // 64578
		System.out.println(System.identityHashCode(s1)); // 1829164700
		System.out.println("-----");

		s1 += "DEF";
		System.out.println(s1);
		System.out.println(s1.hashCode()); // 1923910755
		System.out.println(System.identityHashCode(s1)); // 2018699554

		// String 클래스의 문제점: String 클래스는 값을 추가하거나, 삭제할 때 인스턴스를 변경(교체)한다.(있는거에 추가가 아니라 아예
		// 새로운 것으로 변경)
		// String 클래스는 값을 추가하기 전의 해시코드와 값을 추가한 후의 해시코드가 다르다.
		// String 클래스의 특성: immutable한 특성, 변경할 수 없는 특성(매번 인스턴스를 새롭게 만듦)

		// String 클래스의 보완 : StringBuffer 클래스를 사용하면,
		// 문자열의 값을 추가 또는 삭제 시에 기존의 인스턴스를 그대로 사용하게 되며, 인스턴스를 변경하지 않아도 된다.
		// StringBuffer 클래스의 특성: mutable한 특성, 변경할 수 있는 특성(그대로 값을 증가, 감소함)

		StringBuffer sb = new StringBuffer("ABC");
		System.out.println(sb); // toString() 생략가능
		System.out.println(System.identityHashCode(sb)); // 1311053135

		// sb += "DEF"; // 에러
		sb.append("DEF");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb)); // 1311053135
	}
}
