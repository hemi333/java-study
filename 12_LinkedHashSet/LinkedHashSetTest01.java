import java.util.HashSet;
import java.util.LinkedHashSet;

/*
< LinkedHashSet >
- HashSet을 상속하는 자식 클래스
- HashSet은 입력한 대로 출력되지 않았지만, LinkedHashSet은 입력한 대로 출력이 되도록 만듦
- 일반적인 다른 기능은 HashSet과 동일함.
*/

public class LinkedHashSetTest01 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

		// 데이터 추가
		set1.add(65);
		set1.add(57);
		set1.add(78);
		set1.add(93);
		set1.add(86);

		set2.add(65);
		set2.add(57);
		set2.add(78);
		set2.add(93);
		set2.add(86);
		System.out.println(set1); // [65, 86, 57, 93, 78]
		System.out.println(set2); // [65, 57, 78, 93, 86]

		HashSet<String> set3 = new HashSet<>();
		LinkedHashSet<String> set4 = new LinkedHashSet<>();

		// 데이터 추가
		set3.add("박준우");
		set3.add("유호진");
		set3.add("달시오크");
		set3.add("패트릭콘");
		set3.add("한설희");

		set4.add("박준우");
		set4.add("유호진");
		set4.add("달시오크");
		set4.add("패트릭콘");
		set4.add("한설희");
		System.out.println(set3); // [달시오크, 패트릭콘, 유호진, 한설희, 박준우]
		System.out.println(set4); // [박준우, 유호진, 달시오크, 패트릭콘, 한설희]
	}
}
