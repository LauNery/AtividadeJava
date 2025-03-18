package atividade_18;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1,nota2,nota3,nota4,media_final;
		
		System.out.println("digite a nota 1:");
		nota1 = ler.nextDouble();
		
		System.out.println("digite a nota 2:");
		nota2 = ler.nextDouble();
		
		System.out.println("digite a nota 3:");
		nota3 = ler.nextDouble();
		
		System.out.println("digite a nota 4:");
		nota4 = ler.nextDouble();
		
		media_final = (nota1 + nota2 + nota3 + nota4);
		System.out.println("esse é sua média final: "+ media_final);
		
		

	}

}
