package curso_udemy_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		Scanner v = new Scanner(System.in);
		
		int horaInicial= v.nextInt();
		int horaFinal = v.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 -horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + duracao + "Hora(s)");
		
		v.close();
		
		

	}

}
