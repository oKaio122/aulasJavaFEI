package Aula02;

import java.util.Scanner;

public class ExerciciosAula02 {
    public Scanner sc = new Scanner(System.in);

    public void paresEntre0E100(){

        for(int i = 0; i < 101; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public void umPorUmAte502Por2Ate100(){
        for(int i = 0; i < 101; i++){
            if( i > 50){ i++; }
            System.out.println(i);
        }
    }

    public void somaDe1DivididoPorN(){
        System.out.println("Insira o N: ");
        int n = sc.nextInt();

        double soma = 0;
        for(int i = 1; i < n+1; i++){
            soma += (double) 1/i;
        }
        System.out.println("Soma: " + soma);
    }

    public void conjuntoNotasAlunos(){
        int numAprovados = 0;
        double soma = 0;
        for(int i = 0; i < 80; i++){
            double nota = sc.nextDouble();
            if(nota >= 6.0) { numAprovados++; }
            soma += nota;
        }
        System.out.println("Qnt aprovados: " + numAprovados);
        System.out.println("Média: " + soma/80);
    }


    public void pesquisaHabitantes(){
        int somaIdade = 0;
        int contador = 0;
        double somaSalario = 0;
        int homem = 0;
        int mulheresComSalarioAbaixoDe600 = 0;

        while(true){

            System.out.println("Insira a idade: ");
            int idade = sc.nextInt();
            if(idade < 0) {
                if (contador == 0) { contador = 1; }
                break;
            }
            somaIdade += idade;

            System.out.println("Insira seu sexo: ");
            String sexo = sc.next();
            if (sexo.equals("M")) { homem++; }

            System.out.println("Insira o salario: ");
            double salario = sc.nextDouble();
            somaSalario += salario;
            if(sexo.equals("F") && salario < 600) { mulheresComSalarioAbaixoDe600++; }
            contador++;
        }
        System.out.println("Média da idade: " + somaIdade/contador);
        System.out.println("Média dos salários dos homens: " + somaSalario/homem);
        System.out.println("Qnt de mulheres com salário abaixo de R$ 600: " + mulheresComSalarioAbaixoDe600);
    }
}
