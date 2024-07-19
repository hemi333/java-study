
public class StringTest02 {
	public static void main(String[] args) {
		// 01에서는 참조가 같으면 같다 / 02에서는 값이 같으면 같다
		// new로 만들면 서로 다른 인스턴스 값이다.
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");

		System.out.println(s1); // ABC
		System.out.println(s2); // XYZ
		System.out.println(s3); // ABC
		System.out.println();

		// 해시코드(hashcode): String 클래스의 hashCode()메서드는 인스턴스가 아니라 값에 대하여 비교하도록 오버라이딩해 놓았다.
		System.out.println(s1.hashCode()); // 64578
		System.out.println(s2.hashCode()); // 87417
		System.out.println(s3.hashCode()); // 64578
		System.out.println();

		// System.identityHashCode(): 실제 인스턴스의 해시코드 출력
		System.out.println(System.identityHashCode(s1)); // 1829164700
		System.out.println(System.identityHashCode(s2)); // 2018699554
		System.out.println(System.identityHashCode(s3)); // 1311053135
	}
}
