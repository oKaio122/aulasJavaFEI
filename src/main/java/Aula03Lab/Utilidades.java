package Aula03Lab;

import java.util.Scanner;

public class Utilidades {
    // Utilidades Ex01
    public static void setPessoaAttributes(Pessoa p){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o cpf da pessoa: ");
        p.setCpf(sc.next());

        System.out.println("Insira o nome da pessoa: ");
        p.setNome(sc.next());

        System.out.println("Insira a idade da pessoa: ");
        p.setIdade(sc.nextInt());
    }

    public static void showPessoaAttributes(Pessoa p){
        System.out.printf("Nome: %s \nCPF: %s \nIdade: %d\n",
                p.getNome(), p.getCpf(), p.getIdade());
    }

    // Utilidades Ex02
    public static void setRetanguloAttributes(Retangulo r){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o lado1 do retangulo: ");
        r.setLado1(sc.nextInt());

        System.out.println("Insira o lado2 do retangulo: ");
        r.setLado2(sc.nextInt());

    }

    public static void showRetanguloAttributes(Retangulo r){
        System.out.printf("Lado1: %d \nLado2: %d\n",
                r.getLado1(), r.getLado2());
    }

    // Utilidades Ex04
    public static void setTelevisaoAttributes(Televisao tv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o modelo da TV: ");
        tv.setModelo(sc.next());

        System.out.println("Insira o preco da TV: ");
        tv.setPreco(sc.nextFloat());

        System.out.println("Insira o tamanho da TV: ");
        tv.setTamanho(sc.nextFloat());

        System.out.println("Insira o volume da TV: ");
        tv.setVolume(sc.nextInt());

        System.out.println("Insira o canal da TV: ");
        tv.setCanal(sc.nextInt());

        System.out.println("Insira se a tv está ligada: ");
        tv.setLigada(sc.nextBoolean());
    }

    public static void showTelevisaoAttributes(Televisao tv){
        System.out.printf("Modelo da TV: %s\nPreco: %f\nTamanho: %f\nVolume: %d\nCanal: %d\nLigada: %b\n",
                tv.getModelo(), tv.getPreco(), tv.getTamanho(), tv.getVolume(), tv.getCanal(), tv.getLigada());
    }

    // Utilidades Ex07
    public static void setPerfilDeSaudeAttributes(PerfilDeSaude pds){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Nome: ");
        pds.setNome(sc.next());
        System.out.println("Insira o Sobrenome: ");
        pds.setSobrenome(sc.next());
        System.out.println("Insira o seu Sexo: ");
        pds.setSexo(sc.next());
        System.out.println("Insira o seu Peso: ");
        pds.setPeso(sc.nextDouble());
        System.out.println("Insira a Altura: ");
        pds.setAltura(sc.nextDouble());
        System.out.println("Insira o Dia de Nascimento: ");
        pds.setDiaNasc(sc.nextInt());
        System.out.println("Insira o Mes de Nascimento: ");
        pds.setMesNasc(sc.nextInt());
        System.out.println("Insira o Ano de Nascimento: ");
        pds.setAnoNasc(sc.nextInt());
    }
}
