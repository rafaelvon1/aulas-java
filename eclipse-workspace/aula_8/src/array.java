import java.util.List;
import java.util.ArrayList;
public class array {
    
    public static void main(String[] args) {
        
        List <String> listaNomes = new ArrayList <> ();
        listaNomes.add("luiz ");
        listaNomes.add("fernando mae dos filhos do luiz");
        listaNomes.add("guilherme ");
        listaNomes.add("alan ");
        listaNomes.add("matheus ");
        listaNomes.add("hghghg");
        //adicionando itens
        listaNomes.add(3, "rafael ele entra em açao para impedir o plano maligno do matheus de acabar com a felicidade do casal");
        //tamanho array
        System.out.println(listaNomes.size());
        // identificando a posiçao de um elemento
        System.out.println(listaNomes.indexOf("hghghg"));
        //exibir valor especifico da lista
        System.out.println("Posição 1: " + listaNomes.get(3));
        // remove
        listaNomes.remove(0);
        // remove pelo nome
        listaNomes.remove("hghghg");
        
        for(String nome : listaNomes){
            System.out.println(nome);
        }
    }
}
