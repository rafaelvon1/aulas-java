package desafio2;
import java.util.Scanner;
public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        float usuario = scanner.nextFloat(); 

        System.out.print("//Digite 1 para dolar // 2 para euro //3 para libra//: ");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("O valor em dolar é: " + usuario * 0.20);
                break;
            case 2:
                System.out.println("O valor em euro é: " + usuario * 0.18);
                break;
            case 3:
                System.out.println("O valor em libra é: " + usuario * 0.15);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
}