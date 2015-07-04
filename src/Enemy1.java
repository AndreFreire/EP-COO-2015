import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class Enemy1 extends TimerTask implements Element, Character{

	EnemyModel enemy;	
	
	public Enemy1() {//instanciar o enemy
		enemy = new EnemyModel();
		Controller.addEnemy1(this);
		System.out.println("criou enemy1 em Enemy 1");
		Timer time = new Timer();
		time.schedule(this, 0, this.enemy.getMilisecondsShoot());
		
		
	}
	
	@Override
	public void shoot() {
		System.out.println("Enemy1 atirou");
		
	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub
		Controller.moveEnemy1(x, y);
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
		shoot();
		int i = 0;
		for(double j = 0.0; j < GameLib.HEIGHT; j++){
			this.move(0.0, j);
			i++;
		}	
		//Imprimir o inimigo
		for(int j = 0; j < 400; j++){
			GameLib.setColor(Color.RED);
			GameLib.drawCircle(Controller.moveEnemy1X.get(j), Controller.moveEnemy1Y.get(j), 0.9);
		}		
		
	}
}
