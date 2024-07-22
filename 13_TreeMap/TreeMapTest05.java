import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest05 {
	public static void main(String[] args) {
		// 키: 과일 이름, 값: 가격
		TreeMap<String, Integer> map = new TreeMap<>();

		// 데이터 추가
		map.put("grape", 3000);
		map.put("pineapple", 4500);
		map.put("cherry", 2700);
		map.put("apple", 2300);
		map.put("blueberry", 4300);
		map.put("melon", 2800);
		map.put("strawberry", 6300);
		map.put("watermelon", 15000);
		map.put("g", 8800);

		// 확인 - key를 기준으로 오름차순 정렬
		System.out.println(map);

		// b부터 g앞까지 (b부터 f까지) 부분맵 (g 미포함)
		SortedMap<String, Integer> map2 = map.subMap("b", "g");
		System.out.println(map2); // {blueberry=4300, cherry=2700}

		// b부터 g앞까지 (b부터 f까지) 부분맵 (g 포함)
		SortedMap<String, Integer> map3 = map.subMap("b", true, "g", true);
		System.out.println(map3); // {blueberry=4300, cherry=2700, g=8800}

		// 특정 키의 포함 여부
		// watermelon
		System.out.println(map.containsKey("watermelon")); // true
		// mango
		System.out.println(map.containsKey("mango")); // false

		// 특정 값의 포함 여부
		// 15000
		System.out.println(map.containsValue(15000)); // true
		// 7000
		System.out.println(map.containsValue(7000)); // false

		// 출력 1 - forEach()
		System.out.println("--- 출력1 - forEach() ---");
		map.forEach((k, v) -> System.out.printf("%s(%d)\n", k, v));

		// 출력 2 -
		// pollFirstEntry(): 데이터를 처음 꺼내고, 삭제함
		// polllastEntry(): 데이터를 마지막부터 꺼내고, 삭제함
		System.out.println("--- 출력2 ---");
		while (!map.isEmpty()) {
			System.out.println(map.pollFirstEntry());
		}
		System.out.println(map); // {}
		System.out.println("크기: " + map.size()); // 크기: 0
	}
}
