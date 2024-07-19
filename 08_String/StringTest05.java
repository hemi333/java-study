
public class StringTest05 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";

		// length() : 문자열의 길이
		System.out.println("글자수: " + s1.length());
		// charAt(인덱스): 인덱스에 해당하는 한 문자
		System.out.println(s1.charAt(6)); // 인덱스에 해당하는 문자를 구함
		// concat(): 두 개의 문자열을 연결, + 연산자와 같은 역할
		System.out.println(s1.concat(" Korea"));
		System.out.println(s1); // concat을 사용함으로써 실제로 " Korea"가 합쳐지진 않았다.

		s1 = s1.concat(" Korea");
		System.out.println(s1); // 실제로 " Korea"가 합쳐짐.

		String s2 = "Hi! ";
		System.out.println(s2 + s1);
		System.out.println(s2);

		s2 += s1;
		System.out.println(s2);
	}
}
