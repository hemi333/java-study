import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
	public static void main(String[] args) {
		// 키: 학생의 점수(Integer), 값: 학생이름(String)
		TreeMap<Integer, String> map = new TreeMap<>();

		// 학생 데이터 7개 추가
		map.put(87, "박준우");
		map.put(98, "유호진");
		map.put(75, "달시오크");
		map.put(95, "패트릭콘");
		map.put(80, "한설희");
		map.put(82, "에덴");
		map.put(68, "DK");

		// 확인 - 키를 기준으로 오름차순 정렬
		System.out.println(map);

		// 특정 점수보다 작은 값을 가진 부분맵 (특정 점수 미포함) - 기본값 false
		SortedMap<Integer, String> map2 = map.headMap(80);
		System.out.println("80점보다 작은 값을 가진 부분맵: " + map2); // {68=DK, 75=달시오크}

		// 특정 점수보다 작은 값을 가진 부분맵 (특정 점수 포함)
		SortedMap<Integer, String> map3 = map.headMap(80, true);
		System.out.println("80점보다 작은 값을 가진 부분맵: " + map3); // {68=DK, 75=달시오크, 80=한설희}

		// 특정 점수보다 큰 값을 가진 부분맵 (특정 점수 포함) - 기본값 true
		SortedMap<Integer, String> map4 = map.tailMap(80);
		System.out.println("80점보다 작은 값을 가진 부분맵: " + map4); // {80=한설희, 82=에덴, 87=박준우, 95=패트릭콘, 98=유호진}

		// 특정 점수보다 큰 값을 가진 부분맵 (특정 점수 미포함)
		SortedMap<Integer, String> map5 = map.tailMap(80, false);
		System.out.println("80점보다 작은 값을 가진 부분맵: " + map5); // {82=에덴, 87=박준우, 95=패트릭콘, 98=유호진}

		// 내림차순 맵
		NavigableMap<Integer, String> map6 = map.descendingMap();
		System.out.println("내림차순 맵: " + map6); // {98=유호진, 95=패트릭콘, 87=박준우, 82=에덴, 80=한설희, 75=달시오크, 68=DK}

	}
}
