public class moto extends Veiculos {
    private Double cilindradas;
    public moto(String marca, String modelo, int ano, Double valorDiario,double cilindradas){
        super(marca,modelo,ano,valorDiario);
        this.cilindradas= cilindradas;
    }
    @Override
    public String toString() {
        return "moto [cilindradas=" + cilindradas + ", Marca" + getMarca() + ", Modelo" + getModelo()
                + ", Ano" + getAno() + ", ValorDiario" + getValorDiario() + "]";
    }
    
}
