public class carro extends Veiculos{
    private boolean arCondicionado;

    
    public carro(String marca, String modelo, int ano, Double valorDiario,boolean arCondicionado) {
        super(marca,modelo,ano,valorDiario);
        this.arCondicionado = arCondicionado;
    }


    @Override
    public String toString() {
        return "carro [arCondicionado=" + arCondicionado + ", Marca" + getMarca() + ", Modelo" + getModelo()
                + ", ano" + getAno() + ", ValorDiario" + getValorDiario() + "]";
    }


    
    
    
}
