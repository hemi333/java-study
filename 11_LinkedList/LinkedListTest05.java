import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
< ArrayList와 LinkedList 접근 시간 측정 >
1. ArrayList  : 접근이 훨씬 빠름
2. LinkedList : 접근이 매우 느림
 */
public class LinkedListTest05 {

	// 데이터 추가
	public static void add(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
	}

	// 접근 시간 측정
	public static long access(List<Integer> list) {
		long startTime = System.nanoTime();
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();

		System.out.println("--- 데이터 추가 ---");
		add(al);
		add(ll);

		System.out.println("--- 접근 시간 측정 ---");
		System.out.println("ArrayList 시간: " + access(al) + "ns");      // ArrayList 시간: 4305500ns
		System.out.println("LinkedList 시간: " + access(ll) + "ns"); // LinkedList 시간: 4203419700ns
	}
}
