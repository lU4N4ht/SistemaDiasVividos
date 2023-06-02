package br.senai.sp.jandira;

import java.util.Scanner;

public class CalculandoDiasVividos {

	public static void main(String[] args) {
		
		
Scanner teclado = new Scanner(System.in);
		
        double x; //Criando uma variável
		System.out.println("Quantos anos você tem?");
		x = teclado.nextDouble(); //Inicializamos a variável x
		
		double y = 365;
		
		System.out.printf("Você já viveu aproximadamente " + (x * y) + " dias!"); 
	}

}
