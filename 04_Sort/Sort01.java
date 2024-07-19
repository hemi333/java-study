public class Sort01 {
	public static void main(String[] args) {
//		int[] a = new int[] { 30, 40, 10, 50, 20 };
		int[] a = new int[] { 98, 84, 77, 58, 62, 68, 54, 75, 89, 75 };

		System.out.print("선택정렬 전: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { // 부등호로 오름차순, 내림차순 정렬 선택
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.printf("%2d회전 후: ", i + 1);
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}

		System.out.print("선택정렬 후: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
