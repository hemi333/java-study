package animal;

//자식 클래스 - 강아지 클래스
public class Dog extends Animal {
	private String type;

	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}

	@Override
	public String toString() {
		return "제 이름은 " + getName() + "이고, 견종은 " + type + "입니다.";
	}

	@Override
	public void bark() {
		System.out.println("멍멍");
	};

	// getter
	public String getType() {
		return type;
	}

	// setter
	public void setType(String type) {
		this.type = type;
	}

}
