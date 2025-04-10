package Aula06Lab;

public class Politico {
    protected String nome, partido, estado, funcao;

    public Politico(String nome, String partido, String estado, String funcao){
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public void apresentacao(){
        System.out.printf("%s %s %s %s", nome, partido, estado, funcao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
