
public class Variable01 {
	public static void main(String[] args) {
		// 변수 선언
		// 1번
		// int a; // 변수 선언 - 메모리에 정수를 저장하는 4Byte의 공간을 마련하고, 이름을 a라고 붙여 놓은 것
		// a = 10; // 값을 대입, 초기화 - 최초로 변수에 값을 대입하는 것

		// 2번
		// int a = 10; // 변수 선언하고, 초기화
		// int b = 20;

		// 3번
		// int a, b;
		// a = 10;
		// b = 20;

		int a = 10, b = 20; // 같은 타입의 변수를 여러 개 선언하고, 초기화

		System.out.println("a + b = " + (a + b));

		int 강아지 = 10; // 권장하지 않음.
		System.out.println(강아지);

		// 클래스나 변수에 final을 붙이면 처음 정의된 상태가 변하지 않는 것을 보장한다는 의미

		// final double PI;
		// PI = 3.14;
		// PI = 3.5; // error -> 2번째 대입은 허용하지 않음.

		final double PI = 3.14;
		// PI = 3.5; // error -> 2번째 대입은 허용하지 않음.

	}

}
