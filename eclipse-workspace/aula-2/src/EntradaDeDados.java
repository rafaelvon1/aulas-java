
import java.util.Scanner;

public class EntradaDeDados {
	    public static void main(String[] arg) 
	    {
	    	Scanner sc =  new Scanner(System.in);
	    	
	    	String n;
	    	
	    	System.out.println ("Qual o usuario");
	    	
	    	
	    	n = sc.next();
	    	
	    	System.out.println (n);
	    	
	    	System.out.println ("Qual a sua idade");
	    	int i = sc.nextInt();
	    	System.out.println ("Sua idade é " + i);
	    	
	    	System.out.println("Qual sua altura: ");
	    	double a = sc.nextDouble ();
	    	System.out.println("Sua Altura é" + a );
	    	
	    	
	    	if (i == 19) {
	    		System.out.println ("Logado Bem-vindo" + n + i + a);
				
			}
	    	else {
	    		System.out.println ("Barrado" + n);
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	sc.close();
	    }
	}
	



