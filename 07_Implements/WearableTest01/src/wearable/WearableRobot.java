package wearable;

/*
문제) 아래의 작업 지시 사항을 준수하여 프로그래밍을 완성하시오.
1. Wearable, Color 인터페이스를 구현하시오. (implements)
2. 인스턴스 변수 color를 추가하시오.
3. 인스턴스 변수를 초기화하는 생성자를 추가하시오.
4. Color에 따라 인스턴스의 색상을 리턴하는 toString() 메서드를 추가하시오.
 */
public class WearableRobot implements Wearable, Color {

	private String name;
	private int color;

	public WearableRobot(int color) {
		this.color = color;
	}

	@Override
	public void putOn() {
		System.out.println("♣ " + toString(color) + " 착용~~~~");
	}

	@Override
	public void putOff() {
		System.out.println("♣ " + toString(color) + " 해제~~~~");
	}

	@Override
	public void changeColor(int color) {
		this.color = color;
	}

	@Override
	public String toString(int color) {
		switch (color) {
		case Color.RED:
			return "빨간 로봇";
		case Color.GREEN:
			return "초록 로봇";
		case Color.BLUE:
			return "파란 로봇";
		case Color.YELLOW:
			return "노란 로봇";
		case Color.BLACK:
			return "검은 로봇";
		default:
			return "흰색 로봇";
		}
	}

	// getter
	public int getColor(int color) {
		return color;
	}

}
