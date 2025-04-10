package Aula10Lab;


public class ContaCorrente {
    // saldo -> saldoAtual
    private double saldoAtual;

    public ContaCorrente(){
        this.saldoAtual = 0;
    }

    /**
     *
     * @param saldoInicial
     */
    public ContaCorrente(double saldoInicial){
        this.saldoAtual = saldoInicial;
    }

    // sacar --> sacarQuantidade
    public void sacarQuantidade(double amount){
        if (this.saldoAtual < amount){
            System.out.println("Você não pode sacar mais do que você tem de saldo!");
            return;
        }
        this.saldoAtual -= amount;
    }

    // depositar --> depositarQuantidade
    public void depositarQuantidade(double amount){
        if (amount <= 0){
            System.out.println("Você deve depositar um valor maior que 0!");
        }
        this.saldoAtual += amount;
    }

    /**
     *
     * @return
     */
    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String toString(){
        return "Saldo " + this.saldoAtual;
    }

}
