import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
문제) 아래의 작업 지시 사앟을 준수하여 프로그램을 완성하시오.
1. (o)키는 학생이름, 값은 학생의 점수를 저장하는 TreeMap인 map을 완성하시오.
2. (o)학생 데이터를 7개 추가하여 TreeMap의 특징을 확인하시오.
3. (o)키의 중복과 값의 중복을 확인하시오.
4. (o)키를 통해 데이터를 삭제하는 방법 2가지를 구현하시오.
5. (o)map의 모든 데이터를 3가지 방법으로 출력하시오.
 */
public class TreeMapTest02 {
	public static void main(String[] args) {
		// 키: 학생이름(String), 값: 학생의 점수(Integer)
		TreeMap<String, Integer> map = new TreeMap<>();

		// 학생 데이터 7개 추가
		map.put("박준우", 95);
		map.put("유호진", 87);
		map.put("달시오크", 79);
		map.put("패트릭콘", 83);
		map.put("한설희", 92);
		map.put("에덴", 76);
		map.put("DK", 81);

		// TreeMap의 특징 확인 (오름차순)
		System.out.println(map);
// 		{DK=81, 달시오크=79, 박준우=95, 에덴=76, 유호진=87, 패트릭콘=83, 한설희=92}
		System.out.println("학생수: " + map.size()); // 학생수: 7

		// 키의 중복 확인 - 중복을 허용하지 않음
		map.put("박준우", 99);
		System.out.println(map);
// 		{DK=81, 달시오크=79, 박준우=95, 에덴=76, 유호진=87, 패트릭콘=83, 한설희=92}
		System.out.println("학생수: " + map.size()); // 학생수: 7

		// 값의 중복을 확인 - 중복 허용
		map.put("김형준", 95);
		System.out.println(map);
// 		{DK=81, 김형준=95, 달시오크=79, 박준우=99, 에덴=76, 유호진=87, 패트릭콘=83, 한설희=92}
		System.out.println("학생수: " + map.size()); // 학생수: 8

		// 키를 통해 데이터 삭제 1
		map.remove("박준우");
		System.out.println(map);
// 		{DK=81, 김형준=95, 달시오크=79, 에덴=76, 유호진=87, 패트릭콘=83, 한설희=92}
		System.out.println("학생수: " + map.size()); // 학생수: 7

		// 키를 통해 데이터 삭제 2
		map.remove("유호진", 87);
		System.out.println(map);
//		{DK=81, 김형준=95, 달시오크=79, 에덴=76, 패트릭콘=83, 한설희=92}
		System.out.println("학생수: " + map.size()); // 학생수: 6

		// 출력 1
		System.out.println("---출력 1---");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Integer score = map.get(name);
			System.out.printf("%s : %d\n", name, score);
		}

		// 출력 2
		System.out.println("---출력 2---");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> entry = it2.next();
			String name = entry.getKey();
			Integer score = entry.getValue();
			System.out.printf("%s : %d\n", name, score);
		}

		// 출력 3
		System.out.println("---출력 3---");
		Set<Map.Entry<String, Integer>> entrySet2 = map.entrySet();
		for (Map.Entry<String, Integer> e : entrySet2) {
			String name = e.getKey();
			Integer score = e.getValue();
			System.out.printf("%s : %d\n", name, score);
		}
	}
}
