import java.util.Scanner;

// 문제) 국어, 영어, 수학 점수를 정수로 입력하여, 총점과 평균을 계산하여 출력하시오.
// kor, eng, mat, tot, ave
// 92, 93, 93

// int 형의 tot를 사용했을 때, 평균에서 소수점이 잘리는 문제점이 발현
// 해결책1) tot를 double형으로 바꿔서 문제를 해결 -> tot는 int형으로 충분하지만 ave의 계산을 위해서 double형으로 바꿈 -> 메모리의 낭비가 발생
// 해결책2) tot를 나누는 정수 3을 실수 3.0으로 바꾸어 해결 -> 함수 3으로 사용하면 될 것을 실수 3.0으로 사용하여 메모리의 낭비가 발생
// 해결책3) 평균을 계산할 때 총점을 double 캐스팅하여 문제를 해결

// Casting(캐스팅) - 사용하는 시점에서 강제로 데이터 타입을 변환하는 것
// 형변환, 강제 형변환
public class Casting01 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int tot;
		double ave;

		// 입력
		System.out.println("국어 점수를 정수로 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 정수로 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 정수로 입력하세요.");
		int mat = sc.nextInt();

		// 계산
		tot = kor + eng + mat;
		ave = (double) tot / 3;

		// 출력
		// System.out.println("총점: " + tot);
		// System.out.println("평균: " + ave);
		// System.out.printf("평균: %6.2f\n", ave);
		System.out.printf("총점: %d\n평균: %6.2f\n", tot, ave);

		// 끝
		sc.close();
	}
}
