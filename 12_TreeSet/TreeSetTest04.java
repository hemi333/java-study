import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest04 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();

		// 아스키 코드 순서
		String[] names = { "abc", "alien", "bat", "car", "disco", "dance", "dZZZZ", "dzzzz", "elephant", "elevator",
				"fan", "flower", "d", "a", "바다", "하늘", "나무", "강", "?", "!", };

		for (String s : names) {
			set.add(s);
		}
		System.out.println(set); // [!, ?, a, abc, alien, bat, car, d, dZZZZ, dance, disco, dzzzz, elephant,
									// elevator, fan, flower, 강, 나무, 바다, 하늘]

		// subSet(시작값, 끝값): 끝값은 포함하지 않음
		// a부터 d까지를 부분셋으로 생성 (d는 포함하지 않음)
		SortedSet<String> set2 = set.subSet("a", "d"); // d는 포함하지 않음
		System.out.println(set2); // [a, abc, alien, bat, car]

		// a부터 d까지를 부분셋으로 생성 (d 포함)
		SortedSet<String> set3 = set.subSet("a", "e");
		System.out.println(set3); // [a, abc, alien, bat, car, d, dZZZZ, dance, disco, dzzzz]

		// subSet(시작값, 시작값 포함 여부, 끝값, 끝값 포함 여부): 끝값은 포함하지 않음
		// 시작값 포함 여부의 기본 값: true, 끝값 포함 여부의 기본 값: false,
		// a부터 d까지를 부분셋으로 생성 (d 포함)
		SortedSet<String> set4 = set.subSet("a", true, "d", true);
		System.out.println(set4); // [a, abc, alien, bat, car, d]

		// 한글
		// ㄱ부터 ㄹ까지 부분셋을 생성 (ㄹ은 미포함) -> 잘못된 방법
		// 가부터 라까지 부분셋을 생성
		SortedSet<String> set5 = set.subSet("가", "마");
		System.out.println(set5); // [강, 나무]
	}
}
