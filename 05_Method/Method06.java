import java.util.Scanner;

public class Method06 {
	// 최대값
	static int calcMax(int[] a) { // 배열로 던져서 배열로 받음
		int max = a[0];
		/*
		 * for (int i = 1; i < a.length; i++) { if (a[i] > max) max = a[i]; }
		 */
		for (int i : a) {
			if (i > max)
				max = i;
		}
		return max;
	}

	// 최소값
	static int calcMin(int[] a) {
		int min = a[0];
		/*
		 * for (int i = 1; i < a.length; i++) { if (a[i] < min) min = a[i]; }
		 */

		for (int i : a) {
			if (i < min)
				min = i;

		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사용할 정수의 개수를 입력하시오. ");
		int n = sc.nextInt();

		// 배열 개수 결정
		int[] a = new int[n];

		// 입력
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력: ");
			a[i] = sc.nextInt();
		}

		// 메소드 호출
		int max = calcMax(a);
		int min = calcMin(a);

		// 출력
		System.out.printf("최대값: %d, 최소값: %d", max, min);

		// 끝
		sc.close();
	}
}
