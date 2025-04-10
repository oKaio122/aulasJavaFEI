package Aula06Lab;

public class Pessoa {
    private String nome;
    private long cpf;
    private Data nascimento;

    public Pessoa(String nome, long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " CPF: " + cpf + " Data Nascimento: " + nascimento;
    }
}
