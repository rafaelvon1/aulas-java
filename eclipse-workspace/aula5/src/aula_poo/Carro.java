package aula_poo;
public class Carro {
    double motor;
    String fabricante;
    String modelo;
    int ano;
    String placa;
    String cor;
    int velocidade;
    //metodo
    public void print(){
        System.out.println(fabricante + "\n"+ modelo + "\n"+ cor + "\n" + ano + "\n" + placa + "\n" + motor + "\n" + velocidade);
    }
    public void acelerar(int vel){
        velocidade += vel;
    }
    public void freiar(int vel){
        velocidade -= vel;
    }
}
