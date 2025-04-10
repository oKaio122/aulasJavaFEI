package Aula08Lab;

public class Carro {
    private double velocidade, velocidadeMaxima;

    public Carro(double velocidade, double velocidadeMaxima) {
        this.velocidade = velocidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(int velocidade, int velocidadeMaxima) {
        this.velocidade = velocidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(double valor){
        for(int i = 0; i < valor; i++){
            System.out.print("vr");
        }
        System.out.println();
        if(this.velocidade + valor > velocidadeMaxima){
            throw new MaxSpeedException("Você não pode acelerar mais porque já está na velocidade máxima!");
        }
        this.velocidade += valor;

    }

    public void acelerar(int valor){
        for(int i = 0; i < valor; i++){
            System.out.print("vrum");
        }
        System.out.println();
        if(this.velocidade + valor > velocidadeMaxima){
            throw new MaxSpeedException("Você não pode acelerar mais porque já está na velocidade máxima!");
        }
        this.velocidade += valor;

    }

    public void frear(double valor){
        for(int i = 0; i < valor; i++){
            System.out.print("brr");
        }
        System.out.println();
        if(this.velocidade - valor < 0){
            throw new NegativeSpeedException("Você não pode desacelerar mais porque chegaria em uma velocidade negativa!");
        }
        this.velocidade -= valor;

    }

    public void frear(int valor){
        for(int i = 0; i < valor; i++){
            System.out.print("brr");
        }
        System.out.println();
        if(this.velocidade - valor < 0){
            throw new NegativeSpeedException("Você não pode desacelerar mais porque chegaria em uma velocidade negativa!");
        }
        this.velocidade -= valor;

    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
