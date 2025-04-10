package Aula07Lab;

import java.awt.font.TextHitInfo;

public class Advogado extends Agente{
    String OAB;

    public Advogado(String nome, String profissao, String OAB){
        super(nome, profissao);
        this.OAB = OAB;
    }

    public void apresentacao(){
        if(modo_agente){
            System.out.println("AGENTE SMITH");
            return;
        }
        System.out.printf("""
                        Oi meu nome é %s
                        Minha profissão é %s
                        Minha OAB é: %s
                        Se sou um agente? óbvio que não
                        """, nome, profissao, OAB
        );
    }
}
