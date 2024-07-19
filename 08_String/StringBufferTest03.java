
public class StringBufferTest03 {
	public static void main(String[] args) {
		// String: 새로운 값 대입
		String s1 = "ABC";
		s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println("-----");

		// StringBuffer: 본인을 늘림 (오버로딩, 모든 데이터 타입을 연결함)
		StringBuffer sb1 = new StringBuffer("ABC");
//		sb1.append("DEF");
//		sb1.append(10);
//		sb1.append(3.14);
//		sb1.append(true);
		// 메서드 체이닝 가능
		sb1.append("DEF").append(10).append(3.14).append(true);
		System.out.println(sb1); // ABCDEF103.14true
		System.out.println("-----");

		StringBuffer sb2 = new StringBuffer();
		System.out.println("초기 용량: " + sb2.capacity()); // 초기 용량: 16(바이트)
		System.out.println("초기 크기: " + sb2.length()); // 초기 크기: 0

		sb2.append("Hello Java World!");
		System.out.println("추가 후 용량: " + sb2.capacity()); // 추가 후 용량: 34
		System.out.println("추가 후 크기: " + sb2.length()); // 추가 후 크기: 17
		System.out.println("-----");

		StringBuffer sb3 = new StringBuffer();
		System.out.println("초기 용량: " + sb3.capacity()); // 초기 용량: 16(바이트)
		System.out.println("초기 크기: " + sb3.length()); // 초기 크기: 0
	}
}
