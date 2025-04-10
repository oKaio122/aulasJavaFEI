package Aula03Lab;

public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    public String getCpf() {
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public void setCpf(String newCpf){
        this.cpf = newCpf;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }
    public void setIdade(int newIdade){
        if (newIdade < 0){
            newIdade = 0;
        }
        this.idade = newIdade;
    }

}
