package pet;

// 자식 클래스 - 애완동물 로봇
public class RobbotPet extends Pet {

	// 생성자
	// super(): 부모 클래스의 생성자를 통해 상속받은 private 멤버의 값을 초기화함.
	public RobbotPet(String name, String masterName) {
		super(name, masterName);
	}

	// 출력 - 자기 소개
	// 오버라이딩(Overriding)
	// Annotation: 자바 컴파일러에게 알려주는 메시지
	@Override // 아래의 메서드는 오버라이딩을 한 메서드, 오버라이딩 하는 메서드는 애노테이션을 붙여줄 것을 권장함.
	public void introduce() {
		System.out.println("◎ 저는 로봇입니다. 이름은 " + getName() + "입니다.");
		System.out.println("◎ 주인님의 이름은 " + getMasterName() + "입니다.");
	}

	// 메소드 추가 - 일을 하는 기능
	public void work(int w) {
		switch (w) {
		case 1:
			System.out.println("청소를 합니다.");
			break;
		case 2:
			System.out.println("빨래를 합니다.");
			break;
		case 3:
			System.out.println("밥을 합니다.");
			break;
		}
	}

}
