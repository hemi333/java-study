import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerTest01 {
	public static void main(String[] args) {
		String str = "사자/코끼리/기린/하마/표범/치타/하이에나/얼룩말/코뿔소/누";

		// split(): 문자열의 구분기호로 분리한 배열 생성
		String[] animals = str.split("/");
		for (int i = 0; i < animals.length; i++) {
			System.out.println(i + " : " + animals[i]);
		}

		// join(): 문자열의 배열을 특정기호로 연결한 문자열로 생성
		String str2 = String.join("-", animals);
		System.out.println(str2); // 사자-코끼리-기린-하마-표범-치타-하이에나-얼룩말-코뿔소-누
		System.out.println("-----");

		// StringTokenizer - 문자열을 구분기호로 구분하는 클래스
		StringTokenizer st = new StringTokenizer(str, "/");
		System.out.println("토큰 개수: " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("-----");

		// StringJoiner - 문자열의 배열을 특정기호로 연결한 문자열로 생성하는 클래스
		StringJoiner sj = new StringJoiner(",");
		for (String s : animals) {
			sj.add(s);
		}
		System.out.println(sj); // 사자,코끼리,기린,하마,표범,치타,하이에나,얼룩말,코뿔소,누

		// StringJoiner(구분기호, 첫기호, 마지막 기호)
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		for (String s : animals) {
			sj2.add(s);
		}
		System.out.println(sj2); // [사자,코끼리,기린,하마,표범,치타,하이에나,얼룩말,코뿔소,누]
	}
}
