import java.util.HashSet;

public class HashSetTest02 {
	public static void main(String[] args) {
		// 해시셋 생성
		HashSet<String> set = new HashSet<>();
		String[] names = { "박준우", "유호진", "달시오크", "패트릭콘", "한설희", "에덴", "DK" };

		// 데이터 추가
		for (String s : names) {
			set.add(s);
		}
		System.out.println(set); // [달시오크, 패트릭콘, DK, 유호진, 에덴, 한설희, 박준우]
		System.out.println("크기: " + set.size()); // 크기: 7

		// 중복되지 않은 데이터 추가
		set.add("에릭첸");
		System.out.println(set); // [달시오크, 패트릭콘, 에릭첸, DK, 유호진, 에덴, 한설희, 박준우]
		System.out.println("크기: " + set.size()); // 크기: 8

		// 중복 데이터 추가 - 허용하지 않음
		set.add("달시오크");
		System.out.println(set); // [달시오크, 패트릭콘, 에릭첸, DK, 유호진, 에덴, 한설희, 박준우]
		System.out.println("크기: " + set.size()); // 크기: 8

		// 존재하는 데이터 삭제
		set.remove("에덴");
		System.out.println(set); // [달시오크, 패트릭콘, 에릭첸, DK, 유호진, 한설희, 박준우]
		System.out.println("크기: " + set.size()); // 크기: 7

		// 존재하지 않는 데이터 삭제 - 에러가 발생하지 않음
		set.remove("김현준");
		System.out.println(set); // [달시오크, 패트릭콘, 에릭첸, DK, 유호진, 한설희, 박준우]
		System.out.println("크기: " + set.size()); // 크기: 7

		// Set의 메서드 활용

		// 데이터 포함 여부
		System.out.println(set.contains("유호진")); // true
		System.out.println();

		// 셋 생성
		HashSet<String> set2 = new HashSet<>();
		set2.add("한설희");
		set2.add("닥시엘");
		set2.add("도기문");
		System.out.println(set2); // [도기문, 닥시엘, 한설희]
		System.out.println("크기: " + set2.size()); // 크기: 3

		HashSet<String> set3 = new HashSet<>();
		set3.add("한설희");
		set3.add("박준우");
		set3.add("유호진");
		System.out.println(set3); // [유호진, 한설희, 박준우]
		System.out.println("크기: " + set3.size()); // 크기: 3

		// 셋에서 다른 셋의 모든 데이터 포함 여부
		System.out.println(set.containsAll(set2)); // false
		System.out.println(set.containsAll(set3)); // true

		System.out.println(set); // [달시오크, 패트릭콘, 에릭첸, DK, 유호진, 한설희, 박준우]
		System.out.println(set2); // [도기문, 닥시엘, 한설희]
		System.out.println(set3); // [유호진, 한설희, 박준우]

		// 셋에서 다른 셋의 모든 데이터를 추가 - 중복 데이터는 추가하지 않고, 중복되지 않은 데이터는 추가
		set.addAll(set2);
		System.out.println(set); // [달시오크, 패트릭콘, 도기문, 에릭첸, 닥시엘, DK, 유호진, 한설희, 박준우]
		System.out.println(set2); // [도기문, 닥시엘, 한설희]

		// 중복 데이터는 추가하지 않음
		set.addAll(set3);
		System.out.println(set); // [달시오크, 패트릭콘, 도기문, 에릭첸, 닥시엘, DK, 유호진, 한설희, 박준우]
		System.out.println(set3); // [유호진, 한설희, 박준우]

		// 셋의 모든 내용을 삭제
		set.clear();
		System.out.println(set); // []
		System.out.println("크기: " + set.size()); // 크기: 0
	}
}
