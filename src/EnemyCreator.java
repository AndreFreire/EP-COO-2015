import java.util.Timer;

public class EnemyCreator {

	public static void createEnemy1(int seconds){
		Timer time = new Timer(); 
		EnemyTask1 st = new EnemyTask1();
		time.schedule(st, 0, seconds*1000);
	
	}
	public static void createEnemy2(int seconds){
		Timer time = new Timer(); 
		EnemyTask2 st = new EnemyTask2();
		time.schedule(st, 0, seconds*1000);
	
	}
	
	public static void createEnemy3(int seconds){
		Timer time = new Timer(); 
		EnemyTask3 st = new EnemyTask3();
		time.schedule(st, 0, seconds*1000);
	
	}
}
