package Aula03Lab;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private double altura;
    private double peso;

    public int getIdade(){
        LocalDate timeToday = LocalDate.now();
        LocalDate pessoaTime = LocalDate.of(anoNasc, mesNasc, diaNasc);

        Period periodo = Period.between(pessoaTime, timeToday);
        return periodo.getYears();
    }

    public double getIMC(){
        return peso / altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0){
            peso = 0;
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            altura = 0;
        }
        this.altura = altura;
    }

    public int getAnoNasc() {

        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        if (anoNasc < 0){
            anoNasc = 0;
        }
        this.anoNasc = anoNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        if (mesNasc < 0){
            mesNasc = 0;
        }
        this.mesNasc = mesNasc;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        if (diaNasc < 0){
            diaNasc = 0;
        }
        this.diaNasc = diaNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
