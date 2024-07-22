import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 수박은 하나지만 수박의 속성은 여러가지 (멤버 변수) 수박의 색, 수박의 이름, 수박의 가격, ... 등등

Map(맵)
- 인터페이스
- 데이터는 키(Key)와 값(Value)의 쌍으로 구성됨.
- Map은 순서가 없음.
- Key는 중복이 없음.
- Value은 중복이 있음.
- 구현체 클래스: HashMap, LinkedHashMap, TreeMap
 */
public class HashMapTest01 {
	public static void main(String[] args) {
		// 학생 데이터, 키: 학번(Integer), 값: 이름(String)
		HashMap<Integer, String> map = new HashMap<>();

		// 데이터 추가 -> 맵은 순서가 없음 (입력한 순서대로 출력하지는 않음)
		map.put(111111, "박준우");
		map.put(222222, "유호진");
		map.put(333333, "달시오크");
		map.put(444444, "패트릭콘");
		map.put(555555, "한설희");
		System.out.println(map); // {333333=달시오크, 111111=박준우, 444444=패트릭콘, 555555=한설희, 222222=유호진}
		System.out.println("크기: " + map.size()); // 크기: 5

		// 중복 키를 입력 -> 허용하지 않음 -> 키에 해당하는 값이 변경
		// 키에 대한 값을 수정하는 방법
		map.put(444444, "에릭첸");
		System.out.println(map); // {333333=달시오크, 111111=박준우, 444444=에릭첸, 555555=한설희, 222222=유호진}
		System.out.println("크기: " + map.size()); // 크기: 5

		// 중복 값을 입력 -> 허용함
		map.put(666666, "한설희");
		System.out.println(map); // {333333=달시오크, 666666=한설희, 111111=박준우, 444444=에릭첸, 555555=한설희, 222222=유호진}
		System.out.println("크기: " + map.size()); // 크기: 6

		// 데이터를 삭제
		// 1. 키를 삭제하면 데이터가 삭제됨.
		map.remove(555555);
		System.out.println(map); // {333333=달시오크, 666666=한설희, 111111=박준우, 444444=에릭첸, 222222=유호진}
		System.out.println("크기: " + map.size()); // 크기: 5

		// 2. 키와 값을 모두 만족할 때 삭제
		map.remove(333333, "달시"); // 키만 만족하면 삭제 불가
		System.out.println(map); // {333333=달시오크, 666666=한설희, 111111=박준우, 444444=에릭첸, 222222=유호진}
		System.out.println("크기: " + map.size()); //

		map.remove(333333, "달시오크"); // 키와 값을 모두 만족하면 삭제
		System.out.println(map); // {666666=한설희, 111111=박준우, 444444=에릭첸, 222222=유호진}
		System.out.println("크기: " + map.size()); // 크기: 4
		System.out.println("-----");

		// 출력 - 키를 통해서 값을 찾는다.

		// 출력1 - keySet(), Iterator를 사용
		Set<Integer> keys = map.keySet(); // 키의 셋을 생성
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer no = it.next(); // key
			String name = map.get(no); // key에 해당하는 value
			System.out.printf("%d(%s)\n", no, name);
		}
		System.out.println("-----");

		// 출력2 - entrySet(), Map.Entry, Iterator을 사용
		// Map.Entry: 키와 값을 함꼐 저장하는 인터페이스
		// Set은 값 하나만 저장함 (그래서 인터페이스 안의 인터페이스로 구현)
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry<Integer, String> entry = it2.next();
			Integer no = entry.getKey();
			String name = entry.getValue();
			System.out.printf("%d(%s)\n", no, name);
		}
		System.out.println("-----");

		// 출력3 -entrySet(), Map.Entry, 확장 for문을 사용 (Iterator는 필요 없음)
		Set<Map.Entry<Integer, String>> entrySet2 = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet2) { // 확장 for문은 Iterator를 내장하고 있음
			Integer no = entry.getKey();
			String name = entry.getValue();
			System.out.printf("%d(%s)\n", no, name);
		}
		System.out.println("-----");

	}
}
