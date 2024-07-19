import java.util.Scanner;

// 문제) 국어, 영어, 수학 점수를 정수로 입력하여, 총점, 평균에 대한 학점을 출력하시오.
// 학점은 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 미만은 F로 설정하시오.
// 국어, 영어, 수학, 총점은 정수형 변수, 평균은 실수형 변수, 학점은 문자형 변수를 사용하시오.
// 평균은 소수점 2자리까지 반올림하여 출력
public class If03 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot;
		double ave;
		char grade;

		// 입력
		System.out.println("국어 점수를 정수로 입력하시오.: ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 정수로 입력하시오.: ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 정수로 입력하시오.: ");
		mat = sc.nextInt();

		// 계산
		tot = kor + eng + mat;
		ave = (double) tot / 3;

		if (ave >= 90) {
			grade = 'A';
		} else if (ave >= 80) {
			grade = 'B';
		} else if (ave >= 70) {
			grade = 'C';
		} else if (ave >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		// 출력
		System.out.printf("총점: %d, 평균: %.2f, 학점: %s\n", tot, ave, grade);
		// System.out.printf("총점: %d\n", tot);
		// System.out.printf("평균: %.2f\n", ave);
		// System.out.printf("학점: %s\n", grade);

		// 끝
		sc.close();

	}
}
