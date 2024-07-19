import java.util.Scanner;

// 정수 1개를 입력하여, 1부터 입력한 수까지의
// 3의 배수를 출력하고, 3의 배수의 개수와 합,
// 4의 배수를 출력하고, 4의 배수의 개수와 합,
// 3의  배수이면서 4의 배수의 배수를 출력하고, 3의  배수이면서 4의 배수의 개수와 합을 구하시오
// 보완점: 값의 출력 부분을 정수인 배열로 만들어 활용

public class LoopTest02 {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		// 선언
		int cnt3 = 0, tot3 = 0, cnt4 = 0, tot4 = 0, cnt34 = 0, tot34 = 0;
		String str3 = "", str4 = "", str34 = "";

		System.out.print("정수 입력: ");
		int n = sc.nextInt();

		// 계산
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				++cnt3;
				tot3 += i;
				str3 += i + " "; // 연결
			}

			if (i % 4 == 0) {
				++cnt4;
				tot4 += i;
				str4 += i + " ";
			}

			if (i % 3 == 0 && i % 4 == 0) {
				++cnt34;
				tot34 += i;
				str34 += i + " ";
			}
		}

		// 출력
		System.out.printf("1부터 %d까지의 3의 배수의 출력: %s", n, str3);
		System.out.printf("\n1부터 %d까지의 3의 배수의 개수: %d, 합계: %d", n, cnt3, tot3);
		System.out.printf("\n1부터 %d까지의 4의 배수의 출력: %s", n, str4);
		System.out.printf("\n1부터 %d까지의 4의 배수의 개수: %d, 합계: %d", n, cnt4, tot4);
		System.out.printf("\n1부터 %d까지의 3의 배수이면서 4의 배수의 출력: %s", n, str34);
		System.out.printf("\n1부터 %d까지의 3의 배수이면서 4의 배수의 개수: %d, 합계: %d", n, cnt34, tot34);

		// 끝
		sc.close();
	}
}
