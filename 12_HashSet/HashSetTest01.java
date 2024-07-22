import java.util.HashSet;
import java.util.Iterator;

/*
< Set (셋) >
- 인터페이스
- 수학의 집합과 같은 원리의 저장 구조
- 특징: 순서가 없음(인덱스가 없음), 중복값을 허용하지 않음.
- 구현체 클래스: HashSet, LinkedHashSet, TreeSet
 */
public class HashSetTest01 {
	public static void main(String[] args) {
		// 해시셋 생성
		HashSet<Integer> set = new HashSet<>();

		// 데이터 추가 - 순서가 없음(순서대로 출력하지 않음), 해싱 기법을 사용
		set.add(66);
		set.add(75);
		set.add(57);
		set.add(96);
		set.add(45);
		System.out.println(set); // [96, 66, 57, 75, 45]
		System.out.println("크기: " + set.size()); // 크기: 5

		// 중복값 추가 - 허용하지 않음
		set.add(57);
		System.out.println(set); // 에러는 내지 않지만 중복값은 추가하지 않음[96, 66, 57, 75, 45]
		System.out.println("크기: " + set.size()); // 크기: 5

		// 중복값이 아닌걸 추가
		set.add(83);
		System.out.println(set); // [96, 66, 83, 57, 75, 45]
		System.out.println("크기: " + set.size()); // 크기: 6

		// 존재하는 데이터 삭제 - 값을 통해 삭제
		set.remove(96);
		System.out.println(set); // [66, 83, 57, 75, 45]
		System.out.println("크기: " + set.size()); // 크기: 5

		// 존재하지 않는 데이터 삭제 - 에러가 발생하지 않음
		set.remove(80);
		System.out.println(set); // [66, 83, 57, 75, 45]
		System.out.println("크기: " + set.size()); // 크기: 5

		// 출력1 - 향상된 for문
		for (Integer i : set) {
			System.out.println(i);
		}

		// 출력2 - Iterator
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}

		// 출력3 - forEach(), 람다식
		set.forEach(i -> System.out.println(i));

		// 출력4 - forEach(), ::연산자 (람다식에서 사용하는 메서드 참조 연산자)
		set.forEach(System.out::println);

	}
}
