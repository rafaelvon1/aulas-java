package desafio5;
import java.util.Scanner;
public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = 1;
        int contpar = 0 ;
        int contimpar = 0;
        do{
            System.out.print("Digite um numero: ");
            double Number = scanner.nextDouble();
            if (Number == 0){
                System.out.println("Programa encerrado.");
                loop = 0;
                System.out.println("Quantidade de numeros pares: " + contpar);
                System.out.println("Quantidade de numeros impares: " + contimpar);
                break;
            }
            else if (Number % 2 == 0){
                System.out.println("numero par.");
                contpar += 1;
            }
            else{
                System.out.println("numero impar.");
                contimpar += 1;
            }
            
            
        }
        while (loop == 1);
        scanner.close();
        
        

    }
}
