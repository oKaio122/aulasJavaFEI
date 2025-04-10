package Aula03Teorica;

public class FuncionarioAprimorado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private int idade;
    private String sexo;
    private int numero;

    public FuncionarioAprimorado(){

    }

    public FuncionarioAprimorado(String nome, String sobrenome, double salarioMensal, int idade, String sexo, int numero){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.idade = idade;
        this.sexo = sexo;
        this.numero = numero;
    }

    public String getNome() { return this.nome; }
    public String getSobrenome() { return this.sobrenome; }
    public double getSalarioMensal() { return this.salarioMensal; }
    public int getIdade() { return this.idade; }
    public String getSexo() { return this.sexo; }
    public int getNumero() { return this.numero; }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    public void setIdade(int idade) {
        if(idade < 0){
            this.idade = 0;
        }
        else{
            this.idade = idade;
        }
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
