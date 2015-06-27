

import java.util.TimerTask;
import java.util.Date;

public class EnemyTask<T> extends TimerTask{
	Character character;
	public EnemyTask(Character character){
		this.character = character;
	}

	public void run(){
		Character teste = (Character) enemyClass.newInstance();
		

	}
}