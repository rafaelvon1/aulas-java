package estruturas;

public class estruturada {
    
    public static void main(String[] args) {
        
        double janAlim, janAgua, janLuz, fevAlim, fevAgua, fevLuz;
        //janeiro
        janAlim = 1000;
        janAgua = 300;
        janLuz = 300;

        //fevereiro
        fevAlim = 1500;
        fevAgua = 300;
        fevLuz = 300;

        
         double gastototalfev = fevAgua + fevAlim + fevLuz;
         double gastototaljan = janAgua + janAlim + janLuz;

        if(gastototaljan > gastototalfev){
            System.out.println("O gasto de Janeiro foi maior");

        }
        else if (gastototalfev > gastototaljan){
            System.out.println("O gasto de Fevereiro foi maior");

        }
        else{
            System.out.println("Ambos os meses tiveram os mesmo gasto");

        }
    }
}
