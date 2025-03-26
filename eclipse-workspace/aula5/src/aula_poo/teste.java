package aula_poo;
public class teste {
    public static void main(String[] args) {
        Carro civic = new Carro();
        civic.fabricante= "Honda";
        civic.modelo= "Civic";
        civic.motor= 2.0;
        civic.placa= "EIC-2490";
        civic.cor= "Preta";
        civic.ano= 2024;
        civic.velocidade= 0;
        System.out.println(civic);

        Carro corolla = new Carro();
        corolla.fabricante= "Toyota";
        corolla.modelo= "Corolla";
        corolla.motor= 2.0;
        corolla.placa= "EUC-2015";
        corolla.cor= "Prata";
        corolla.ano= 2023;
        corolla.velocidade= 0;
        System.out.println(corolla);

        Carro gol = new Carro();
        gol.fabricante= "Volkswagen";
        gol.modelo= "Gol";
        gol.motor= 1.6;
        gol.placa= "RKE-2005";
        gol.cor= "Prata";
        gol.ano= 2003;
        gol.velocidade= 0;
        System.out.println(gol);
        gol.acelerar(10);
        gol.acelerar(20);
        gol.acelerar(50);
        gol.freiar(50);
        gol.print();
        
    }
}
