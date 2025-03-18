package atividade_18;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario,abono,novo_salario;
		
		System.out.println("digite seu salario:");
		salario = ler.nextFloat();
		
		System.out.println("digete seu abono:");
		abono = ler.nextFloat();
		
		novo_salario = (salario + abono);
		System.out.println("esse é seu novo salário: "+ novo_salario);
		
		
		
		


	}

}
