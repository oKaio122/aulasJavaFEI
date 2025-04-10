package Aula07Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {

    public static Agente criarAgente(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor utilize nomes únicos!\nInsira o nome do agente:");
        String nomeAgente = sc.next();
        System.out.println("Insira a profissao do agente:");
        String profissaoAgente = sc.next();

        Agente agente;

        switch (profissaoAgente.toLowerCase()){
            case "advogado":
                System.out.println("Insira a OAB do advogado:");
                String OAB = sc.next();
                agente = new Advogado(nomeAgente, profissaoAgente, OAB);
                break;
            case "empresario":
                System.out.println("Insira a empresa do empresario:");
                String empresa = sc.next();
                agente = new Empresario(nomeAgente, profissaoAgente, empresa);
                break;
            case "professor":
                System.out.println("Insira a escola do professor:");
                String escola = sc.next();
                agente = new Professor(nomeAgente, profissaoAgente, escola);
                break;
            default:
                System.out.println("Profissao para agente não encontrado!");
                throw new RuntimeException("Erro geral na matrix ocorreu!");
        }

        return agente;
    }

    public static Agente getAgentePorNome(String nome, ArrayList<Agente> agentes){
        for (Agente agente: agentes){
            if(agente.getNome().toLowerCase().equals(nome)){
                return agente;
            }
        }
        System.out.println("Agente não encontrado!!");
        return null;
    }
}
