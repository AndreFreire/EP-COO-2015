public class Main {

	public static final int INACTIVE = 0;
	public static final int ACTIVE = 1;
	public static final int EXPLODING = 2;

	public static void main(String[] args) {

		long currentTime = System.currentTimeMillis();

		Player caio = new Player(currentTime);
		BackGroundCreator.createBackGround();
		GameLib.display();
		caio.draw(currentTime);
		EnemyCreator.createEnemy1(1);
		EnemyCreator.createEnemy3(3);
	}
}