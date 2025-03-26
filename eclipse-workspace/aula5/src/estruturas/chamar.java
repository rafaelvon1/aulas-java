package estruturas;

public class chamar {
    public static void main(String[] args) {
        contames  janeiro = new contames(); 
        janeiro.mes="janeiro";
        janeiro.agua = 200;
        janeiro.luz= 100;
        janeiro.alim = 100;
        double t1 = janeiro.SomaGasto();
        System.out.println(t1);

        contames  fevereiro = new contames(); 
        fevereiro.mes="fevereiro";
        fevereiro.agua = 99;
        fevereiro.luz= 66;
        fevereiro.alim = 90;
        double t2 = fevereiro.SomaGasto();
        System.out.println(t2);
        if(t1 > t2){
            System.out.println("O gasto de Janeiro foi maior");

        }
        else if (t2 > t1){
            System.out.println("O gasto de Fevereiro foi maior");

        }
        else{
            System.out.println("Ambos os meses tiveram os mesmo gasto");

        }

    }
}
