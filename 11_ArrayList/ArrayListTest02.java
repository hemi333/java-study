import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
문제)
1. (o)리스트에 정수 배열에 score의 데이터를 저장하시오.
2. (o)리스트에서 60점 미만의 데이터는 삭제하시오.
3. (o)리스트의 총점과 평균을 구하시오.
4. (o)리스트의 최고점수와 최저점수를 구하시오.
5. (o)리스트를 출력하시오. (2가지 방법)
 */

// List 인터페이스
// ArrayList 클래스는 List를 구현한 구현체 클래스
public class ArrayListTest02 {
	public static void main(String[] args) {
		// 단점: List의 메서드만 사용 가능, 장점: List를 구현한 다른 클래스와의 호환(교체)가 용이
		// List<Integer> list = new ArrayList<>();
		//
		// 데이터 추가
		// list = Arrays.asList(95, 88, 75, 63, 52, 77, 47, 48, 93, 91);
		//
		// 리스트 확인
		// System.out.println(list);

		// 장점: ArrayList 클래스의 메서드를 모두 활용
		ArrayList<Integer> list = new ArrayList<>();
		int[] scores = { 95, 88, 75, 63, 52, 77, 47, 48, 93, 91 };

		// 리스트에 정수 배열에 score의 데이터를 저장
		for (int i = 0; i < scores.length; i++) {
			list.add(scores[i]);
		}
		System.out.println(list); // [95, 88, 75, 63, 52, 77, 47, 48, 93, 91]

		// 60점 미만의 데이터 삭제
		// removeIf(): ArrayList 클래스의 메서드, List 인터페이스에는 없음.
		list.removeIf(x -> x < 60);
		System.out.println(list); // [95, 88, 75, 63, 77, 93, 91]

		// 방법1 - 최대점수, 최소 점수
		// compareTo(): 두 개의 문자열의 크기를 비교, 적을 때는 음수, 클 때는 양수, 같을 때는 0
		list.sort((x, y) -> x.compareTo(y)); // 오름차순
		// list.sort((x, y) -> y.compareTo(x)); // 내림차순
		System.out.println(list); // [63, 75, 77, 88, 91, 93, 95]
		System.out.printf("최대점수: %d, 최소점수: %d\n", list.get(list.size() - 1), list.get(0));

		// 방법2 - 최대점수, 최소 점수
		System.out.printf("최대점수: %d, 최소점수: %d\n", Collections.max(list), Collections.min(list));

		// 정렬
		Collections.sort(list); // 오름차순
		Collections.sort(list, Collections.reverseOrder()); // 내림차순
		System.out.println(list); // [95, 93, 91, 88, 77, 75, 63]

		// 리스트를 배열로 저장 -
		Object[] scores1 = list.toArray();
		System.out.println(Arrays.toString(scores1)); // [95, 93, 91, 88, 77, 75, 63]

		Integer[] scores2 = list.toArray(new Integer[0]); // 저장된 리스트의 개수만큼 배열을 생성
		System.out.println(Arrays.toString(scores2)); // [95, 93, 91, 88, 77, 75, 63]

		// 리스트를 배열로 저장 - Integer[] 배열
		Integer[] scores3 = list.toArray(new Integer[10]); // 리스트의 개수보다 큰 값이면, 나머지 공간을 null로 채움.
		System.out.println(Arrays.toString(scores3)); // [95, 93, 91, 88, 77, 75, 63, null, null, null]

	}
}
