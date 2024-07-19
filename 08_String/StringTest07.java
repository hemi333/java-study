
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";

		// charAt(인덱스): 인덱스에 해당하는 한 문자
		System.out.println(s1.charAt(6)); // J

		// indexOf(문자열): 지정한 문자열의 인덱스
		System.out.println(s1.indexOf("J")); // 6
		System.out.println(s1.indexOf("Java")); // 6
		System.out.println(s1.indexOf("java")); // -1: 문자열의 인덱스로는 존재할 수 없는 값(예외 처리가 되어서 에러는 발생하지 않음)

		// lastIndexOf(문자열): 문자열의 끝에서부터 찾았을 때 먼저 찾은 지정한 문자열의 인덱스
		String s2 = "Hello Java World Java Hello Java";
		System.out.println(s2.indexOf("Java")); // 6
		System.out.println(s2.lastIndexOf("Java")); // 28
		System.out.println();

		// indexOf(문자열, 찾는 시작인덱스)
		System.out.println(s2.indexOf("Java")); // 6
		System.out.println(s2.indexOf("Java", 7)); // 17 (7번째 자리부터 찾음)

		// lastIndexOf(문자열, 찾는 끝인덱스)
		System.out.println(s2.lastIndexOf("Java")); // 28
		System.out.println(s2.lastIndexOf("Java", 7)); // 6 -> 0 ~ 7 인덱스의 사이에서 마지막 문자열
		System.out.println(s2.lastIndexOf("Java", 18)); // 17 -> 0 ~ 18 인덱스 사이에서 마지막 문자열
	}
}
