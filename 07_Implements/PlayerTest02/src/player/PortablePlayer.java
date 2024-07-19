package player;

// 다중상속(부모가 2이상..)은 불가하나 다중 구현은 된다~~
public class PortablePlayer implements Player, Skinnable {

	@Override
	public void play() {
		System.out.println("◈ 포터블 플레이어 재생 @@@");
	}

	@Override
	public void stop() {
		System.out.println("◈ 포터블 플레이어 중지 @@@");
	}

	@Override
	public void changeSkin(int skin) {
		System.out.println("스킨을 ");
		switch (skin) {
		// 구현하고 있는 클래스이므로 Skinnable.RED에서 Skinnable을 생략할 수 있다.
		// case Skinnable.RED:
		case RED:
			System.out.println("빨강");
			break;
		case Skinnable.GREEN:
			System.out.println("초록");
			break;
		case Skinnable.BLUE:
			System.out.println("파랑");
			break;
		case Skinnable.BLACK:
			System.out.println("검정");
			break;
		case Skinnable.LEOPARD:
			System.out.println("레오파드");
			break;
		default:
			System.out.println("흰색");
			break;
		}
		System.out.println("으로 변경하였습니다.");
	}
}
