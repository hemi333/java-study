import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
< ArrayList와 LinkedList의 추가/삭제 시간 비교 >
1. ArrayList  : 순차적인 추가/삭제가 빠름, 비순차적인(중간) 추가/삭제가 느림, 접근속도가 빠름.
2. LinkedList : 순차적인 추가/삭제가 느림, 비순차적인(중간) 추가/삭제가 빠름, 접근속도가 느림.
 */

public class LinkedListTest04 {

	// 순차적인 추가
	public static long add1(List<Integer> list) {
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	// 비순차적인 추가 (중간에서 추가)
	public static long add2(List<Integer> list) {
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			list.add(10, i);
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	// 비순차적인 삭제 (중간에서 삭제)
	public static long remove1(List<Integer> list) {
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			list.remove(i);
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	// 순차적인 삭제
	public static long remove2(List<Integer> list) {
		long startTime = System.nanoTime();
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();

		System.out.println("--- 순차적인 추가 ---");
		System.out.println("ArrayList 시간: " + add1(al) + "ns");      // ArrayList 시간: 22869700ns
		System.out.println("LinkedList 시간: " + add1(ll) + "ns");   // LinkedList 시간: 101704900ns

		System.out.println("--- 비순차적인 추가 ---");
		System.out.println("ArrayList 시간: " + add2(al) + "ns");     // ArrayList 시간: 280810700ns
		System.out.println("LinkedList 시간: " + add2(ll) + "ns");      // LinkedList 시간: 655900ns

		System.out.println("--- 비순차적인 삭제 ---");
		System.out.println("ArrayList 시간: " + remove1(al) + "ns");  // ArrayList 시간: 268729300ns
		System.out.println("LinkedList 시간: " + remove1(ll) + "ns");  // LinkedList 시간: 1794200ns

		System.out.println("--- 순차적인 삭제 ---");
		System.out.println("ArrayList 시간: " + remove2(al) + "ns");    // ArrayList 시간: 8650800ns
		System.out.println("LinkedList 시간: " + remove2(ll) + "ns"); // LinkedList 시간: 11514900ns
	}
}
