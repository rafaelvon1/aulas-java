import java.util.Scanner;
public class desafio2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("qual a capital inicial?: ");
    	double CapitalInicial = sc.nextDouble ();
    	
    	double Taxa = 0.5;
    	
    	System.out.println("quanto tempo?: ");
    	double Tempo = sc.nextDouble ();

    	double m = CapitalInicial * (1 + Taxa)*Tempo;
    	
    	System.out.println("montant final de:" + m);
	}

}
