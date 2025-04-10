package Aula05Lab;

public class Pessoa {
    private String nome;
    private String telefone;
    private int pessoaId;
    public static int qntPessoas;

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.pessoaId = qntPessoas;
        qntPessoas++;
    }

    public static int getQntPessoas() {
        return qntPessoas;
    }

    public static void setQntPessoas(int qntPessoas) {
        Pessoa.qntPessoas = qntPessoas;
    }

    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        String text = "\n[-----" + this.nome + "----]\n" +
                "Telefone: " + this.telefone + "\n" +
                "ID: " + this.pessoaId + "\n" +
                "[----";
        for (int i = 0; i < this.nome.length(); i++){
            text += "-";
        }
        text += "----]\n";
        return text;
    }
}
