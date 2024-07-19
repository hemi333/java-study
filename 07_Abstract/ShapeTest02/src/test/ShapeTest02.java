package test;

import shape.HorizontalLine;
import shape.Parallelogram;
import shape.Plane2D;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;

/*
문제) 아래의 작업 지시 사항을 준수하여 다형성 프로그램을 완성하시오.
1. (o)인터페이스 Plane(평면)2D 만들고, 면적을 리턴하는 추상 메서드 getArea를 추가하시오.
2. (o)추상 클래스 AbstractSquare을 생성하고, Rectangle과 Parallelogram을 자식 클래스로 만드시오. 
3. (o)밑변과 높이를 가지는 Parallelogram(평행사변형) 클래스를 추가하시오. 
4. (o)면적을 가지는 클래스는 getArea를 오버라이딩 하시오.

-- main 메서드 안에
5. (o)5개 도형의 인스턴스를 담는 배열을 생성하여 다형성을 구현하시오. (2가지 방법)
6. (o)반복문을 사용하여 5개 도형의 정보를 출력하시오. (2가지 방법)
7. (o)면적을 계산하는 인스턴스는 면적 정보를 함께 출력하시오.
*/

public class ShapeTest02 {
	public static void main(String[] args) {
		// 다형성 구현 - 1
		Shape[] shapes = new Shape[5];
		shapes[0] = new Point();
		shapes[1] = new HorizontalLine(5);
		shapes[2] = new Parallelogram(5, 5);
		shapes[3] = new Rectangle(5, 5);
		shapes[4] = new VerticalLine(4);

		// 다형성 구현 - 2
		// Shape[] shapes = new Shape[] {
		// new Point(),
		// new HorizontalLine(5),
		// new Parallelogram(2, 3),
		// new Rectangle(3, 2),
		// new VerticalLine(4)
		// };

		// 반복문 사용 - 1
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].print();
			System.out.println();
			if (shapes[i] instanceof Plane2D) {
				((Plane2D) shapes[i]).getArea();
				System.out.println();
			}
		}

		// 반복문 사용 - 2
		// for (Shape s : shapes) {
		// if (s instanceof Plane) {
		// ((Plane) s).getArea();
		// }
		// s.print();
		// System.out.println();
		// }

	}
}
