public class Veiculos{
    private String marca;
    private String modelo;
    private int ano;
    private Double valorDiario;

    public Veiculos(String marca, String modelo, int ano, Double valorDiario){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiario = valorDiario;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorDiario(Double valorDiario) {
        this.valorDiario = valorDiario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorDiario() {
        return valorDiario;
    }

    @Override
    public String toString() {
        return "veiculos [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", valorDiario=" + valorDiario
                + "]";
    }
}



