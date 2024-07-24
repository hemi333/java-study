import javax.swing.JOptionPane;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest03 {
	public static void main(String[] args) {
		// 쓰레드 인스턴스를 동작 (1초마다 숫자가 1씩 줄어든다.)
		MyThread t1 = new MyThread();
		t1.start();

		// main 쓰레드로 동작 (입력창 발생) 이 둘이 동시에 일어남
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.println("당신의 이름은" + name + "입니다.");

	}
}
