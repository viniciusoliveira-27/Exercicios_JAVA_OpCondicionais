package curso_udemy_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar.
		Locale.setDefault(Locale.US);
		
		Scanner v = new Scanner(System.in);
		
		int cod = v.nextInt();
		int qtde = v.nextInt();
		double preco;
		
		double total = 0;
		
		if (cod == 1) {
			preco = 4.00;
			total = preco*qtde;
			
		} else if (cod == 2) {
			preco = 4.50;
			total = preco*qtde;
						
		}else if (cod == 3) {
			preco = 5.00;
			total = preco*qtde;
					
		}else if (cod == 4) {
			preco = 2.00;
			total = preco*qtde;
			
		}else if (cod == 5) {
			preco = 1.50;
			total = preco*qtde;
			
		}else {
			System.out.println("Codigo errado");
		}
		
		System.out.printf("Total: R$ %.2f ", total);
		
		v.close();
		

	}

}
