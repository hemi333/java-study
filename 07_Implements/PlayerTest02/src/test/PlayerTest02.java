package test;

import player.PortablePlayer;
import player.Skinnable;

// 문제) PortablePlayer의 인스턴스를 생성하여, 정보를 출력하시오.
public class PlayerTest02 {
	public static void main(String[] args) {
		PortablePlayer p = new PortablePlayer();
		p.play();
		p.stop();
		p.changeSkin(Skinnable.RED);
	}
}
