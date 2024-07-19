import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();

		System.out.println("용량: " + v.capacity()); // 용량: 10
		System.out.println("크기: " + v.size()); // 크기: 0

		// 데이터 추가
		v.add(10);v.add(20);v.add(30);v.add(40);v.add(50);
		System.out.println("용량: " + v.capacity()); // 용량: 10
		System.out.println("크기: " + v.size()); // 크기: 5

		// 데이터 추가
		v.add(10);v.add(20);v.add(30);v.add(40);v.add(50);
		System.out.println("용량: " + v.capacity()); // 용량: 10
		System.out.println("크기: " + v.size()); // 크기: 10

		// 데이터 추가
		v.add(10);v.add(20);v.add(30);v.add(40);v.add(50);
		System.out.println("용량: " + v.capacity()); // 용량: 20
		System.out.println("크기: " + v.size()); // 크기: 15

		// 데이터 추가
		v.add(10);v.add(20);v.add(30);v.add(40);v.add(50);
		System.out.println("용량: " + v.capacity()); // 용량: 20
		System.out.println("크기: " + v.size()); // 크기: 20

		// 데이터 추가
		v.add(10);v.add(20);v.add(30);v.add(40);v.add(50);
		System.out.println("용량: " + v.capacity()); // 용량: 40
		System.out.println("크기: " + v.size()); // 크기: 25

		// 용량을 크기와 같게 맞춤
		v.trimToSize();
		System.out.println("용량: " + v.capacity()); // 용량: 25
		System.out.println("크기: " + v.size()); // 크기: 25

	}
}
