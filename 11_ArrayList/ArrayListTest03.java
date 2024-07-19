import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest03 {
	public static void main(String[] args) {
		// List<String> list = new ArrayList<>(); // list.add도 못쓰고 제약이 많음
		ArrayList<String> list = new ArrayList<>();
		String[] magicians = { "박준우", "유호진", "달시오크", "패트릭콘", "한설희", "에덴", "DK" };

		for (String s : magicians) {
			list.add(s);
		}
		System.out.println(list); // [박준우, 유호진, 달시오크, 패트릭콘, 한설희, 에덴, DK]

		// 에릭첸을 유호진 다음에 추가 (비 순차적 추가)
		// list.add(2, "에릭첸");
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals("유호진")) {
				// 유호진 자리가 아니라 그 다음에 넣어야 함
				list.add(i + 1, "에릭첸");
			}
		}
		System.out.println(list); // [박준우, 유호진, 에릭첸, 달시오크, 패트릭콘, 한설희, 에덴, DK]

		// 한설희 삭제
		// list.remove(5); // 인덱스로 삭제
		// list.remove("한설희"); // 문자열일 때는 데이터로도 삭제 가능, Integer일 때는 불가능
		// list.removeIf(x -> x.equals("한설희"));
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals("한설희")) {
				list.remove(i);
			}
		}
		System.out.println(list); // [박준우, 유호진, 에릭첸, 달시오크, 패트릭콘, 에덴, DK]

		// 에덴을 김현준으로 변경
		list.set(5, "김현준");
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals("에덴")) {
				list.set(i, "김현준");
			}
		}
		System.out.println(list); // [박준우, 유호진, 에릭첸, 달시오크, 패트릭콘, 김현준, DK]

		// 오름차순 정렬
		// list.sort((x, y) -> x.compareTo(y));
		Collections.sort(list);
		System.out.println(list); // [DK, 김현준, 달시오크, 박준우, 에릭첸, 유호진, 패트릭콘]

		// 내림차순 정렬
		// list.sort((x, y) -> y.compareTo(x));
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // [패트릭콘, 유호진, 에릭첸, 박준우, 달시오크, 김현준, DK]

		// 리스트를 배열로 생성 - Object[] 배열
		Object[] names1 = list.toArray();
		System.out.println(Arrays.toString(names1)); // [패트릭콘, 유호진, 에릭첸, 박준우, 달시오크, 김현준, DK]

		// 리스트를 배열로 생성 - String[] 배열
		String[] names2 = list.toArray(new String[0]); // 0 ~ 7개 만큼 사용가능(실제 크기)
		System.out.println(Arrays.toString(names2)); // [패트릭콘, 유호진, 에릭첸, 박준우, 달시오크, 김현준, DK]

		// 리스트를 배열로 생성 - String[] 배열 (원래의 데이터타입)
		String[] names3 = list.toArray(new String[10]); // 실제 크기보다 크면 나머지 공간을 null로 채움.
		System.out.println(Arrays.toString(names3)); // [패트릭콘, 유호진, 에릭첸, 박준우, 달시오크, 김현준, DK, null, null, null]

		System.out.println("--- 출력1 ---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();

		System.out.println("--- 출력2 ---");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();

		System.out.println("--- 출력3 ---");
		list.forEach(i -> System.out.println(i));
		System.out.println();

		System.out.println("--- 출력4 ---");
		list.forEach(System.out::println);
		System.out.println();
	}
}
