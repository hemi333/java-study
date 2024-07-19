
public class StringTest08 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";

		// replace(이전 문자열, 변경할 문자열): 이전 문자열을 변경할 문자열로 변경
		System.out.println(s1.replace("!", "?")); // Hello Java World?
		System.out.println(s1); // Hello Java World!

		s1 = s1.replace("!", "?");
		System.out.println(s1); // Hello Java World?

		// replace(): 일치하는 모든 문자열을 변경
		// 정규식을 사용할 수 없음
		String s2 = "Hello Java Hello Java Hello Java";
		s2 = s2.replace("Java", "Oracle");
		System.out.println(s2); // Hello Oracle Hello Oracle Hello Oracle

		// replaceFirst(이전 문자열, 변경할 문자열): 이전 문자열에서 첫 번째 문자열만 변경할 문자열로 변경
		// 정규식을 사용할 수 있음
		String s3 = "Hello Java Hello Java Hello Java";
		s3 = s3.replaceFirst("Java", "Oracle");
		System.out.println(s3); // Hello Oracle Hello Java Hello Java

		// replaceAll(이전 문자열, 변경할 문자열): 이전 문자열을 변경할 문자열로 모두 다 변경
		// -> 정규 표현식(Regular Expession)을 활용하여 문자열을 변경할 수 있음
		String s4 = "Hello Java Hello Java Hello Java";
		s4 = s4.replaceAll("Java", "Oracle");
		System.out.println(s4); // Hello Oracle Hello Oracle Hello Oracle

		// [0-9]: 0~9까지 정수
		String s5 = "새로 나온 캘럭시 S24 울트라 가격은 1,650,000원 입니다.";
		String str = s5.replaceAll("[0-9]", "*");
		System.out.println(str);
	}
}
