package curso_udemy_condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner v = new Scanner(System.in);
		
		int x = v.nextInt();
		
		if (x >= 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
			
		v.close();
		
			

	}

}
