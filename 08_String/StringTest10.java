
public class StringTest10 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";

		// toLowerCase(): 모든 문자를 소문자로 변경
		System.out.println(s1.toLowerCase());
		System.out.println(s1);

		// toUpperCase(): 모든 문자를 대문자로 변경
		System.out.println(s1.toUpperCase());
		System.out.println(s1);

		// trim(): 문자열의 앞뒤 공백을 제거
		String s2 = "     Hello     Java     ";
		System.out.println(s2 + "*"); //      Hello     Java     *
		System.out.println(s2.trim() + "*"); // Hello     Java*
	}
}
