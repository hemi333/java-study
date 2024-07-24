/*
< 쓰레드를 생성하는 방법 >
1. Thread 클래스를 상속하는 클래스
2. Runnable 인터페이스를 구현하는 클래스

- run(): 쓰레드를 만들 때 반드시 오버라이딩 해야 하는 메서드
 */

// 1번 방법
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
}

// 2번 방법
class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}

public class ThreadTest01 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		// t1.run(); // 사용자가 호출하는 메서드가 아님
		t1.start();

//		MyThread2 mt = new MyThread2();
//		Thread t2 = new Thread(mt);
		Thread t2 = new Thread(new MyThread2());
		t2.start();
	}
}
