package member;

public class SpecialMember extends Member {
	// 인스턴스
	private String privilege;

	// 생성자
	public SpecialMember(String name, String no, int age, String privilege) {
		super(name, no, age);
		this.privilege = privilege;
	}

	// getter
	public String getPrivilege() {
		return privilege;
	}

	// setter
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return super.toString() + "특별혜택 : " + privilege;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("특별혜택: " + privilege);
	}
}
