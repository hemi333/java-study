// 배열 - 동일한 자료형의 데이터를 연속된 공간에 저장하기 위한 자료구조 (같은 타입 변수의 집합)
// 선언과 동시에 크기를 지정받기 때문에 고정된 크기를 가짐
// 실제 프로그램이 돌아가면서 항상 고정된크기의 배열을 쓰기는 쉽지 않기 때문에
// 실무에서는 대부분 배열보다는 ArrayList 라는 Collection을 씀

public class Array01 {
	public static void main(String[] args) {
		// 자료형[] 변수 = new 자료형[배열의크기]
		// int[] a; // int형 1차원 배열의 참조변수
		// a = new int[5]; // 배열의 실체를 생성

		int[] a = new int[5];

		a[0] = 10;
		a[2] = 20;
		a[4] = 40;
		// a[5] = 50;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//		System.out.println(a[5]);

		System.out.println(a.length);

//		a.lenght = 10;

		// 인덱스는 0 ~ (배열의 크기 - 1) 의 범위를 가짐
		// 반복문 활용
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
