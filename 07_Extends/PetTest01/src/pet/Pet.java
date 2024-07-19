package pet;

// 부모 클래스 - 애완동물
public class Pet {
	private String name; // 애완동물 이름
	private String masterName; // 주인 이름

	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getMasterName() {
		return masterName;
	}

	// 출력 - 자기 소개
	public void introduce() {
		System.out.println("◆ 내 이름은 " + name + "입니다.");
		System.out.println("◆ 주인님의 이름은 " + masterName + "입니다.");
	}
}
