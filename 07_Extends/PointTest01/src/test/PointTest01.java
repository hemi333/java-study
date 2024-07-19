package test;

//import point.*;
import point.Point2D;
import point.Point3D;

public class PointTest01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 20); // Ctrl + Shift로 import할 내용 확인
		Point3D p2 = new Point3D(50, 60, 70);

		System.out.println(p1);
		System.out.println(p2);
	}
}
