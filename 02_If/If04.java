import java.util.Scanner;

// 문제) 정수2개(a, b)를 입력하였을 때, 정수 a에는 항상 큰 수가, 정수 b에는 항상 작은 수가 저장 되도록 프로그래밍 하시오. 
public class If04 {
	public static void main(String[] args) {
		// 선언
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.println("정수 a: ");
		int a = sc.nextInt();
		System.out.println("정수 b: ");
		int b = sc.nextInt();

		// 계산
		// 스와핑(swapping): 두 개의 변수 값을 바꾸는 방법
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}

		// 출력
		System.out.printf("a = %d, b = %d", a, b);

		// 끝
		sc.close();

	}
}
