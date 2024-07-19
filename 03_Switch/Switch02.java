import java.util.Scanner;

// 문제) 국어, 영어, 수학 점수를 입력하여 총점, 평균, 학점을 계산하시오.
// 학점 부분은 switch문으로 작성하시오.
// 
public class Switch02 {
	public static void main(String[] args) {
		// 선언
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot;
		double ave;
		char grade;

		// 입력
		System.out.println("국어 점수: ");
		kor = sc.nextInt();
		System.out.println("영어 점수: ");
		eng = sc.nextInt();
		System.out.println("수학 점수: ");
		mat = sc.nextInt();

		// 계산
		tot = kor + eng + mat;
		ave = (double) tot / 3;

		switch ((int) ave / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		// 출력
		System.out.printf("총점: %d, 평균: %.2f, 학점: %c", tot, ave, grade);

		// 끝
		sc.close();

	}
}
