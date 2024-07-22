import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Set: 인터페이스, 순서가 없고, 중복 데이터를 허용하지 않음
Set 구현체 클래스: HashSet, LinkedHashSet, TreeSet
HashSet - 장점: 데이터의 추가, 삭제가 빠름. 단점: 정렬되어 있지 않으므로 검색 속도가 느림.
LinkedSashSet - HashSet의 입력순서와 출력순서가 다른 점을 보완하여 입력 순서와 출력 순서를 같게 만듦.
TreeSet - 장점: 오름차순 정렬, 검색 속도가 빠름. 단점: 데이터의 추가, 삭제 속도가 느림.
 */

public class TreeSetTest05 {
	public static void main(String[] args) {
		Set<Integer> lotto1 = new HashSet<>();
		Set<Integer> lotto2 = new TreeSet<>();

		// 6개를 저장
		while (lotto1.size() < 6) {
			int n = (int) (Math.random() * 45) + 1; // 1 ~ 45 사이의 난수
			lotto1.add(n);
			lotto2.add(n);
		}

		System.out.println(lotto1); // 중복되면 6개보다 적게 나옴 / 근데 6개만 나오는디 언제 5개를 볼 수 있담
		System.out.println(lotto2); // 정렬까지 해줌~~
	}
}
