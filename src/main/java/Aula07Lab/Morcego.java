package Aula07Lab;

public class Morcego extends Animal implements IWalkable, IFlyable{

    public Morcego(String nome){
        super(nome);
    }

    public void voar(){
        System.out.println("voei");
    }

    public void andar(){
        System.out.println("andei");
    }
}
