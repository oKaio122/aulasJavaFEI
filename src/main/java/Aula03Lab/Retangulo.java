package Aula03Lab;

public class Retangulo {
    private int lado1;
    private int lado2;

    public int area(){
        return lado1 * lado2;
    }

    public int perimetro(){
        return lado1 + lado2;
    }

    public int getLado1(){
        return this.lado1;
    }

    public int getLado2(){
        return this.lado2;
    }

    public void setLado1(int newLado1){
        if (newLado1 <= 0){
            newLado1 = 1;
        }
        this.lado1 = newLado1;
    }

    public void setLado2(int newLado2){
        if (newLado2 <= 0){
            newLado2 = 1;
        }
        this.lado2 = newLado2;
    }

}
