package Server;

import java.util.Random;

public class ServerSword {
	private int posX, posY;

	public ServerSword() {
		Random random = new Random();
		posX = random.nextInt(500) + 100;
		posY = random.nextInt(600);

	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
