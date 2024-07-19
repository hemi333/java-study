
public class Array02 {
	public static void main(String[] args) {
		// 3번 - 배열 선언하고, 바로 초기화
		// int[] a = new int[] { 65, 78, 85, 96, 68 };
		int[] a = { 65, 78, 85, 96, 68 }; // 선언하고, 바로 초기화 -> new int[] 생략 가능

//		// 가능
//		int[] a; // int형 1차원 배열의 참조변수
//		a = new int[] { 65, 78, 85, 96, 68 };
//
//		// 불가능
//		int[] a; // int형 1차원 배열의 참조변수
//		a = {65,78,85,96,68};

		int tot = 0;
		double ave = 0;

		// 학생점수 배열 a의 총점과 평균을 구하시오.
		for (int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		ave = (double) tot / a.length;

		System.out.printf("학생 점수 배열 a의 총점: %d, 평균: %.2f", tot, ave);
	}
}
