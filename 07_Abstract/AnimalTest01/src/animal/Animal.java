package animal;

// 동물 클래스 (추상 메서드를 만드려면 클래스도 추상 클래스여야 한다 abstract를 둘 다 붙여야 함)
// 추상 클래스 <- 부모 클래스
public abstract class Animal {
	// 인스턴스
	private String name;

	// 생성자
	public Animal(String name) {
		this.name = name;
	}

	// abstract : 추상 메서드 (Abstract method)
	public abstract void bark();

	// 추상 메서드
	// 비추상 메서드를 추상 메서드로 오버라이딩 할 수 있다.
	public abstract String toString();

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	// 소개(출력) 메서드
	// 상속받은 자식 클래스에서 사용할 목적으로 만든 메서드
	public void introduce() {
		// 오버라이딩 된 실제 메서드를 호출했다고 생각하기 떄문에 오류가 발생하지 않음(추상 클래스는 자식에게 쓸 목적이기 때문)
		System.out.println(toString());
		bark();
	}
}
