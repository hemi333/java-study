// scores 배열에는 학생 5명의 국어, 수학, 영어 점수가 저장되어 있다.
// 각 학생의 총점과 평균을 계산하여 학생 데이터와 함께 출력하시오.
public class Array2D02 {
	public static void main(String[] args) {
		int[][] scores = new int[][] { { 93, 93, 92, 0, 0 }, { 85, 85, 96, 0, 0 }, { 71, 71, 72, 0, 0 },
				{ 68, 68, 67, 0, 0 }, { 83, 83, 82, 0, 0 }, }; // 국어, 수학, 영어, 총점, 석차
//		int tot;
//		double ave;
//
//		for (int i = 0; i < scores.length; i++) {
//			tot = 0;
//			for (int j = 0; j < scores[i].length - 1; j++) {
//				tot += scores[i][j];
//			}
//			ave = tot / 3.0; // 평균 계산
//			System.out.printf("학생 %d의 총점: %d, 평균: %.2f%n", i + 1, tot, ave);
//		}

		double[] aves = new double[scores.length];
		String[] grds = new String[scores.length];

		// 총점
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < 3; j++) {
				scores[i][3] += scores[i][j];
			}
		}

		// 석차
		for (int i = 0; i < scores.length; i++) {
			scores[i][4] = 1;
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][3] < scores[j][3]) {
					++scores[i][4]; // 반복문과 함께 변화가 일어나야 한다면 후위
				}

			}
		}

		// 평균
		for (int i = 0; i < scores.length; i++) {
			aves[i] = scores[i][3] / 3.0;
		}

		// 학점
		for (int i = 0; i < scores.length; i++) {
			switch ((int) (aves[i] / 10)) {
			case 10:
			case 9:
				grds[i] = "A";
				break;
			case 8:
				grds[i] = "B";
				break;
			case 7:
				grds[i] = "C";
				break;
			case 6:
				grds[i] = "D";
				break;
			default:
				grds[i] = "F";
				break;
			}
		}

		// 타이틀 출력
		String[] titles = new String[] { "korean", "english", "math", "total", "rank", "average", "grade" };
		for (int i = 0; i < titles.length; i++) {
			System.out.printf("%8s | ", titles[i]);
		}
		System.out.println("");

		// 라인
		for (int i = 0; i < titles.length; i++) {
			System.out.print("-----------");
		}
		System.out.println();

		// 출력
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("%8d | ", scores[i][j]);
			}
			System.out.printf("%8.2f | %8s |\n", aves[i], grds[i]);

		}

	}
}
