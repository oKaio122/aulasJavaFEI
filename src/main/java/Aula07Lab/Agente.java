package Aula07Lab;

public abstract class Agente {

    protected String nome;
    protected String profissao;
    protected boolean modo_agente;

    public Agente(String nome, String profissao){
        this.nome = nome;
        this.profissao = profissao;
        this.modo_agente = false;
    }

    public abstract void apresentacao();

    public void modo_agente_on(){
        this.modo_agente = true;
    }

    public boolean isModo_agente() {
        return modo_agente;
    }

    public void setModo_agente(boolean modo_agente) {
        this.modo_agente = modo_agente;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
