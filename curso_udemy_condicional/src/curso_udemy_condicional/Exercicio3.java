package curso_udemy_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		//ordem crescente ou decrescente.
		
		Scanner v = new Scanner(System.in);
		
		int A = v.nextInt();
		int B = v.nextInt();
		
		if (A % 2 == 0 && B % 2 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
			
		v.close();
		
		

	}

}
