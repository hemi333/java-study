package player;

public class VideoPlayer implements Player {
	private int count = 0;
	private int id;

	public VideoPlayer() {
		id = ++count;
	}

	@Override
	public void play() {
		System.out.println("■ 비디오 플레이어 재생 ###");
	}

	@Override
	public void stop() {
		System.out.println("■ 비디오 플레이어 중지 ###");
	}

	// getter
	public int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	// 제조번호 출력 메서드
	public void printInfo() {
		System.out.println("□ 제조번호: " + id);
	}

}
