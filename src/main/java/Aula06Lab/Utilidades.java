package Aula06Lab;

import java.util.Scanner;

public class Utilidades {

    public static Data gerarData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o dia:");
        int dia = scanner.nextInt();

        System.out.println("Insira o mes:");
        int mes = scanner.nextInt();

        System.out.println("Insira o ano:");
        int ano = scanner.nextInt();

        return new Data(dia, mes, ano);
    }
}
