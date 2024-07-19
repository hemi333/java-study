import java.util.Scanner;

// 완전수(Perfect Number) 구하기
// 완전수: 자신을 제외한 약수의 합이 자신과 같아지는 수
// 6, 28, 496, 8128, ...
// 문제) 정수를 입력하여 입력한 수까지 중에서의 완전수를 출력하고, 합과 개수를 출력하시오.
public class LoopTest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, cnt = 0, tot = 0;

		System.out.print("정수 입력: ");
		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) { // 1,2,3,...20
			sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) { // i = 6, j = 1,2,3,6
					sum += j;
				}
			}
			if (i == sum) {
				System.out.print(i + " ");
				++cnt;
				tot += i;
			}
		}

		System.out.printf("\n완전수의 개수: %d, 완전수의 합: %d", cnt, tot);

		sc.close();
	}
}
