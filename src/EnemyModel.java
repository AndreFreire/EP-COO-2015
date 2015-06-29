
public class EnemyModel {
	double explosionStart;
	double explosionEnd;
	double coordX;
	double coordY;
	int milisecondsShoot = 1000;
	public EnemyModel(){}
	
	public EnemyModel(double explosionStart, double explosionEnd, double coordX, double coordY, int milisecondsShoot) {
		this.explosionStart = explosionStart;
		this.explosionEnd = explosionEnd;
		this.coordX = coordX;
		this.coordY = coordY;
		this.milisecondsShoot = milisecondsShoot;
	}
	public double getExplosionStart() {
		return explosionStart;
	}
	public void setExplosionStart(double explosionStart) {
		this.explosionStart = explosionStart;
	}
	public double getExplosionEnd() {
		return explosionEnd;
	}
	public void setExplosionEnd(double explosionEnd) {
		this.explosionEnd = explosionEnd;
	}
	public double getCoordX() {
		return coordX;
	}
	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}
	public double getCoordY() {
		return coordY;
	}
	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	public int getMilisecondsShoot() {
		return milisecondsShoot;
	}
	public void setMilisecondsShoot(int milisecondsShoot) {
		this.milisecondsShoot = milisecondsShoot;
	}
}
