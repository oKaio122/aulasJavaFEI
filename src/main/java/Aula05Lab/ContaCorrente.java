package Aula05Lab;


public class ContaCorrente {
    private double saldo;

    public ContaCorrente(){
        this.saldo = 0;
    }

    /**
     *
     * @param saldoInicial
     */
    public ContaCorrente(double saldoInicial){
        this.saldo = saldoInicial;
    }

    /**
     *@param amount */
    public void sacar(double amount){
        if (this.saldo < amount){
            System.out.println("Você não pode sacar mais do que você tem de saldo!");
            return;
        }
        this.saldo -= amount;
    }

    /**
     *
     * @param amount
     */
    public void depositar(double amount){
        if (amount <= 0){
            System.out.println("Você deve depositar um valor maior que 0!");
        }
        this.saldo += amount;
    }

    /**
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "Saldo " + this.saldo;
    }

}
