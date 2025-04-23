public class carro extends Veiculos{
    private boolean arCondicionado;

    
    public carro(String marca, String modelo, int ano, Double valorDiario,boolean arCondicionado) {
        super(marca,modelo,ano,valorDiario);
        this.arCondicionado = arCondicionado;
    }
    
}
