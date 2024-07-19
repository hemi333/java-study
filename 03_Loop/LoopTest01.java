import java.util.Scanner;

// 정수를 입력하여, 1부터 입력한 정수까지의 짝수를 출력하고, 짝수의 개수와 합계를 구하시오
public class LoopTest01 {
	public static void main(String[] args) {
		// 선언
		int n, cnt = 0, tot = 0;
		// 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력: ");
		n = sc.nextInt();

		// 계산
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				// 출력
				System.out.print(i + " ");
				cnt++;
				tot += i;
			}
		}

		System.out.printf("\n1부터 %d까지의 짝수의 개수:%d 합계:%d", n, cnt, tot);

		//
		// 끝
		sc.close();
	}
}
