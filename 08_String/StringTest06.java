
public class StringTest06 {
	public static void main(String[] args) {
		String s1 = "Hello Java World.hwp";

		// endsWith(): 지정한 문자열로 끝나는 지의 여부
		System.out.println(s1.endsWith("hwp")); // true
		System.out.println(s1.endsWith("txt")); // false

		// 문제) hwp 파일만 업로드 하는 경우
		// suffix : 접미사
		if (s1.endsWith("hwp")) {
			System.out.println("업로드 되었습니다.");
		} else {
			System.out.println("업로드 되지 않았습니다.");
			System.out.println("파일 형식을 hwp 형식으로 변환하여 업로드 하세요!");
		}

		// startsWith(): 지정한 문자열로 시작하는 지의 여부
		System.out.println(s1.startsWith("Hello")); // true
		System.out.println(s1.startsWith("Hi")); // false

		// startsWith(문자열, 시작인덱스): 지정한 문자열이 시작 인덱스에서 시작하는 지의 여부
		String s2 = "HelloJavaHelloJavaJava";
		System.out.println(s2.startsWith("Hello")); // true
		System.out.println(s2.startsWith("Hello", 8)); // false
		System.out.println(s2.startsWith("Hello", 9)); // true
	}
}
