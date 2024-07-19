
public class StringTest12 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";

		// substring(시작 인덱스, 끝 인덱스): 문자열에서 시작 인덱스부터 끝 인덱스 사이를 추출, 끝 인덱스는 포함하지 않음.
		System.out.println(s1.substring(6, 10)); // Java (6~9까지 추출)

		// substring(시작 인덱스): 시작 인덱스부터 문자열의 끝까지 추출
		System.out.println(s1.substring(11));     // World!
		System.out.println(s1.substring(11, 16)); // World

		// contains(문자열): 지정한 문자열을 포함하는지의 여부
		System.out.println(s1.contains("Java")); // true
		System.out.println(s1.contains("java")); // false

		// compareTo(): 두 개의 문자열의 크기를 비교, 적을 때는 음수, 클 때는 양수, 같을 때는 0
		// A B C D E F G H I J K L M N ...
		String str1 = "Hello";
		String str2 = "Java";

		System.out.println(str1.compareTo(str2));    // -2 -> 2만큼 적용, 앞에 있음
		System.out.println(str2.compareTo(str1));    // 2 -> 2만큼 큼, 뒤에 있음
		System.out.println(str1.compareTo("Hello")); // 0 -> 두 문자열의 값이 같을 때
		System.out.println(str2.compareTo("Java"));  // 0
		
		// compareToIgnoreCase(): 두 개의 문자열을 대소문자 구분없이 비교
		System.out.println(str1.compareTo("hello")); // -32
		System.out.println(str2.compareTo("java"));  // -32
		System.out.println(str1.compareToIgnoreCase("hello")); // 0 -> 대소문자 구분 없이 같은
		System.out.println(str2.compareToIgnoreCase("java"));  // 0
		System.out.println();
		
		System.out.println("강".compareTo("바람"));   // -4095, 강이 앞에 있음
		System.out.println("바람".compareTo("강"));   // 4095, 강이 뒤에 있음
		System.out.println("바람".compareTo("바람"));  // 0 -> 같음
	}
}
