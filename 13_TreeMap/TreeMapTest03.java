import java.util.TreeMap;

public class TreeMapTest03 {
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
//		{68=DK, 75=달시오크, 80=한설희, 82=에덴, 87=박준우, 95=패트릭콘, 98=유호진}
		System.out.println("가장 작은 점수: " + map.firstKey()); // 가장 작은 점수: 68
		System.out.println("가장 큰 점수: " + map.lastKey()); // 가장 큰 점수: 98

		// 가장 작은 점수와 학생 이름
		// Map.Entry<Integer, String> entry = map.firstEntry();
		System.out.printf("가장 작은 점수와 학생 이름: %d(%s)\n", map.firstEntry().getKey(), map.firstEntry().getValue()); // 68(DK)

		// 가장 큰 점수와 학생 이름
		System.out.printf("가장 큰 점수와 학생 이름: %d(%s)\n", map.lastEntry().getKey(), map.lastEntry().getValue()); // 98(유호진)

		// 특정 점수 바로 아래 점수, 특정 점수 바로 위 점수 (특정 점수 포함하지 않음)
		// 95점
		System.out.println("95점 바로 아래 점수: " + map.lowerKey(95)); // 87
		System.out.println("95점 바로 위 점수: " + map.higherKey(95)); // 98

		// 특정 점수 바로 아래 점수와 이름 (특정 점수 포함하지 않음)
		// 95점
		System.out.printf("95점 바로 아래 점수: %d(%s)\n", map.lowerEntry(95).getKey(), map.lowerEntry(95).getValue()); // 87(박준우)

		// 특정 점수 바로 위 점수와 이름 (특정 점수 포함하지 않음)
		// 95점
		System.out.printf("95점 바로 아래 점수: %d(%s)\n", map.higherEntry(95).getKey(), map.higherEntry(95).getValue()); // 98(유호진)

		// 특정 점수이거나 바로 아래 점수, 특정 점수이거나 바로 위 점수 (특정 점수 포함)
		// 95점
		System.out.println("95점이거나 바로 아래 점수: " + map.floorKey(95)); // 95
		System.out.println("95점이거나 바로 위 점수: " + map.ceilingKey(95)); // 95

		// 특정 점수이거나 바로 아래 점수와 이름 (특정 점수 포함)
		System.out.printf("95점 바로 아래 점수: %d(%s)\n", map.floorEntry(95).getKey(), map.floorEntry(95).getValue()); // 95(패트릭콘)

		// 특정 점수이거나 바로 위 점수와 이름 (특정 점수 포함)
		System.out.printf("95점 바로 아래 점수: %d(%s)\n", map.ceilingEntry(95).getKey(), map.ceilingEntry(95).getValue()); // 95(패트릭콘)

	}
}
