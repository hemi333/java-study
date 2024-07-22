package fruit;

// Interface Comparable<T> T는 구체화시켜서 사용하라는 뜻
public class Fruit implements Comparable<Fruit> { // java.lang.Comparable
	private String name;
	private int price;
	private int volume;

	public Fruit(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getVolume() {
		return volume;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return String.format("%s(가격: %d, 수량: %d)", name, price, volume);
	}

	// TreeSet에서 사용하는 클래스는
	// - Compareable 인터페이스의 compareTo() 추상메서드를 반드시 오버라이딩 해야 함.
	// - compareTo() 메서드의 정렬 기준이 되는 멤버 변수가 중복 데이터를 허용하지 않는 멤버 변수가 됨.

	// Comparable 인터페이스의 compareTo() 추상메서드를 오버라이딩
//	// 과일 가격을 기준으로 오름차순
//	@Override
//	public int compareTo(Fruit f) {
//		if (this.price > f.price)
//			return 1; // 양수를 리턴 (1이 아니어도 됨)
//		else if (this.price < f.price)
//			return -1; // 음수를 리턴
//		else
//			return 0;
//		// return Integer.compare(this.price, f.price); // 가격을 기준으로 정렬
//	}

//	// 과일 가격을 기준으로 내림차순
//	@Override
//	public int compareTo(Fruit f) {
//		if (this.price > f.price)
//			return -1;
//		else if (this.price < f.price)
//			return 1;
//		else
//			return 0;
//	}

//	// 과일 수 기준으로 오름차순
//	@Override
//	public int compareTo(Fruit f) {
//		if (this.volume > f.volume)
//			return 1;
//		else if (this.volume < f.volume)
//			return -1;
//		else
//			return 0;
//	}

//	// 과일 수 기준으로 내림차순
//	@Override
//	public int compareTo(Fruit f) {
//		if (this.volume > f.volume)
//			return -1;
//		else if (this.volume < f.volume)
//			return 1;
//		else
//			return 0;
//	}

	// 과일 이름을 기준으로 오름차순
	@Override
	public int compareTo(Fruit f) {
		if (this.name.compareTo(f.name) < 0)
			return -1;
		else if (this.name.compareTo(f.name) > 0)
			return 1;
		else
			return 0;
	}

//	// 과일 이름을 기준으로 내림차순
//	@Override
//	public int compareTo(Fruit f) {
//		if (this.name.compareTo(f.name) > 0)
//			return -1;
//		else if (this.name.compareTo(f.name) < 0)
//			return 1;
//		else
//			return 0;
//	}

}
