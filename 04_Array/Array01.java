// 배열 - 같은 타입 변수의 집합

public class Array01 {
	public static void main(String[] args) {
//		int[] a; // int형 1차원 배열의 참조변수
//		a = new int[5]; // 배열의 실체를 생성

		int[] a = new int[5];

		a[0] = 10;
		a[2] = 20;
		a[4] = 40;
//		a[5] = 50;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//		System.out.println(a[5]);

		System.out.println(a.length);

//		a.lenght = 10;

		// 반복문 활용
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
