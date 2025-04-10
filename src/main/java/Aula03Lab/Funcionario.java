package Aula03Lab;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public double getSalarioAnual(){
        return salarioMensal * 12;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalarioMensal(double salarioMensal){
        if (salarioMensal < 0){
            salarioMensal = 0;
        }
        this.salarioMensal = salarioMensal;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
}
