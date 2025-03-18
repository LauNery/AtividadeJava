package atividade_18;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double salario_bruto,adicional_noturno,horas_extras,descontos,salario_liquido;
		
		System.out.println("digite o salário bruto:");
		salario_bruto = ler.nextDouble();
		
		System.out.println("digite o adicional noturno:");
		adicional_noturno = ler.nextDouble();
		
		System.out.println("digite a horas extras:");
		horas_extras = ler.nextDouble();
		
		System.out.println("digite o descontos:");
		descontos = ler.nextDouble();
		
		System.out.println("digite o salário liquido:");
		salario_liquido = ler.nextDouble();
		
		salario_liquido = (salario_bruto + adicional_noturno + horas_extras*5 - descontos);
		System.out.println("esse é seu salário liquido: "+ salario_liquido);

	}

}
