import java.util.Timer;

public class EnemyCreator {

	public static <T> void create(Character character, int seconds){
		Timer time = new Timer(); 
		EnemyTask st = new EnemyTask(character);
		time.schedule(st, 0, 1000);
	
	}
}
