import java.util.Scanner;

class Car {
	// 인스턴스 변수(멤버 변수)
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;

	// 생성자
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}

	// getter
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getFuel() {
		return fuel;
	}

	// setter
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	// 차 정보 출력 메소드
	public void putSpec() {
		System.out.println("차 이름: " + name);
		System.out.println("차 너비: " + width);
		System.out.println("차 높이: " + height);
		System.out.println("차 길이: " + length);
	}

	// 자동차 이동 메서드
	public boolean move(double dx, double dy) {
		// 거리 구하는 공식 (√x² + y²)
		double distance = Math.sqrt(dx * dx + dy * dy); // Math.sqrt() : 루트값 구해주는 method

		if (fuel > distance) { // 연료가 더 많기 때문에 움직일 수 있다(이동 가능)
			x += dx;
			y += dy;
			fuel -= distance;
			System.out.println("true");
			System.out.println("fuel" + fuel);
			System.out.println("distance" + distance);
			return true;
		} else { // 이동 불가
			System.out.println("false");
			System.out.println("fuel" + fuel);
			System.out.println("distance" + distance);
			return false;
		}
	}
}

// 문제) 자동차의 재원을 입력하여 인스턴스를 만들고, 거리에 따라 이동할 수 있도록 프로그램을 작성하시오.
public class CarTest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("차 이름: "); String name = sc.next();
		 * System.out.print("차 너비: "); int width = sc.nextInt();
		 * System.out.print("차 높이: "); int height = sc.nextInt();
		 * System.out.print("차 길이: "); int length = sc.nextInt();
		 * System.out.print("차 연료: "); double fuel = sc.nextDouble(); Car car = new
		 * Car(name, width, height, length, fuel);
		 */

		Car car = new Car("메르세데스-벤츠 AMG G클래스", 4875, 1985, 2580, 7.0);

		while (true) {
			System.out.printf("현재 위치: (%.2f, %.2f), 남은 연료: %.2f\n", car.getX(), car.getY(), car.getFuel());
			System.out.print("이동하시겠습니까? (YES: 1, NO: 0)");
			int yn = sc.nextInt();

			if (yn == 0)
				break;

			System.out.println("x방향 이동거리: ");
			double dx = sc.nextDouble();
			System.out.println("y방향 이동거리: ");
			double dy = sc.nextDouble();

			if (!car.move(dx, dy)) {
				System.out.println("연료가 부족합니다!");
				break;
			}
		}
		System.out.println("자동차가 정지하였습니다.");

		sc.close();

	}
}
