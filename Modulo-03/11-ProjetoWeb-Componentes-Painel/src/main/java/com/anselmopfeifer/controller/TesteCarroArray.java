package com.anselmopfeifer.controller;

public class TesteCarroArray {
	public static void main(String[] args) {
	
		Carro carros[] = new Carro[5];
		
		carros[0] = new Carro();
		carros[0].setCodigo(1);
		carros[0].setModelo("GM");
		carros[0].setTipo("Celta");
		
		carros[1] = new Carro();
		carros[1].setCodigo(2);
		carros[1].setModelo("GM");
		carros[1].setTipo("Celta");

		carros[2] = new Carro();
		carros[2].setCodigo(3);
		carros[2].setModelo("GM");
		carros[2].setTipo("Corsa");

		carros[3] = new Carro();
		carros[3].setCodigo(4);
		carros[3].setModelo("GM");
		carros[3].setTipo("Monza");

		carros[4] = new Carro();
		carros[4].setCodigo(5);
		carros[4].setModelo("GM");
		carros[4].setTipo("Blazer");
		
		for (int i = 0; i < carros.length; i++) {
			System.out.println("\nImpresao de Objetos que estao num vetor na posicao " + i + "\n");
			System.out.println(carros[i]);
			
		}
		
		
	}
}
