import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("bem vindo");
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero:");
        int quantidade = sc.nextInt();
        double [] notas= new double[quantidade];
        System.out.println("digite "+quantidade+ " notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("digite o "+(i+1)+ "° nota");
            double nota = sc.nextDouble();
            if(nota >= 0 && nota <= 10){
                
                notas[i] = nota;
                
                if ((i+1) == notas.length) {
                    double soma = 0;
                    for (int x = 0; x < notas.length; x++) {
                        
                        System.out.println("=========================================================");
                        System.out.println((x+1)+ "° nota");
                        System.out.println(notas[x]);
                        soma += notas[x];
                        System.out.println("=========================================================");
                    }
                    System.err.println(soma/notas.length);
                }

            }
            else{
                System.out.println("pode nao macho");
                break;
            }
            
        }
        




        sc.close();

    }
}
