package Aula05Lab;

public class Cliente {
    private String nome;
    private int numeroConta;
    private ContaCorrente contaCorrente;
    public static int numClientes;

    public Cliente(String nome, int numeroConta, double saldoContaCorrente){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.contaCorrente = new ContaCorrente(saldoContaCorrente);
        numClientes++;
    }

    public Cliente(String nome, int numeroConta, ContaCorrente contaCorrente){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.contaCorrente = contaCorrente;
    }

    public String toString() {
        return "Nome: " + nome + '\n' +
                ",NumeroConta: " + numeroConta + '\n' +
                "ContaCorrente: " + contaCorrente ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
