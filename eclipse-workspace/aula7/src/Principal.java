

public class Principal {
    public static void main(String[] args) throws Exception {
        //Scanner input = new Scanner (System.in);
        ContaBancaria joao = new ContaBancaria("joao",1000);
        joao.setTitular("ze urubu");
        joao.TransSaldo(500);
        joao.Depositar(800);
        System.out.println(joao.getTitular());
        System.out.println(joao.getSaldo());
        //System.out.println(joao.toString());

    }
}
