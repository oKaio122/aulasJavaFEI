package Aula06Lab;

public class Vereador extends Politico{
    private String municipio;

    public Vereador(String nome, String partido, String estado, String funcao, String municipio) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    public void apresentacao() {
        super.apresentacao();
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
