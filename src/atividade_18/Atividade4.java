package atividade_18;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero1,numero2,numero3,numero4,diferença;
		
		System.out.println("digite o número 1:");
		numero1 = ler.nextDouble();
		
		System.out.println("digite o número 2:");
		numero2 = ler.nextDouble();
		
		System.out.println("digite o numero 3:");
		numero3 = ler.nextDouble();
		
		System.out.println("digite o número 4:");
		numero4 = ler.nextDouble();
		
		System.out.println("digite a diferença");
		diferença = ler.nextDouble();
		
		diferença = (numero1*numero2) - (numero3*numero4);
		System.out.println("esse é sua diferença: "+ diferença);

	}

}
