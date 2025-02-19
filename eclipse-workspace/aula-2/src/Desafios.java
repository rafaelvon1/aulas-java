
import java.util.Scanner;


public class Desafios{

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
    	System.out.println("Quantos graus está hoje?: ");
    	double temp = sc.nextDouble ();
    	
    	
    	double fahrenheit = (temp * 9/5) + 32;
    	double Kelvin = temp + 273.15;
    	
    	System.out.println("Calor pra dedeu, em fahrenheit é igual a: "+ fahrenheit);
    	System.out.println("Calor pra dedeu, em Kelvin é igual a: "+ Kelvin);
    	
    	
    	
    	
		
    	sc.close();

	}

}
