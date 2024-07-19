import java.util.LinkedList;
import java.util.Queue;

/*
Queue(큐)
- 한 방향으로 데이터가 이동하는 파이프처럼 생긴 저장 구조
- 선입선출: First In Frist Out(FIFO)
- offer: 큐에서 데이터를 추가하는 작업
- poll: 큐에서 데이터를 꺼내는 작업, 꺼내고 나면 데이터는 삭제됨.
 */
public class QueueTest01 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();

		// 데이터 추가
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		System.out.println(q1); // [10, 20, 30]
		System.out.println("크기: " + q1.size()); // 크기: 3

		// 데이터를 꺼냄
		while (!q1.isEmpty()) {
			System.out.println(q1.poll()); // 10 20 30
		}
		System.out.println(q1); // []
		System.out.println("크기: " + q1.size()); // 크기: 0
		System.out.println("-----");

		Queue<String> q2 = new LinkedList<>();

		// 데이터 추가
		q2.offer("박준우");
		q2.offer("유호진");
		q2.offer("달시오크");
		System.out.println(q2); // [박준우, 유호진, 달시오크]
		System.out.println("크기: " + q2.size()); // 크기: 3

		// 데이터를 꺼냄
		while (!q2.isEmpty()) {
			System.out.println(q2.poll()); // 박준우 유호진 달시오크
		}
		System.out.println(q2); // []
		System.out.println("크기: " + q2.size()); // 크기: 0
		System.out.println("-----");
	}
}
