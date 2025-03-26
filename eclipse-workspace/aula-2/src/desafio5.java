import java.util.Scanner;
public class desafio5 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Programa calculador de circulos: ");
		
		System.out.println("qual o raio deste circulo que deseja calcula?: ");
		double r = sc.nextDouble ();
		
		
		double a = Math.PI * Math.pow(r, 2);
		
		double p = 2 * Math.PI * r ;
		
		//m2 = String.format("%.2f", a);
		
		System.out.println("A Área deste circulo é: " + a);
		
		
		System.out.println("O perímetro deste circulo é"+ p);
		
		
		
		
		
		
		
		sc.close();
	}

}
