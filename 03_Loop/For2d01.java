// 중첩 반복문, 이중 반복문, 2차원 반복문
public class For2d01 {
	public static void main(String[] args) {

		// 1번 - 구구단 - 세로방향
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				// System.out.println(i + " x " + j + " = " + (i * j));
//				System.out.printf("%d x %d = %2d\n", i, j, i * j);
//			}
//			System.out.println();
//		}

		// end

		// 2번 - 구구단 - 가로방향
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d ", j, i, j * i);
			}
		}
		System.out.println();
	}
}
