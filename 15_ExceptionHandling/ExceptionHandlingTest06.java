/*
< 예외 되던지기 >
- 예외를 처리한 메서드에서 호출한 메서드로 예외를 다시 던져주는 방법
- 호출한 메서드에서도 예외를 알고, 처리할 필요가 있는 경우에 사용함.
- 확실한 예외의 처리를 하고자 하는 경우에 사용함.
 */

public class ExceptionHandlingTest06 {

	public static void method1() throws Exception {
		try {
			throw new Exception("예외 발생...");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("method1()에서 예외를 처리함.");
			// 예외를 되던지기
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("main()에서 예외를 처리함.");
		}
	}
}
