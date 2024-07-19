import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력1: ");
		String s1 = sc.next();
		System.out.print("문자열 입력2: ");
		String s2 = sc.next();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println();

		// 문자열 비교: ==
		// -> 잘못된 방법, 참조를 비교하므로, 항상 다르다고 판단.
		if (s1 == s2) {
			System.out.println("두 개의 문자열은 같습니다.");
		} else {
			System.out.println("두 개의 문자열은 다릅니다.");
		}
		System.out.println();

		// 문자열 비교: equals() 메서드
		// -> 옳은 방법, Object의 equals() 메서드를 String 클래스에서 값을 비교하도록 오버라이딩함.
		// Object 클래스의 equals() 메서드는 참조를 비교함.
		if (s1.equals(s2)) {
			System.out.println("두 개의 문자열은 같습니다.");
		} else {
			System.out.println("두 개의 문자열은 다릅니다.");
		}
		System.out.println();

		// 3. 문자를 비교: 대소문자를 구분하지 않고 비교 -> equalsIgnoreCase()
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("두 개의 문자열은 같습니다.");
		} else {
			System.out.println("두 개의 문자열은 다릅니다.");
		}
		System.out.println();

		sc.close();
	}
}
