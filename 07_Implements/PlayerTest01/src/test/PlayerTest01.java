package test;

import player.CDPlayer;
import player.Player;
import player.VideoPlayer;
/*
문제) 아래의 작업 지시 사항을 준수하여 다형성을 구현하시오.
1. Player 인터페이스를 구현한 클래스 인스턴스 각 2개씩 담는 배열을 생성하시오.
2. 반복문을 사용하여 인스턴스 정보를 출력하시오. 
3. CD플레이어는 청소하고, Video플레이어는 제조번호 출력
*/

public class PlayerTest01 {
	public static void main(String[] args) {
		// 1
		Player[] players = new Player[4];
		players[0] = new CDPlayer();
		players[1] = new CDPlayer();
		players[2] = new VideoPlayer();
		players[3] = new VideoPlayer();

		// 2
		// Player[] players = new Player[] { new CDPlayer(), new CDPlayer(), new
		// VideoPlayer(), new VideoPlayer(),};

		// 1
		for (int i = 0; i < players.length; i++) {
			players[i].play();
			players[i].stop();
			if (players[i] instanceof CDPlayer) {
				((CDPlayer) players[i]).clean();
			}
			if (players[i] instanceof VideoPlayer) {
				((VideoPlayer) players[i]).printInfo();
			}
		}

		// 2
		for (Player p : players) {
			p.play();
			p.stop();
			if (p instanceof CDPlayer) {
				((CDPlayer) p).clean();
				System.out.println();
			}
			if (p instanceof VideoPlayer) {
				((VideoPlayer) p).printInfo();
				System.out.println();
			}
		}

	}
}
