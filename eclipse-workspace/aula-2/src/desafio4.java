import java.util.Scanner;
public class desafio4 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("qual a capital inicial?: ");
    	double CapitalInicial = sc.nextDouble ();
    	
    	float Taxa = 5f;
    	
    	System.out.println("quanto tempo?: ");
    	double Tempo = sc.nextDouble ();

    	double Juros = CapitalInicial * Taxa *Tempo;
    	
    	System.out.println("montant final de:" + Juros);
	}

}
