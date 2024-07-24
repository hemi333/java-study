// 공유 프린터
// 공유 자원이 있는 클래스
class SharedPrinter {

	// 공유 자원 - 임계 영역(Critical Section)
	// -> 동기화된 영역
	// 동기화 메서드의 문제점: 메서드가 크고, 처리시간이 오래 걸린다면
	// 메서드 전체를 동기화하지 않고 메서드의 일부분을 동기화 영역으로 설정
	public /* synchronized */ void print(String text) {

		// 메서드의 일부분을 동기화 영역으로 설정하는 방법
		synchronized (this) {
			for (int i = 0; i < text.length(); i++) {
				System.out.print(text.charAt(i));
				Thread.yield();
			}
			System.out.println();
		}

	}
}

// 쓰레드(회사의 공유프린터를 사용하는 사원)
class WorkerThread extends Thread {
	private SharedPrinter p;
	private String[] text;

	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}

	@Override
	public void run() {
		for (int i = 0; i < text.length; i++) {
			p.print(text[i]);
		}

	}
}

public class ThreadTest06 {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();

		// UB40 - Can't Help Falling In Love
		String[] eng = { "wise mes say, Only fools rush in", "But I can't help falling in love with you",
				"Shall I stay, Would it be a sin?", "If I can't help falling in love with you",
				"As the river flows gently to the sea", "Daring so we go, some things were meant to be",
				"Take my head, Take may whole life too", };

		// BTS - 봄날
		String[] kor = { "허공을 떠도는 작은 먼지처럼 날리는 눈이 내리면", "조금 더 빨리 네게 닿을 수 있을 텐데", "눈꽃이 떨어져요 또 조금씩 멀어져요, 보고 싶다",
				"얼마나 기다려야 또 몇 밤을 더 새워야 널 보게 될까", "추운 겨울 끝을 지나 다시 봄날이 올 때까지", "꽃 피울 때까지 그곳에 좀 더 머물러줘",
				"니가 변한 건지 아니면 내가 변한 건지", };

		WorkerThread th1 = new WorkerThread(p, eng);
		WorkerThread th2 = new WorkerThread(p, kor);

		th1.start();
		th2.start();
	}
}
