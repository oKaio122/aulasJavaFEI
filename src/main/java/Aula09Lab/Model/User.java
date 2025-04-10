package Aula09Lab.Model;

public class User {
    private String nome, sobrenome, cpf;
    private int idade;
    private boolean sexo;

    public User(String nome, String sobrenome, String cpf, int idade, boolean sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
