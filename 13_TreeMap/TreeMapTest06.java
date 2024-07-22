import java.util.TreeMap;

public class TreeMapTest06 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 키: 과일 이름, 값: 가격
		TreeMap<String, Integer> map1 = new TreeMap<>();
		TreeMap<String, Integer> map2 = new TreeMap<>();

		// 데이터 추가
		map1.put("grape", 3000);
		map1.put("pineapple", 4500);
		map1.put("cherry", 2700);
		map1.put("apple", 2300);
		map1.put("blueberry", 4300);
		map2.put("melon", 2800);
		map2.put("strawberry", 6300);
		map2.put("watermelon", 15000);
		map2.put("apple", 3400);

		// 확인 - key를 기준으로 오름차순 정렬
		System.out.println(map1); // {apple=2300, blueberry=4300, cherry=2700, grape=3000, pineapple=4500}
		System.out.println(map2); // {apple=3400, melon=2800, strawberry=6300, watermelon=15000}

		// map1에 map2를 합침 - 중복 키는 덮어씀.
		map1.putAll(map2);
		System.out.println(map1); // {apple=3400, blueberry=4300, ... watermelon=15000}
		System.out.println(map2); // {apple=3400, melon=2800, strawberry=6300, watermelon=15000}

		// 키에 대한 값의 변경
		// replace(키, 변경값)
		// cherry 값을 3800으로 변경
		map1.replace("cherry", 3800);
		System.out.println(map1); // {... cherry=3800, ...}

		// replace(키, 이전값, 변경값) -> 확실한 변경을 하고자 할 때
		map1.replace("cherry", 2500, 3800); // 변경 실패
		// map1.replace("cherry", 2700, 3800); // 변경 성공
		System.out.println(map1);

		// 맵 복제
		TreeMap<String, Integer> map3 = (TreeMap<String, Integer>) map2.clone();
		System.out.println(map2);
		System.out.println(map3);
	}
}
