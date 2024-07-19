
public class StringTest09 {
	public static void main(String[] args) {
		// replaceAll() 메서드와 정규식 활용
		// replaceAll(이전 문자열, 변경할 문자열): 이전 문자열을 변경할 문자열로 모두 다 변경
		// -> 정규 표현식(Regular Expession)을 활용하여 문자열을 변경할 수 있음

		// [0-9]: 0~9까지 정수
		String s5 = "새로 나온 캘럭시 S24 울트라 가격은 1,650,000원 입니다.";
		String str = s5.replaceAll("[0-9]", "*");
		System.out.println(str);

		// 특수문자를 변경
		String s2 = "Hello! Hi? * + $ & -";
		System.out.println(s2.replaceAll("[!]", "YES")); // HelloYES Hi? * + $ & -
		System.out.println(s2);

		str = s2.replaceAll("[!]", "YES"); // Hello! Hi? * + $ & -
		System.out.println(str); // HelloYES Hi? * + $ & -
		System.out.println();

		System.out.println(s2.replaceAll("[!]", "OK"));
		System.out.println(s2.replaceAll("[?]", "OK"));
		System.out.println(s2.replaceAll("[*]", "OK"));
		System.out.println(s2.replaceAll("[+]", "OK"));
		System.out.println(s2.replaceAll("[$]", "OK"));
		System.out.println(s2.replaceAll("[&]", "OK"));
		System.out.println(s2.replaceAll("[!?*+$&-]", "OK")); // HelloOK HiOK OK OK OK OK OK
		System.out.println();

		// \\특수문자: 특수문자를 변경
		String s3 = "This is Notebook.[LG GRAM]";
		// System.out.println(s3.replaceAll("[[]", "*")); // 에러
		// (java.util.regex.PatternSyntaxException)
		System.out.println(s3.replaceAll("\\[", "*")); // This is Notebook.*LG GRAM]
		System.out.println(s3.replaceAll("\\]", "*")); // This is Notebook.[LG GRAM*
		System.out.println(s3.replaceAll("\\[]", "*")); // 변경되지 않음

		// .(점): 정규식에서는 모든 문자를 의미
		// replaceAll(): 정규식을 사용하는 메서드
		String s4 = "Hello. Java. World.";
		System.out.println(s4.replace(".", "~")); // Hello~ Java~ World~
		System.out.println(s4.replaceAll(".", "~")); // ~~~~~~~~~~~~~~~~~~~
	}
}
