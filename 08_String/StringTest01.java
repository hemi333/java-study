
public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		String s4 = "DEF";

		s4 = s1; // s4에 s1을 대입? -> 참조를 대입
		// 버려지는 s4의 데이터는 JVM(Java Virtual Machine)의 이 GC에 의해 처리함.

		System.out.println(s1); // ABC
		System.out.println(s2); // XYZ
		System.out.println(s3); // ABC
		System.out.println(s4); // ABC
		System.out.println();

		// 해시코드(hashcode): 각 인스턴스가 가지는 고유한 아이디 값이지만 이건 값을 지칭하는 코드
		System.out.println(s1.hashCode()); // 64578
		System.out.println(s2.hashCode()); // 87417
		System.out.println(s3.hashCode()); // 64578
		System.out.println(s4.hashCode()); // 64578
		System.out.println();

		// System.identityHashCode(): 실제 인스턴스의 해시코드 출력
		System.out.println(System.identityHashCode(s1)); // 1829164700
		System.out.println(System.identityHashCode(s2)); // 2018699554
		System.out.println(System.identityHashCode(s3)); // 1829164700
		System.out.println(System.identityHashCode(s4)); // 1829164700
	}
}
