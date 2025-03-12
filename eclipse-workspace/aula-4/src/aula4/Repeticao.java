package aula4;

import java.util.Scanner;

public class Repeticao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int valor;
		int aleatorio = (int) (Math.random() * 10);
		
		do {
			System.out.println("que numero estou pensando??---");
			valor = sc.nextInt();
			if (aleatorio > valor) {
				System.out.println("O numero que pensei é maior que " + valor);
				
			}if (aleatorio < valor) {
				System.out.println("O numero que pensei é menor que " + valor);
			}
		} while (aleatorio != valor);
		
		System.out.println("Congratulation");
		
		
		//System.out.println(aleatorio);
		//System.out.println(valor);
		
		sc.close();
	}
}
