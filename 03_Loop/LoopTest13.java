import java.util.Scanner;

// 팩토리얼 구하기
// 5! = 1 * 2 * 3 * 4 * 5 = 120
public class LoopTest13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;

		System.out.print("정수 입력: ");
		int n = sc.nextInt();

		System.out.printf("%d! = ", n);
		for (int i = 1; i <= n; i++) {
			fact *= i;
			if (i < n) {
				System.out.print(i + " * ");
			} else {
				System.out.print(i);
			}
		}
		System.out.printf(" = %d", fact);

		sc.close();
	}
}
