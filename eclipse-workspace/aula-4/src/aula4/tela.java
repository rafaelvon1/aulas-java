package aula4;

import java.util.Scanner;

public class tela {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String loginSalvo = "adm";
		String senhaSalvo = "adm";
		String login = "";
		String senha = "";
		int cont = 0;
		
		while (true) {
			System.out.println("Qual o usuario: ");
			login = sc.nextLine();
			
			System.out.println("qual a senha");
			senha = sc.nextLine();
			
			if (login.equals(loginSalvo) && senha.equals(senhaSalvo)) {
				System.out.println("Bem vindo " + login);
				
				break;
			}
			else {
				System.out.println("Acesso Negado, tente novamente");
				cont += 1;
				if (cont >= 5) {
					System.out.println("Bloqueado tente novamente mais tarde!!");
					break;
				}
				
			}

		} 
		
		sc.close();
		

	}

}
