import java.util.TreeSet;

/*
< TreeSet >
- 데이터를 추가할 때 root node를 기준으로 적은 것은 왼쪽, 큰 것은 오른쪽으로 추가하여 저장함.
- 데이터를 읽을 때는 왼쪽 아래의 leaf node부터 오른쪽으로 차례대로 읽음
- 왼쪽부터 오름차순으로 데이터가 저장되어 있음.
- 데이터가 저장된 모양이 나무의 모양과 흡사하여 Tree 구조가 됨.
- 장점: 오름차순으로 정렬되어 여러 가지 방법으로 활용할 수 있음.
- 단점: 데이터를 추가할 때 비교를 하므로 추가시에 많은 시간이 소요됨.
 */
public class TreeSetTest01 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();

		// root(82)기준으로 순서대로 트리구조로 뻗어나감 (데이터를 넣을 때 작은값 큰 값을 나누어서 넣음)
		// 데이터 넣을 때마다 비교하기 떄문에 시간이 매우 오래 걸림
		// 82 -> 63 -> 58(63보다 작으니 하위) -> 97(63보다 크니 다른 노드) -> 76(63보다 크고 58보다 작으니 63의
		// 하위 다른노드)

		// 중복되지 않은 데이터 추가
		set.add(82);
		set.add(63);
		set.add(58);
		set.add(97);
		set.add(76);
		set.add(92);
		set.add(78);
		set.add(67);
		System.out.println(set); // [58, 63, 67, 76, 78, 82, 92, 97]
		System.out.println("크기: " + set.size()); // 크기: 8

		// 중복된 데이터 추가 -> 허용하지 않음
		set.add(97);
		System.out.println(set); // [58, 63, 67, 76, 78, 82, 92, 97]
		System.out.println("크기: " + set.size()); // 크기: 8

		// 존재하는 데이터 삭제
		set.remove(82);
		System.out.println(set); // [58, 63, 67, 76, 78, 92, 97]
		System.out.println("크기: " + set.size()); // 크기: 7

		// 존재하지 않는 데이터 삭제
		set.remove(11);
		System.out.println(set); // [58, 63, 67, 76, 78, 92, 97]
		System.out.println("크기: " + set.size()); // 크기: 7

		TreeSet<String> set2 = new TreeSet<>();

		// 중복되지 않은 데이터 추가
		set2.add("박준우");
		set2.add("유호진");
		set2.add("달시오크");
		set2.add("패트릭콘");
		set2.add("한설희");
		set2.add("에덴");
		set2.add("DK");
		System.out.println(set2); // [DK, 달시오크, 박준우, 에덴, 유호진, 패트릭콘, 한설희]
		System.out.println("크기: " + set2.size()); // 크기: 7

		// 중복된 데이터 추가 -> 허용하지 않음
		set2.add("한설희");
		System.out.println(set2); // [DK, 달시오크, 박준우, 에덴, 유호진, 패트릭콘, 한설희]
		System.out.println("크기: " + set2.size()); // 크기: 7

		// 존재하는 데이터 삭제
		set2.remove("에덴");
		System.out.println(set2); // [DK, 달시오크, 박준우, 유호진, 패트릭콘, 한설희]
		System.out.println("크기: " + set2.size()); // 크기: 6

		// 존재하지 않는 데이터 삭제
		set2.remove("김현준");
		System.out.println(set2); // [DK, 달시오크, 박준우, 유호진, 패트릭콘, 한설희]
		System.out.println("크기: " + set2.size()); // 크기: 6
	}
}
