import java.util.StringTokenizer;

/*
StringTokenizer 클래스
- 문자열을 토큰으로 분리하는 클래스

 */
public class StringTokenizerTest01 {
	public static void main(String[] args) {
		String str = "tiger,lion,twin,bear,lander,dinos,eagle,giant,hero,wizard";

		// split(): 문자열을 구분기호로 분리하여 문자열의 배열을 생성하는 메서드
		String[] bases = str.split(",");
		for (int i = 0; i < bases.length; i++) {
			System.out.println(i + " : " + bases[i]);
		}
		System.out.println();

		// StringTokenizer 클래스 사용
		// StringTokenizer(문자열, 구분기호)
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰의 개수: " + st.countTokens()); // 토큰의 개수: 10
		while (st.hasMoreTokens()) { // 토큰이 더 있니~?
			String t = st.nextToken();
			System.out.println(t);
		}
		System.out.println();

		String str2 = "tiger/lion|twin bear.lander+dinos-eagle_giant,hero,wizard";
		StringTokenizer st2 = new StringTokenizer(str2, "/| .+-_,");
		System.out.println("토큰의 개수: " + st2.countTokens()); // 토큰의 개수: 10
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

		// StringTokenizer(문자열, 구분기호, 구분기호의 포함여부): 구분기호의 포함여부의 기본값은 false
		StringTokenizer st3 = new StringTokenizer(str2, "/| .+-_,", true);
		System.out.println("토큰의 개수: " + st3.countTokens()); // 토큰의 개수: 19

	}
}
