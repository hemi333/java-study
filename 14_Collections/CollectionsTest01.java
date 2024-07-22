import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
< Collections >
- 모든 컬렉션에 사용할 수 있는 메서드를 가지고 있는 클래스
- 거의 대부분의 메소드는 static으로 구현되어 있음.
 */

public class CollectionsTest01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// 데이터 추가
		// list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		Collections.addAll(list, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println(list);

		// 오른쪽으로 2칸씩 이동
		Collections.rotate(list, 2);
		System.out.println(list); // [90, 100, 10, 20, 30, 40, 50, 60, 70, 80]

		// 인덱스를 통한 데이터의 교환
		Collections.swap(list, 2, 5);
		System.out.println(list); // [90, 100, 40, 20, 30, 10, 50, 60, 70, 80]

		// 값을 섞어서 임의의 자리에 넣음
		Collections.shuffle(list);
		System.out.println(list); // [70, 40, 90, 80, 20, 50, 10, 100, 60, 30]

		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); // [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]

		// 역순으로 나타냄
		Collections.reverse(list);
		System.out.println(list); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

		// 최대값, 최소값
		System.out.println("최대값: " + Collections.max(list)); // 최대값: 100
		System.out.println("최소값: " + Collections.min(list)); // 최소값: 10

		// 이전 데이터를 특정 데이터로 바꿈
		Collections.replaceAll(list, 70, 1);
		System.out.println(list); // [10, 20, 30, 40, 50, 60, 1, 80, 90, 100]

		// 모든 데이터를 특정 데이터로 채움
		Collections.fill(list, 7);
		System.out.println(list); // [7, 7, 7, 7, 7, 7, 7, 7, 7, 7]

	}
}
