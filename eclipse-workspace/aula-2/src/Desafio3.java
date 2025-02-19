import java.util.Iterator;
import java.util.Scanner;
public class Desafio3 {

	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner(System.in);
		
		for (int cont = 10; cont < args.length; cont++) {
			
		}
		
    	System.out.println("Qual a nota do primeiro aluno?: ");
    	double n1 = sc.nextDouble ();
    	
    	System.out.println("Qual a nota do segundo aluno?: ");
    	double n2 = sc.nextDouble ();
    	
    	System.out.println("Qual a nota do terceiro aluno?: ");
    	double n3 = sc.nextDouble ();
    	
    	double m = (n1 + n2 + n3)/3;
    	
    	System.out.println("A media final da sala é : "+ m);
    	
		
    	sc.close();
	}

}
