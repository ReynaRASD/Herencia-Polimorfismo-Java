package com.generation;

public class Cuadrado extends FiguraGeometrica{
	//cuadrado es el hijo
	
	public Cuadrado() {
		super("cuadrado",10,10); //contructor padre
		
	}
	
	@Override
	public float calcularArea() {
		if (getAlto()==getLargo()) {
		return getAlto() * getLargo();
		}else {return 0;}
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		if (getAlto()==getLargo()) {
		return 4*getAlto();
		}else {return 0;}
	}
	
}
