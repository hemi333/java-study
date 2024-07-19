import java.util.Scanner;

// 문제) 정수를 입력하여 입력한 수의 약수를 출력하고, 약수의 개수와 합계를 출력하시오.
public class LoopTest09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0, tot = 0;

		System.out.print("정수 입력: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf(i + " ");
				++cnt;
				tot += i;
			}
		}

		System.out.printf("\n%d의 약수 개수: %d, %d의 약수 합계: %d", n, cnt, n, tot);

		sc.close();
	}
}
