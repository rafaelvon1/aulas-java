import java.util.*;
public class listas {
    public static void main(String[] args) {
        ArrayList<Integer> nossaLista = new ArrayList<>();
        List lista_1 = new ArrayList<Integer>();
        var list_2 = new ArrayList<Integer>();
        double[] notasAlunos = new double[3];
        notasAlunos[0]= 9;
        notasAlunos[1]= 5.8;
        notasAlunos[2]= 9.7;
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println(notasAlunos[i]);
        }
    }
}
