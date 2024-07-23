/*

< 예외를 처리하는 방법 >
1. 예외를 직접 처리하는 방법
- try ~ catch 블럭을 사용

2. 예외를 전가하는 방법
- 예외를 던지는 방법
- throw 키워드를 사용하는 방법
- 메서드를 호출한 곳으로 예외 처리를 전가하는(던지는) 방법

 */
public class ExceptionHandlingTest04 {
	// 2. 예외를 전가하는 방법
	public static void main(String[] args) /* throws Exception */ {
		// 1. 예외를 직접 처리하는 방법
		try {
			// 예외 생성
			// Exception e = new Exception("고의로 예외를 발생시킴...");
			// throw e;
			throw new Exception("고의로 예외를 발생시킴...");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
