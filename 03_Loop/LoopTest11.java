import java.util.Scanner;

// 소수(Prime Number)
// 1과 자신으로만 나누어 떨어지는 수
// 2, 3, 5, 7, 11, 13, 17, 19, 23 ...
// 방법론) 에라토스테네스의 체

// 문제) 정수를 입력하여, 입력한 수까지의 소수를 출력하고, 개수와 합계를 구하시오.
public class LoopTest11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0, tot = 0;

		System.out.print("정수 입력: ");
		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				if (i == j) {
					System.out.println(i + " ");
					++cnt;
					tot += i;
				}
				if (i % j == 0) {
					break;
				}

			}
		}

		System.out.printf("\n소수의 개수: %d, 소수의 합: %d", cnt, tot);

		sc.close();

	}
}
