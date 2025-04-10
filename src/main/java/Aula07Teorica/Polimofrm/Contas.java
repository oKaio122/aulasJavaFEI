package Aula07Teorica.Polimofrm;

import java.util.Scanner;

public class Contas {
    public static void mai7n(String args[]){
        OperacaoMatematica opm;
        Scanner sc = new Scanner(System.in);

        String operacao = sc.nextLine();

        switch (operacao.toLowerCase().strip()){
            case "soma":
                opm = new Soma();
                break;
            case "subtracao":
                opm = new Subtracao();
                break;
            case "multiplicacao":
                opm = new Multiplicacao();
                break;
            case "divisao":
                opm = new Divisao();
                break;
            default:
                System.out.println("Opcao nao encontrada, usando soma.");
                opm = new Soma();
        }
        System.out.println("Resultado: " + opm.calcular(5, 4));
    }
}
