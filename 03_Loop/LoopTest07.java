import java.util.Scanner;

// 문제) 밑면의 길이를 입력하여, 직각 이등변 삼각형을 출력하시오.
// 밑변 높이 입력: 5

public class LoopTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("밑변 길이 입력: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) { // 1 2 3 4 5
			for (int j = 1; j <= n - i; j++) { // 1234 123 12 1
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*"); // 1 12 123 1234 12345
			}
			System.out.println();
		}

		// if문 방식
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (i + j >= 6) { // i = 1, j = 5 / i = 2, j = 4 / i = 3, j = 3 / i = 4, j = 2 / i = 5, j = 1 의 오른쪽 영역
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		sc.close();
	}
}
