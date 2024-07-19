import java.util.StringTokenizer;

// 문제) 학생들의 점수를 담은 문자열 str을 사용하여 학생수, 총점, 평균을 구하시오.
public class WrapperClassTest03 {
	public static void main(String[] args) {
		String str = "85/88,72|91-56,73/66,87/68,95";
		// 선언
		int cnt = 0, tot = 0;
		double ave = 0.0;

		// 1번 방법 - split() 메서드 사용
		str = str.replaceAll("[/,|-]", ",");
		String[] scores = str.split(",");

		for (int i = 0; i < scores.length; i++) {
			tot += Integer.parseInt(scores[i]);
		}
		cnt = scores.length;
		ave = (double) tot / cnt;

		// 출력
		System.out.printf("학생수: %d, 총점: %d, 평균: %.1f\n", cnt, tot, ave);

		// 2번 방법 - StringTokenizer
		str = "85/88,72|91-56,73/66,87/68,95";
		cnt = 0;
		tot = 0;
		ave = 0.0;
		StringTokenizer st = new StringTokenizer(str, "/,|-");

		cnt = st.countTokens(); // 학생수
		while (st.hasMoreTokens()) {
			String t = st.nextToken();
			tot += Integer.parseInt(t);
		}
		ave = (double) tot / cnt;

		// 출력
		System.out.printf("학생수: %d, 총점: %d, 평균: %.1f", cnt, tot, ave);
	}
}
