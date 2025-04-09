public class ContaBancaria {
    private  String titular;
    private  double saldo;
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void TransSaldo(double saldo){
        if (this.saldo < saldo) {
            System.out.println("voce nao tem esse dinheiro");
        }
        else{
            this.saldo -= saldo;
        }
        
    }
    public void Depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
        else{
            System.out.println("nao valido");
        }
    }
    public void Sacar(double saque){
        if (saque > 0 && saque <= this.saldo) {
            this.saldo -= saque;
        } else {
            System.out.println("bixo vai da nao");
        }
    }



   // @Override
   // public String toString() {
   //     return "ContaBancaria [titular=" + titular + "]" + "\n[Saldo= " + saldo + "]";
   // }
    

    
}
