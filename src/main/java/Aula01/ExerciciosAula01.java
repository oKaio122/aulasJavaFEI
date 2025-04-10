package Aula01;

import java.util.Scanner;

public class ExerciciosAula01 {
    public Scanner sc = new Scanner(System.in);

    public ExerciciosAula01(){

    }

    public void tresNumerosOrdenadosCrescente(){
        System.out.println("Insira o n1");
        int n1 = sc.nextInt();

        System.out.println("Insira o n2");
        int n2 = sc.nextInt();

        System.out.println("Insira o n3");
        int n3 = sc.nextInt();

        if(n1 <= n2 && n2 <= n3){ System.out.printf("%d %d %d", n1, n2, n3); }
        else if(n1 <= n3 && n3 <= n2){ System.out.printf("%d %d %d", n1, n3, n2); }
        else if(n2 <= n1 && n1 <= n3){ System.out.printf("%d %d %d", n2, n1, n3); }
        else if(n2 <= n3 && n3 <= n2){ System.out.printf("%d %d %d", n2, n3, n1); }
        else if(n3 <= n2 && n2 <= n3){ System.out.printf("%d %d %d", n3, n2, n3); }
        else{ System.out.printf("%d %d %d", n3, n1, n2); }

    }

    public void calcularSalario(){

        System.out.println("Insira a qnt de horas trabalhadas");
        int horas = sc.nextInt();

        System.out.println("Insira o valor por hora trabalhada");
        double valorPorHora = sc.nextDouble();

        System.out.println("Você recebe R$ " +  horas * valorPorHora);
    }

    public void checarMedia(){
        System.out.println("Qual sua média ?");
        double media = sc.nextDouble();

        if(media < 3){
            System.out.println("Você foi reprovado e não tem direito de fazer a DP a distância.");
        }
        else if(media > 7){
            System.out.println("Você foi aprovado! Parabéns!");
        }
        else {
            System.out.println("Você foi reprovado com direito de fazer a DP a distância.");
        }
    }

    public void somaDeNumeros(){
        int num = -1;
        int soma = 0;

        while(!(num == 0)){
            System.out.println("Insira um número: ");
            num = sc.nextInt();
            soma += num;
        }
    }
}
