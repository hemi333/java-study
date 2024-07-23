import java.util.Scanner;

public class ExceptionHandlingTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();

		// 1. 예외 발생
		// int quotient = a / b; // 예외 발생 지점
		// int remainder = a % b;
		//
		// 결과 <- 예외가 발생하더라도 정상적인 처리가 되어야 한다.
		// System.out.println("몫: " + quotient);
		// System.out.println("나머지: " + remainder);

		// 예외처리: try ~ catch로 해결, 함께 사용.
		// try 블럭: 예외가 발생할 수 있는 코드를 적용
		// catch 블럭: 예외가 발생했을 때 처리 코드를 적용
		// 1. 예외가 발생하지 않았을 때: try -> 나머지 처리
		// 2. 예외가 발생했을 때 : try -> catch -> 나머지 처리
		int quotient = 0;
		int remainder = 0;

		try {
			quotient = a / b;
			remainder = a % b;
		} catch (ArithmeticException e) {
			e.printStackTrace(); // 경로까지 추적
			// System.err.println(e.getMessage());
			// System.err.println("0으로는 나눌 수 없습니다.");
		}

		System.out.println("몫: " + quotient);
		System.out.println("나머지: " + remainder);

		sc.close();
	}
}
