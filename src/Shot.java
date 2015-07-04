
public class Shot implements Element{

	@Override
	public void move(double x, double y) {
		for( int i =0 ;i <10; i++){
			System.out.println((x)+" - "+(y+i));
		}
		
	}

	@Override
	public void colision() {
		// Explode o elemento
		//metodo chamado no mediator
		
		
	}

	@Override
	public void finish() {
		// Se sair da tela
		
	}

}
