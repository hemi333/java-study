
public class StringBufferTest04 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();

		// append(문자열): 지정 문자열을 추가
		sb1.append("Hello Java World!");
		System.out.println(sb1); // Hello Java World!

		// charAt(인덱스): 인덱스에 해당하는 한 문자
		System.out.println(sb1.charAt(6)); // J

		// deleteCharAt(인덱스): 인덱스에 해당하는 한 문자를 삭제
		sb1.deleteCharAt(11);
		System.out.println(sb1); // Hello Java orld!

		// delete(시작 인덱스,끝 인덱스): 시작 인덱스부터 끝 인덱스 사이의 문자를 삭제, 끝 인덱스는 포함하지 않음
		sb1.delete(6, 10);
		System.out.println(sb1); // Hello orld!

		// insert(인덱스, 문자열): 지정 인덱스에 지정 문자열을 추가(원하는 지점에 넣음)
		sb1.insert(7, "w");
		System.out.println(sb1); // Hello world!
		sb1.insert(6, "Java");
		System.out.println(sb1); // Hello Java world!

		// replace(시작 인덱스,끝 인덱스): 시작 인덱스부터 끝 인덱스 사이를 지정한 문자열로 변경, (시작 인덱스,끝 인덱스): 시작
		// 인덱스부터 끝 인덱스 사이
		sb1.replace(6, 10, "Android");
		System.out.println(sb1); // Hello Android world!
		sb1.replace(0, 5, "Hi");
		System.out.println(sb1); // Hi Android world!
		sb1.replace(16, 17, "?");
		System.out.println(sb1); // Hi Android world?

		// reverse(): 문자열을 거꾸로 생성
		sb1.reverse();
		System.out.println(sb1); // ?dlrow diordnA iH
		sb1.reverse();
		System.out.println(sb1); // Hi Android world?

		// setCharAt(인덱스, 한문자): 인덱스에 해당하는 한문자를 변경
		sb1.setCharAt(3, 'a');
		System.out.println(sb1); // Hi android world?
//		sb1.setCharAt(16, '!');
		sb1.setCharAt(sb1.length() - 1, '!');
		System.out.println(sb1); // Hi android world!

		// setLength(길이): 길이만큼 문자열을 저장, 문자열을 잘라내어 저장할 때 사용
		sb1.setLength(10);
		System.out.println(sb1); // Hi android

		// substring(시작 인덱스,끝 인덱스): 시작 인덱스부터 끝 인덱스 사이의 문자열을 추출, 끝 인덱스는 포함하지 않음
		// return 타입 String이 됨.
		StringBuffer sb2 = new StringBuffer("Hello Java World!");
		String s1 = sb2.substring(6, 10);
		System.out.println(s1); // Java

		String s2 = sb2.substring(11);
		System.out.println(s2); // World!

		String s3 = sb2.substring(11, 16);
		System.out.println(s3); // World

		// indexOf(문자열): 문자열에 해당하는 인덱스
		// - String ,클래스의 메서드와 사용 방법이 동일
		StringBuffer sb3 = new StringBuffer("Hello Java Hallo Java Hallo Java");
		System.out.println(sb3.indexOf("Java")); // 6

		// lastIndexOf(문자열)
		// - String ,클래스의 메서드와 사용 방법이 동일
		System.out.println(sb3.lastIndexOf("Java")); // 28

		// trimToSize(): 크기만큼 용량을 줄임, 메모리의 낭비를 줄일 수 있음
		System.out.println("용량: " + sb3.capacity()); // 용량: 48
		System.out.println("크기: " + sb3.length()); // 크기: 32
		System.out.println("용량: " + sb3.capacity()); // 용량: 48
		System.out.println("크기: " + sb3.length()); // 크기: 32

	}
}
