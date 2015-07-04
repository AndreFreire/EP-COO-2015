import java.util.Timer;

public class BackGroundCreator {

	public static void createBackGround(){
		BackGround bg = new BackGround();
		Timer time = new Timer();
		bg.startGraphic();	
		time.schedule(bg, 0, 50);		
	}
}