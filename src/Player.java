
public class Player implements Element,Character{
	double explosionStart;
	double explosionEnd;
	double coordX;
	double coordY;
	
	
	
	public Player(double explosionStart, double explosionEnd, double coordX, double coordY) {
		this.explosionStart = explosionStart;
		this.explosionEnd = explosionEnd;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	@Override
	public void shoot() {
		Shot shot = new Shot();
		shot.move(this.coordX, coordY);
		
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
		//tem que dar um restart pq é infinito
	}

}
