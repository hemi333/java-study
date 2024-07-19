
public class Array2D01 {
	public static void main(String[] args) {
		// 권장
		// int[][] a;

		// 비추
		// int a[][];
		// int[] a[];

		// 1번 방법
		// int[][] a = new int[3][4];

		// 2번 방법
		int[][] a;
		a = new int[3][];
		a[0] = new int[4];
		a[1] = new int[4];
		a[2] = new int[4];

		a[1][2] = 7;
		a[2][1] = 5;
		// a[2][4] = 9; // error

		// 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}
}
