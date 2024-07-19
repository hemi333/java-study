import java.util.Scanner;

// 문제) 원의 반지름을 정수로 입력하여 원의 둘레와 원의 면적을 구하시오.
// 원주율은 3.141592의 상수를 사용하시오.

public class Scanner02 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		final double PI = 3.141592;
		double peri, area;

		// 입력
		System.out.println("정수 입력: ");
		int radius = sc.nextInt();
		// next() : 문자열
		// nextInt() : 정수
		// nextDouble() : 실수

		// 계산
		peri = radius * 2 * PI;
		area = radius * radius * PI;

		// 출력
		System.out.println("원의 둘레: " + peri);
		System.out.println("원의 면적: " + area);

		// 끝
		sc.close();
	}
}
