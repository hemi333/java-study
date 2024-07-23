import java.util.TreeMap;

/*
< TreeMap >
- 키에 대해 오름차순으로 정렬된 형태로 저장되는 데이터 구조
- tree 알고리즘을 사용하여 root 키를 기준으로 작은 값은 왼쪽, 큰 값을 오른쪽으로 저장하는 방식
- 데이터를 저장할 때 오름차순으로 저장
- 키는 중복이 없음.
- 값은 중복이 있음.
 */

public class TreeMapTest01 {
	public static void main(String[] args) {
		// 키: 사번(Integer), 값: 직원명(String)
		TreeMap<Integer, String> map = new TreeMap<>();

		// 데이터 추가
		map.put(777777, "박준우");
		map.put(222222, "유호진");
		map.put(333333, "달시오크");
		map.put(666666, "패트릭콘");
		map.put(555555, "한설희");
		map.put(111111, "에덴");
		map.put(444444, "DK");

		// 확인 (오름차순)

		System.out.println(map);
// 		{111111=에덴, 222222=유호진, 333333=달시오크, 444444=DK, 555555=한설희, 666666=패트릭콘, 777777=박준우}
		System.out.println("직원수: " + map.size()); // 직원수: 7

		// 키 중복 -> 키에 대한 값을 수정
		map.put(333333, "김현준");
		System.out.println(map);
// 		{111111=에덴, 222222=유호진, 333333=김현준, 444444=DK, 555555=한설희, 666666=패트릭콘, 777777=박준우}
		System.out.println("직원수: " + map.size()); // 직원수: 7

		// 키를 통해서 데이터를 삭제
		map.remove(222222);
		System.out.println(map);
// 		{111111=에덴, 333333=김현준, 444444=DK, 555555=한설희, 666666=패트릭콘, 777777=박준우}
		System.out.println("직원수: " + map.size()); // 직원수: 6
	}
}
