public class Sort02 {
	public static void main(String[] args) {
//		int[] a = new int[] { 30, 40, 10, 50, 20 };
		int[] a = new int[] { 98, 84, 77, 58, 62, 68, 54, 75, 89, 75 };
		boolean flag = false;

		System.out.print("버블 정렬 전: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < a.length - 1; i++) {
			flag = true;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = false;
				}
			}
			if (flag == true)
				break;
			System.out.printf("%3d회전 후: ", i + 1);
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();

		}

		System.out.print("버블 정렬 후: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
