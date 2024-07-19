import java.text.DecimalFormat;

// DecimalFormat 클래스: 정수 또는 실수의 포맷 형식을 설정하는 클래스
// #과 0의 방식: #: 의미없는 자리는 무시함. 0: 의미엊ㅄ는 자리도 0으로 표시함
// ,: 전단위 구분기호, .: 소수점 기호 사용
public class DecimalFormatTest01 {
	public static void main(String[] args) {
		double number = 1234567.567;

		DecimalFormat df1 = new DecimalFormat("#,###.####");
		DecimalFormat df2 = new DecimalFormat("0,000.0000");
		DecimalFormat df3 = new DecimalFormat("#,###,###,###.####");
		DecimalFormat df4 = new DecimalFormat("0,000,000,000.0000");
		DecimalFormat df5 = new DecimalFormat("#,###.#");
		DecimalFormat df6 = new DecimalFormat("#,#E0"); // 지수승

		System.out.println(df1.format(number)); // 1,234,567.567
		System.out.println(df2.format(number)); // 1,234,567.5670
		System.out.println(df3.format(number)); // 1,234,567.567
		System.out.println(df4.format(number)); // 0,001,234,567.5670
		System.out.println(df5.format(number)); // 1,234,567.6
		System.out.println(df6.format(number)); // 1.2E6
	}
}
