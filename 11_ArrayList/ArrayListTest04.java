import java.util.ArrayList;
import java.util.Iterator;

class Member {
	private String name;
	private String no;
	private int age;

	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public int getAge() {
		return age;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString (이걸 오버라이딩 안하면 해쉬코드가 찍힘 / [Member@6d06d69c, Member@7852e922])
	@Override
	public String toString() {
		return String.format("%s(%s, %d)", no, name, age);
	}
}

public class ArrayListTest04 {
	public static void main(String[] args) {
		// Member 클래스에 인스턴스를 저장하는 리스트를 생성
		ArrayList<Member> list = new ArrayList<>();

		// 데이터 추가
		list.add(new Member("112233", "박준우", 30)); // 참조변수 없이 new로 만드는 걸 익명인스턴스라고 부름
		list.add(new Member("111111", "유호진", 35));
		list.add(new Member("222222", "달시오크", 34));
		list.add(new Member("333333", "페트릭콘", 33));
		list.add(new Member("444444", "한설희", 32));
		list.add(new Member("555555", "예원", 25));
		list.add(new Member("666666", "DK", 36));

		// 데이터 확인
		System.out.println(list.toString());

		// 1. 맨뒤에 추가(순차적)
		list.add(new Member("777777", "에릭첸", 40));
		System.out.println(list);

		// 2. 박준우 다음에 추가(비순차적)
		// list.add(1, new Member("888888", "김현준", 41)); // 작은 양의 데이터일 때
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).getName().equals("박준우")) {
				list.add(i + 1, new Member("888888", "김현준", 41));
			}
		}
		System.out.println(list);

		// 3. 유호진 삭제
		// list.remove(2); // 작은 양의 데이터일 때
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).getName().equals("유호진")) {
				list.remove(i);
			}
		}
		System.out.println(list);

		// 4. 한설희의 나이를 43으로 수정
		// list.set(4, new Member("444444", "한설희", 43)); // 작은 양의 데이터일 때
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).getName().equals("한설희")) {
				list.get(i).setAge(43);
			}
		}
		System.out.println(list);

		// 출력1 - 기본 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

		// 출력2 - 향상된 for문
		for (Member m : list) {
			System.out.println(m);
		}

		// 출력3 - forEach(), 람다식
		list.forEach(i -> System.out.println(i));

		// 출력4 - forEach(), ::연산자 (람다식에서 사용하는 메서드 참조 연산자)
		list.forEach(System.out::println);

		// 출력5
		Iterator<Member> it = list.iterator(); // set은 인덱스가 없어서 for문을 쓸 수 없기 때문에 iterator를 쓴다.
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
