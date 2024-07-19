import java.util.Scanner;

// 원의 반지름(실수)을 입력하여 원의 둘레의 원의 면적을 구하는 프로그램을 작성하시오.
// 원의 둘레와 원의 면적은 메서드를 생성하여 사용하시오.
// 메서드명:calcPerimeter, calcArea
public class Method02 {
	// final: 변수, 메소드, 클래스에 대한 변경을 금지(상수)
	// static: 클래스가 로드될 때 단 한 번만 메모리에 할당, 모든 인스턴스에서 공유
	// main method가 static이면 static을 붙여야 함.(static에서는 static만 호출할 수 있음)
	static final double PI = 3.141592;

	static double calcPerimeter(double radius) {
		return 2 * PI * radius;
	}

	static double calcArea(double radius) {
		return PI * radius * radius;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peri, area;

		System.out.print("원의 반지름 입력: ");
		double radius = sc.nextDouble();

		peri = calcPerimeter(radius);
		area = calcArea(radius);

		System.out.printf("원의 둘레: %.2f, 원의 면적: %.2f", peri, area);

		sc.close();
	}

}
