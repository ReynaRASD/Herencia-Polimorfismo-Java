package com.generation;

public class Triangulo extends FiguraGeometrica{
	//triangulo es el hijo
	public Triangulo() {
		super("triangulo rectangulo",10,5); //contructor padre
		
		
		}
	
	@Override
	public float calcularArea() {
		return (getAlto() * getLargo()) /2;
	}
	
	@Override
	public float perimetro() {
		double cuadrados = (getAlto()*getAlto()) + (getLargo()*getLargo());
		double hipotenusa = Math.sqrt(cuadrados);
		float hipo = (float) hipotenusa;
		return getAlto() + getLargo() + hipo;
	}
}

