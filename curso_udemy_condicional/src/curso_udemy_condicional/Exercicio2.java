package curso_udemy_condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		//OPERADOR ARITMETICO % = RESTO DA DIVISÃO
		
		Scanner v = new Scanner(System.in);
		
		int A = v.nextInt();
		
		if (A % 2 == 0) {
			System.out.println("PAR");
		} else {
				System.out.println("IMPAR");
				}
		
		v.close();
		
	}

}
