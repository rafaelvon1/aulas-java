package desafio6;
import java.util.ArrayList;
import java.util.Scanner;
public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = 1;
        ArrayList<Double> soma = new ArrayList<>();
        do{
            
            System.out.print("Digite um numero: ");
            double Number = scanner.nextDouble();
            if (Number == 0){
                System.out.println("Programa encerrado.");
                loop = 0;
                double produto = 1;
                for (double num : soma) {
                    produto *= num;
                }
                System.out.println("O produto dos numeros digitados é: " + produto);
                break;
            }
            else{
                soma.add(Number);
            }
            
            
        }
        while (loop == 1);
        scanner.close();
        
        

    }
}
