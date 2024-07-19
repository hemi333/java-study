import java.util.Scanner;

// 문제) 정수 2개를 입력하여 최대값과 최소값을 구하시오.
// calcMax, calcMin
public class Method04 {
	// 메소드 선언
	static int calcMax(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}

	}

	static int calcMin(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.print("첫 번째 정수: ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수: ");
		int y = sc.nextInt();

		// 메소드 호출
		int max = calcMax(x, y);
		int min = calcMin(x, y);

		// 출력
		System.out.printf("최대값: %d, 최소값: %d", max, min);

		sc.close();
	}
}
