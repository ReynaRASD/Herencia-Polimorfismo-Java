package animales;

public class Perro extends Animal implements Mascota, Jugar{
	@Override
	public void jugar() {
		System.out.println("Jugando con la pelota");
	};
	
	@Override
	public void correr() {
		System.out.println("Persiguiendo al cartero");
	};
	
	@Override
	public void baniar() {
		System.out.println("Me gusta bañarme");
	}

	@Override
	public void moverLaColita() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ensuciar() {
		// TODO Auto-generated method stub
		
	};

	
	
};
