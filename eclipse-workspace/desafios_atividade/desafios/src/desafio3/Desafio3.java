package desafio3;
import java.util.Scanner;
public class Desafio3 {

    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do emprestimo: ");
        float usuario = scanner.nextFloat(); 
        System.out.print("Digite 1 para 6 meses// 2 para 12 meses// 3 para 24 meses: ");
        int opc = scanner.nextInt();
        switch (opc) {
            case 1:
                System.out.println("O valor da parcela é: " + (usuario * 1.05) / 6);
                break;
            case 2:
                System.out.println("O valor da parcela é: " + (usuario * 1.10) / 12);
                break;
            case 3:
                System.out.println("O valor da parcela é: " + (usuario * 1.20) / 24);
                break;
            default:
                System.out.println("Opção inválida.");
                break;  

        }

        scanner.close();
       
    }
}