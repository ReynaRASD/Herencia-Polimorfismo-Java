package com.generation;

public abstract class FiguraGeometrica {
	
	//Si quieres metodo abstract, siendo la padre
	//la clase necesita ser abstract, esto obliga 
	//a que las clases hijas imprementen si o si el metodo
	
	//Pero la hijo no necesita ser abstract
	
	//CLASES ABSTRACT
	//pueden o no tener metodos abstractos
	//El metodo abstracto es un metodo que te dice que 
	//hacer pero no te dice como hacerlo
	//en la clase abstracta no podemos crear objetos
		// se utiliza para heredarla
	
	private String nombre;
	private float alto;
	private float largo;

	public FiguraGeometrica() {

	}
	public FiguraGeometrica(String nombre, float alto, float largo) {
		this.nombre = nombre;
		this.alto = alto;
		this.largo = largo;
	}

	
	
	//setters*getters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return this.alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return this.largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	
	public abstract float calcularArea();
	public abstract float perimetro();
	
	
	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + ", alto=" + alto + ", largo=" + largo + "]";
	}

	
	
	
	
	
}
