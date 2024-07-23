/*
< 예외를 처리하는 방법 >
1. 예외를 직접 처리하는 방법
- try ~ catch 블록을 사용
2. 예외를 전가하는 방법
- 예외를 던지는 방법
- throw 키워드를 사용하는 방법
- 메서드를 호출한 곳으로 예외 처리를 전가하는 (던지는) 방법

< 예외를 처리하는 방법의 차이 >
1. 예외를 직접 처리하는 방법
- 장점: 예외를 직접 처리하기 때문에 견고한 프로그램을 만들 수 있음.
- 단점: 예외처리 코드가 많아지고, 코드가 복잡해짐. 해당 메서드에서 예외가 발생했단느 사실을 파악하기 어려움.
2. 예외를 전가하는 방법
- 장점: 여러 메서드에서 발생하는 예외를 한번에 모아서 처리할 수 있고, 코드가 간결해짐. 메서드명에 예외 전가가 있어 예외가 발생한 메서드라는 것을 파악하기가 용이함.
- 단점: 예외를 직접 처리하지 않고, 전가하므로 발생하는 여러 가지 문제가 발생할 수 있음.

-> 예외를 전가하더라도 어딘가에서는 직접 예외를 처리하는 것이 좋음.
 */

public class ExceptionHandlingTest05 {
	public static void method2() throws Exception {
		// 2번 - 예외 전가
		throw new Exception("method2()에서 예외 발생...");

		// 1번 - 직접 처리
//		try {
//			throw new Exception("method2()에서 예외 발생...");
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//			System.err.println("method2()에서 예외를 처리함***");
//		}

	}

	// 2번 - 예외 전가
	public static void method1() throws Exception {
		method2();

		// 1번 - 직접 예외 처리
//		try {
//			method2();
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//			System.err.println("method1()에서 예외를 처리함***");
//		}

	}

	// 2번 - 예외 전가
	public static void main(String[] args) throws Exception {
		method1();

		// - 1번 직접 예외 처리
//		try {
//			method1();
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//			System.err.println("main()에서 예외를 처리함***");
//		}
	}
}
