package Aula07Lab;

public class Professor extends Agente{
    String escola;

    public Professor(String nome, String profissao, String escola){
        super(nome, profissao);
        this.escola = escola;
    }

    public void apresentacao(){
        if(modo_agente){
            System.out.println("AGENTE SMITH");
            return;
        }
        System.out.printf("""
                        Oi meu nome é %s
                        Minha profissão é %s
                        Trabalho na escola: %s
                        Se sou um agente? óbvio que não
                        """, nome, profissao, escola
        );
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
