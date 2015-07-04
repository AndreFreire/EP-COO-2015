import java.awt.Color;
import java.util.TimerTask;

public class BackGround extends TimerTask{

	long delta;
	long currentTime = System.currentTimeMillis();

	/* estrelas que formam o fundo de primeiro plano */
		
	double [] background1_X = new double[20];
	double [] background1_Y = new double[20];
	double background1_speed = 0.070;
	double background1_count = 0.0;
	
	/* estrelas que formam o fundo de segundo plano */
	
	double [] background2_X = new double[50];
	double [] background2_Y = new double[50];
	double background2_speed = 0.045;
	double background2_count = 0.0;

	public void startGraphic(){
		
		for(int i = 0; i < background1_X.length; i++){
			
			background1_X[i] = Math.random() * GameLib.WIDTH;
			background1_Y[i] = Math.random() * GameLib.HEIGHT;
		}
		
		for(int i = 0; i < background2_X.length; i++){
			
			background2_X[i] = Math.random() * GameLib.WIDTH;
			background2_Y[i] = Math.random() * GameLib.HEIGHT;
		}
		GameLib.initGraphics();
	}
	
	@Override
	public void run() {
		
		delta = System.currentTimeMillis() - currentTime;
		
		/*Desenhando primeiro plano de fundo*/
		GameLib.setColor(Color.BLUE);
		background2_count += background2_speed * 50;
		
		for(int i = 0; i < background2_X.length; i++){
			
			GameLib.fillRect(background2_X[i], (background2_Y[i] + background2_count) % GameLib.HEIGHT, 2, 2);
		}
			
		/* desenhando plano de fundo próximo */
		GameLib.setColor(Color.GREEN);
		background1_count += background1_speed * 50;
			
		for(int i = 0; i < background1_X.length; i++){
				
			GameLib.fillRect(background1_X[i], (background1_Y[i] + background1_count) % GameLib.HEIGHT, 3, 3);
		}
		GameLib.display();
		
		//System.out.println("atualiza fundo");
	}
}
