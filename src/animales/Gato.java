package animales;

public class Gato extends Animal implements Mascota{

	@Override
	public void jugar() {
		System.out.println("Jugando con las cajas");
	};
	
	@Override
	public void correr() {
		System.out.println("Persiguiendo al raton");
	};
	
	@Override
	public void baniar() {
		System.out.println("No me gusta bañarme");
	};
};
