import java.util.Scanner;

// 문제) 정수 3개를 입력하여, 최대값과 최소값을 구하시오.
public class Method05 {
	// 1번 방법 - 최대값
	/*
	 * static int calcMax(int x, int y, int z) { int max = x;
	 * 
	 * if (y > max) max = y; if (z > max) max = z;
	 * 
	 * return max; }
	 */

	// 1번 방법 - 최소값
	/*
	 * static int calcMin(int x, int y, int z) { int max = x;
	 * 
	 * if (y < max) max = y; if (z < max) max = z;
	 * 
	 * return max; }
	 */

	// 2번 방법 - 최대값
	// ... 연산자: 가변 인자(수) 연산자
	// 전달 받은 매개변수들을 같은 타입의 1차원 배열로 만들어 줌
	static int calcMax(int... a) {
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	// 2번 방법 - 최소값
	static int calcMin(int... a) {
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.print("첫 번째 정수 입력: ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int y = sc.nextInt();
		System.out.print("세 번째 정수 입력: ");
		int z = sc.nextInt();

		// 메소드 호출
		int max = calcMax(x, y, z);
		int min = calcMin(x, y, z);

		// 출력
		System.out.printf("최대값: %d, 최소값: %d", max, min);

		// 끝
		sc.close();
	}
}
