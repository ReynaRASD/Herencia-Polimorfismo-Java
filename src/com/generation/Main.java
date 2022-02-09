package com.generation;

public class Main{

	public static void main(String[] args) {
		//Herencia
		//Cuando una clase hereda de otra
		//esta tiene acceso a sus atributos y metodos
		
		Cuadrado cuadrado1 = new Cuadrado();
		
		System.out.println(cuadrado1.toString());
		System.out.println("El area del cuadrado es: "+ cuadrado1.calcularArea());
		System.out.println("El perimetro del cuadrado es: "+ cuadrado1.perimetro());
		
		
		
		Triangulo triangulo1 = new Triangulo();
		
		System.out.println("***********************************************************");
		System.out.println(triangulo1.toString());
		System.out.println("El area del triangulo es: " + triangulo1.calcularArea());
		System.out.println("El perimetro del triangulo es: " + triangulo1.perimetro());
	}

}
