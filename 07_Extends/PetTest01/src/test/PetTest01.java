package test;

import pet.Pet;
import pet.RobbotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("해피", "강백호");
		happy.introduce();
		System.out.println();

		RobbotPet r2d2 = new RobbotPet("r2d2", "정대만");
		r2d2.introduce();
		System.out.println();

		// 부모 클래스의 참조변수는 자식 클래스 인스턴스를 참조할 수 있다.
		Pet c3po = r2d2;
		// 동적 바인딩(Dynamic Binding) - 실체가 되는 자식의 메서드를 출력한다.
		c3po.introduce();

		// 자식 클래스의 참조변수는 부모 클래스의 인스턴스를 참조할 수 없다.
		// 부모에게는 자식에게 없는 부분이 있기 때문!(자식이 범위가 더 큼)
//		RobbotPet mary = happy;
	}
}
