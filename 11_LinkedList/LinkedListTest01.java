import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		// 리스트에 데이터를 추가 (순차적)
		list.add("박준우");
		list.add("유호진");
		list.add("달시오크");
		list.add("페트릭콘");
		list.add("한설희");
		list.add("에덴");
		list.add("DK");
		System.out.println(list);

		// 페트릭콘 다음에 에릭첸 추가 (중간, 비순차적)
		// list.add(4, "에릭첸");
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals("페트릭콘"))
				list.add(i + 1, "에릭첸");

		}
		System.out.println(list);

		// 데이터 삭제 - 달시오크
		// list.remove(2);
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals("달시오크"))
				list.remove(i);
		}
		System.out.println(list);

		// 에덴을 김현준으로 변경
		// list.set(5, "김현준");
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals("에덴")) {
				list.set(i, "김현준");
			}
		}
		System.out.println(list);

		// 출력1 - 기본 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

		// 출력2 - 향상된 for문
		for (String s : list) {
			System.out.println(s);
		}

		// 출력3
		Iterator<String> it = list.iterator(); // set은 인덱스가 없어서 for문을 쓸 수 없기 때문에 iterator를 쓴다.
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 출력4 - forEach(), 람다식
		list.forEach(i -> System.out.println(i));

		// 출력5 - forEach(), ::연산자 (람다식에서 사용하는 메서드 참조 연산자)
		list.forEach(System.out::println);

		System.out.println("-----");

		// LinkedList 클래스의 메서드
	}
}
