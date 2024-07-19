import java.util.LinkedList;

public class LinkedListTest02 {
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

		// LinkedList 클래스에만 존재하는 메서드

		// 첫 번째 데이터로 에릭첸을 추가
		list.addFirst("에릭첸");
		// list.add(0, "에릭첸");
		System.out.println(list);

		// 마지막 데이터로 김현준을 추가
		list.addLast("김현준");
		// list.add("김현준");
		System.out.println(list);

		// 첫 번째 데이터를 삭제
		// list.removeFirst();
		list.remove(0);
		System.out.println(list);

		// 마지막 데이터를 삭제
		// list.removeLast();
		list.remove(list.size() - 1);
		System.out.println(list);

		// 첫 번째 데이터를 획득
		// System.out.println(list.getFirst());
		System.out.println(list.get(0));

		// 마지막 데이터를 획득
		// System.out.println(list.getLast());
		System.out.println(list.get(list.size() - 1));
	}
}
