import java.util.Random;
import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(10);
        
        System.out.print("Digite um numero: ");
        int jogador = scanner.nextInt(); // Lê uma linha completa

        if (jogador == numeroAleatorio) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Que pena, você errou!");
        }
        scanner.close();
    }
}

