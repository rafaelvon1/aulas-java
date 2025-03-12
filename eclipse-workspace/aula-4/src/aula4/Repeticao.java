package aula4;

import java.util.Scanner;

public class Repeticao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roleta Russa");
		
		
		int valor;
		int aleatorio = (int) (Math.random() * 10);
		
		do {
			System.out.println("Em qual tambor escondi a bala?--- ");
			valor = sc.nextInt();
			if (aleatorio > valor) {
				System.out.println("Não esta ai em " + valor);
				
			}if (aleatorio < valor) {
				System.out.println("Errou hehehe não está no " + valor);
			}
			else {
				System.out.println("hmmmmmm");
			}
		} while (aleatorio != valor);
		
		System.out.println("Pow💀");
		
		
		//System.out.println(aleatorio);
		//System.out.println(valor);
		
		sc.close();
	}
}
