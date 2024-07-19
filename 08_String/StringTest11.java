import java.util.Arrays;

public class StringTest11 {
	public static void main(String[] args) {
		String str = "tiger, lion, twin, bear, lander, dinos, eagle, giant, hero, wizard";

		// split(구분자): 문자열을 구분자로 잘라서 문자열의 배열을 생성하는 메서드
		String[] symbols = str.split(", ");

		// 배열을 확인하는 메서드
		System.out.println(Arrays.toString(symbols));

		// 배열 출력 1번 - 기본 for문
		for (int i = 0; i < symbols.length; i++) {
			System.out.println(i + " : " + symbols[i]);
		}
		System.out.println();

		// 배열 출력 2번 - 향상된 for문
		for (String s : symbols) {
			System.out.println(s);
		}
		System.out.println();

		String str2 = "tiger/lion|twin.bear lander*dinos,eagle,giant,hero,wizard";
		str2 = str2.replaceAll("[/|.* ]", ",");
		System.out.println(str2);

		// 출력
		String[] logos = str2.split(",");
		for (String s : logos) {
			System.out.println(s);
		}
		System.out.println();

		// split(구분자, 개수): 문자열을 구분자를 통해서 개수만큼 잘라서 문자열의 배열을 생성하는 메서드
		String[] symbols2 = str.split(", ", 4);
		for (int i = 0; i < symbols2.length; i++) {
			System.out.println(i + " : " + symbols2[i]);
		}
	}
}
