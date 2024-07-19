package player;

public class CDPlayer implements Player {

	@Override
	public void play() {
		System.out.println("◎CD 플레이어 재생 ~~~~~");
	}

	@Override
	public void stop() {
		System.out.println("◎CD 플레이어 중지 ~~~~~");
	}

	// CD 플레이어 청소
	public void clean() {
		System.out.println("●CD 플레이어의 헤드를 청소합니다.");
	}

}
