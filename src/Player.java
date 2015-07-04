import java.awt.Color;

public class Player implements Element, Character {

	int player_state; // estado
	double player_X; // coordenada x
	double player_Y; // coordenada y
	double player_VX; // velocidade no eixo x
	double player_VY; // velocidade no eixo y
	double player_radius; // raio (tamanho aproximado do player)
	double player_explosion_start; // instante do início da explosão
	double player_explosion_end; // instante do final da explosão
	long player_nextShot; // instante a partir do qual pode haver um próximo
							// tiro

	public Player(long currentTime) {

		System.out.println("Jogador criado");
		this.player_state = 1; // estado
		this.player_X = GameLib.WIDTH / 2; // coordenada x
		this.player_Y = GameLib.HEIGHT * 0.90; // coordenada y
		this.player_VX = 0.25; // velocidade no eixo x
		this.player_VY = 0.25; // velocidade no eixo y
		this.player_radius = 12.0; // raio (tamanho aproximado do player)
		this.player_explosion_start = 0; // instante do início da explosão
		this.player_explosion_end = 0; // instante do final da explosão
		this.player_nextShot = currentTime; // instante a partir do qual pode
											// haver um próximo tiro

	}

	@Override
	public void shoot() {
		Shot shot = new Shot();
		shot.move(this.player_X, this.player_Y);

	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void colision() {
		// TODO Auto-generated method stub

	}

	public void keyPressed(long currentTime, long delta) { // Verifica se usuário pressionou
												// tecla.
		

		if (GameLib.iskeyPressed(GameLib.KEY_UP))
			player_Y -= delta * player_VY;
		if (GameLib.iskeyPressed(GameLib.KEY_DOWN))
			player_Y += delta * player_VY;
		if (GameLib.iskeyPressed(GameLib.KEY_LEFT))
			player_X -= delta * player_VX;
		if (GameLib.iskeyPressed(GameLib.KEY_RIGHT))
			player_X += delta * player_VY;
		if (GameLib.iskeyPressed(GameLib.KEY_CONTROL)) {

			/*
			 * if(currentTime > player_nextShot){
			 * 
			 * int free = findFreeIndex(projectile_states);
			 * 
			 * if(free < projectile_states.length){
			 * 
			 * projectile_X[free] = player_X; projectile_Y[free] = player_Y - 2
			 * * player_radius; projectile_VX[free] = 0.0; projectile_VY[free] =
			 * -1.0; projectile_states[free] = 1; player_nextShot = currentTime
			 * + 100; } }
			 */
		}

	}

	public void playerNaTela() { // Verifica se player não saiu da tela.
		if (player_X < 0.0)
			player_X = 0.0;
		if (player_X >= GameLib.WIDTH)
			player_X = GameLib.WIDTH - 1;
		if (player_Y < 25.0)
			player_Y = 25.0;
		if (player_Y >= GameLib.HEIGHT)
			player_Y = GameLib.HEIGHT - 1;
	}

	public void draw(long currentTime) { //Desenha o player.
		while (true) {
			if (player_state == 1) {
				long delta = System.currentTimeMillis() - currentTime;

				keyPressed(currentTime, delta);
			}

			// if(GameLib.iskeyPressed(GameLib.KEY_ESCAPE)) running = false;

			playerNaTela();

			if (player_state == 2) {

				double alpha = (currentTime - player_explosion_start) / (player_explosion_end - player_explosion_start);
				GameLib.drawExplosion(player_X, player_Y, alpha);
			} else {
				
				GameLib.setColor(Color.BLUE);
				GameLib.drawPlayer(player_X, player_Y, player_radius);
				
			}
		}

	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		// tem que dar um restart pq Ã© infinito
	}

}
