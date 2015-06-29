import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class Controller {
	static Set enemys1 = new HashSet<Enemy1>();
	static Set enemys2 = new HashSet<Enemy2>();
	static Set enemys3 = new HashSet<Enemy3>();
	static Set shots = new HashSet<Shot>();
	
	public static void addEnemy1(Enemy1 enemy){
		System.out.println("Add Enemy1 in controller");
		enemys1.add(enemy);		
	}

	public static void addEnemy2(Enemy2 enemy){
		System.out.println("Add Enemy2 in controller");
		enemys2.add(enemy);		
	}
	
	public static void addEnemy3(Enemy3 enemy){
		System.out.println("Add Enemy3 in controller");
		enemys3.add(enemy);		
	}
	
	public static void addShoot(Shot shot){
		System.out.println("Add shot in controller");
		shots.add(shot);
	}
	//faz aqui os manos que chamam o move()
}
