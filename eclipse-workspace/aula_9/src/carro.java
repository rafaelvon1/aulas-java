public class carro extends Veiculos implements contrato{
    private boolean arCondicionado;

    
    public carro(String marca, String modelo, int ano, Double valorDiario,boolean arCondicionado) {
        super(marca,modelo,ano,valorDiario);
        this.arCondicionado = arCondicionado;
    }
    
    public double calcularAlugar(int dias){
        double valorAluguel;
        if (arCondicionado) {
            valorAluguel = getValorDiario() * dias * 1.5;
        }
        else{
            valorAluguel = getValorDiario() * dias;
        }
        return valorAluguel;
    }

    @Override
    public String toString() {
        return "carro [arCondicionado=" + arCondicionado + ", Marca" + getMarca() + ", Modelo" + getModelo()
                + ", ano" + getAno() + ", ValorDiario" + getValorDiario() + "]";
    }


    
    
    
}
