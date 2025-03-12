package aula4;

import java.util.Iterator;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		System.out.println("----tabuada----");
		System.out.println("Qual numero deseja saber a tabuada? ");
		Scanner sc = new Scanner (System.in);
		int numero = sc.nextInt();
		for (int i = 0; i < 11; i++) {
			System.out.println(i + "X" + numero +"="+ numero * i);
			
		}
	}
}
