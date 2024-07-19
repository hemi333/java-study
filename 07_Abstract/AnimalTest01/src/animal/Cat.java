package animal;

// 자식 클래스 - 고양이 클래스
public class Cat extends Animal {
	private int age;

	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public void bark() {
		System.out.println("야오옹");
	}

	@Override
	public String toString() {
		return "제 이름은 " + getName() + "이고, 제 나이는 " + age + "살 입니다.";
	}

	// getter
	public int getAge() {
		return age;
	}

	// setter
	public void setAge(int age) {
		this.age = age;
	}

}
