package Aula03Lab;

public class Fatura {
    private String identifier;
    private String Descricao;
    private int quantidade;
    private double precoPorItem;

    public double getInvoiceAmount(){
        return this.quantidade * this.precoPorItem;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem < 0){
            precoPorItem = 0;
        }
        this.precoPorItem = precoPorItem;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            quantidade = 0;
        }
        this.quantidade = quantidade;
    }
}
