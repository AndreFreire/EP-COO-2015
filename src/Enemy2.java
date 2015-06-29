import java.util.Timer;
import java.util.TimerTask;

public class Enemy2 extends TimerTask implements Element, Character {
	
	EnemyModel enemy;
	
	
	public Enemy2() {//instanciar enemy
		enemy = new EnemyModel();
		Controller.addEnemy2(this);
		System.out.println("criou enemy2");
		Timer time = new Timer();
		time.schedule(this, 0,this.enemy.getMilisecondsShoot());	
	}

	@Override
	public void shoot() {
		System.out.println("Enemy2 atirou");
		
	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colision() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.shoot();
		
	}

}
