
public class StringTest04 {
	public static void main(String[] args) {
		// String s1; // 아무것도 참조하고 있지 않다. -> 에러 발생
		String s1 = null; // null로 초기화
		String s2 = ""; // 빈 문자열로 초기화

		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
//		System.out.println(s1.hashCode()); // java.lang.NullPointerException 오류
		System.out.println(s2.hashCode());
		System.out.println();
		System.out.println(System.identityHashCode(s2));
		System.out.println();

		// 문자의 배열
		char[] c = new char[] { 'H', 'e', 'l', 'l', 'o' }; // println 호출되기 전에 이미 메서드 오버로딩이 되어 있다
		System.out.println(c);

		String s3 = new String(c);
		System.out.println(s3);
	}
}
