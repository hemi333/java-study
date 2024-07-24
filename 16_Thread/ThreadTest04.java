class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.printf("%s", new String("-"));
			if (i % 100 == 0)
				System.out.println();
			for (int j = 0; j < 100000000; j++) { // 속도 지연

			}
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.printf("%s", new String("|"));
			if (i % 100 == 0)
				System.out.println();
			for (int j = 0; j < 100000000; j++) { // 속도 지연

			}
		}
	}

}

// 우선순위 : 우선으로 실행하도록 하는 순위, 1~10으로 설정할 수 있음, 기본값 5.
// 데몬 쓰레드(Daemon Thread) : 일반 쓰레드의 작업을 돕는 보조적인 쓰레드, 일반 쓰레드가 종료되면 자동으로 데몬 쓰레드도 종료됨.

public class ThreadTest04 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		System.out.println("t1: " + t1.getName()); // t1: Thread-0
		System.out.println("t2: " + t2.getName()); // t2: Thread-1

		System.out.println("t1 우선순위: " + t1.getPriority()); // t1 우선순위: 5
		System.out.println("t2 우선순위: " + t2.getPriority()); // t2 우선순위: 5

		// 우선순위 변경
		// t1.setPriority(1);
		// t2.setPriority(10);
		//
		// System.out.println("t1 우선순위: " + t1.getPriority()); // t1 우선순위: 1
		// System.out.println("t2 우선순위: " + t2.getPriority()); // t2 우선순위: 10

		System.out.println("데몬 쓰레드 여부: " + t1.isDaemon()); // 데몬 쓰레드 여부: false
		System.out.println("데몬 쓰레드 여부: " + t2.isDaemon()); // 데몬 쓰레드 여부: false

		// 데몬 쓰레드로 변경
		t1.setDaemon(true);

		System.out.println("데몬 쓰레드 여부: " + t1.isDaemon()); // 데몬 쓰레드 여부: true
		System.out.println("데몬 쓰레드 여부: " + t2.isDaemon()); // 데몬 쓰레드 여부: false

		t1.start();
		t2.start();
	}
}
