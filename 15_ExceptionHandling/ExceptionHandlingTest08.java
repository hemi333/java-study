
class Member {
	private String id;
	private String name;

	public Member(String name, String id) {
		this.id = id;
		this.name = name;
	}

	// getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// setter
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + id + "]" + name;
	}
}

class SpecialMember extends Member {
	private String privilege; // 특별 혜택

	public SpecialMember(String name, String id, String privilege) {
		super(id, name);
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
		return super.toString() + ", 특별 혜택 : " + privilege;
	}
}

class AdditionalMember extends Member {
	private int bonus; // 보너스

	public AdditionalMember(String name, String id, int bonus) {
		super(id, name);
		this.bonus = bonus;
	}

	// getter
	public int getBonus() {
		return bonus;
	}

	// setter
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + ", 보너스  : " + bonus;
	}
}

// 문제) 아래의 작업 지시 사항을 준수하여 프로그램을 완성하시오.
// 1. SpecialMember, AdditionalMember 클래스를 완성하시오.
// 2. 예외가 발생할 수 있는 부분에 대하여 올바르게 예외를 처리하시오.
public class ExceptionHandlingTest08 {
	public static void main(String[] args) {
		SpecialMember sm = new SpecialMember("달시오크", "11111", "1일 무료 쿠폰");
		AdditionalMember am = new AdditionalMember("페트릭콘", "22222", 10000);
		Member m = new Member("에릭치엔", "3333");
		SpecialMember sm2 = null;

		// 예외 발생
		try {
			sm2 = (SpecialMember) m;
		} catch (ClassCastException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}

		try {
			System.out.println(sm2.toString());
		} catch (NullPointerException e) {
			System.err.println(e.getMessage() + "은 출력할 수 없습니다.");
//			e.printStackTrace();
		} finally {
			// 마지막 처리
			System.out.println(sm);
			System.out.println(am);
			System.out.println("정상적으로 프로그램이 종료 되었습니다.");
		}

	}
}
