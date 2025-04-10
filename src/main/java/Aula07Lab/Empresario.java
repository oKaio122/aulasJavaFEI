package Aula07Lab;

public class Empresario extends Agente{
    String empresa;

    public Empresario(String nome, String profissao, String empresa){
        super(nome, profissao);
        this.empresa = empresa;
    }

    public void apresentacao(){
        if(modo_agente){
            System.out.println("AGENTE SMITH");
            return;
        }
        System.out.printf("""
                        Oi meu nome é %s
                        Minha profissão é %s
                        Minha empresa é: %s
                        Se sou um agente? óbvio que não
                        """, nome, profissao, empresa
        );
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
