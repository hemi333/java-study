import java.util.Iterator;
import java.util.LinkedList;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	// getter
	public int getX() {
		return x;
	}

	public int getY() {
		return y;

	}

	// setter
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 두 개의 인스턴스가 같은지의 여부
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}

public class LinkedListTest03 {
	public static void main(String[] args) {
		// Point 클래스의 인스턴스를 저장하는 LinkedList 생성
		LinkedList<Point> list = new LinkedList<>();

		// 데이터를 10개, 10부터 10씩 증가하는 좌표 10개 추가 (순차적)
		for (int i = 10; i <= 100; i += 10) {
			list.add(new Point(i, i));
		}
		System.out.println(list); // [(10, 10), ... (90, 90), (100, 100)]

		// 맨 뒤에 (110, 110) 데이터 추가 (순차적)
		list.add(new Point(110, 110));
		System.out.println(list); // [(10, 10), ... (90, 90), (100, 100), (110, 110)]

		// (20, 20) 뒤에 (25, 25) 데이터 추가
		// list.add(2, new Point(25, 25));
		for (int i = list.size() - 1; i >= 0; i--) {
			// if (list.get(i).getX() == 20 && list.get(i).getY() == 20) {
			// list.add(i + 1, new Point(25, 25));
			// }
			if (list.get(i).equals(new Point(20, 20))) {
				list.add(i + 1, new Point(25, 25));
			}
		}
		System.out.println(list); // [(10, 10), (20, 20), (25, 25), ... (90, 90), (100, 100), (110, 110)]

		// (50, 50) 데이터 삭제
		// list.remove(5);
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(new Point(50, 50)))
				list.remove(i);
		}
		System.out.println(list); // [... (40, 40), (60, 60), ... (100, 100), (110, 110)]

		// (70, 70) 데이터에 각 좌표의 값을 5씩 더해서 수정
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(new Point(70, 70))) {
				list.set(i, new Point(75, 75));
			}
		}
		System.out.println(list); // [... (60, 60), (75, 75), ... (100, 100), (110, 110)]
		System.out.println("-----");

		// 출력1 - 기본 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

		// 출력2 - 향상된 for문
		for (Point p : list) {
			System.out.println(p);
		}

		// 출력3
		Iterator<Point> it = list.iterator(); // set은 인덱스가 없어서 for문을 쓸 수 없기 때문에 iterator를 쓴다.
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 출력4 - forEach(), 람다식
		list.forEach(i -> System.out.println(i));

		// 출력5 - forEach(), ::연산자 (람다식에서 사용하는 메서드 참조 연산자)
		list.forEach(System.out::println);
	}

}
