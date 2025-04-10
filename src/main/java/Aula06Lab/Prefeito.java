package Aula06Lab;

public class Prefeito extends Politico{
    private String municipio;


    public Prefeito(String nome, String partido, String estado, String funcao, String municipio) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }
}
