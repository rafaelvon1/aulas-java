package desafio4;
import java.util.Scanner;
public class desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = 1;
        int cont = 0 ;
        double soma = 0;
        do{
            System.out.print("Digite um numero: ");
            double Number = scanner.nextDouble();
            if (Number == 0){
                System.out.println("Programa encerrado.");
                loop = 0;
                System.out.println("A media dos numeros digitados é: " + soma/cont);
                break;
            }
            else{
                // ta dando pau aqui macho
                cont += 1;
                soma += Number;
            }
            
            
        }
        while (loop == 1);
        scanner.close();
        
        

    }
}
