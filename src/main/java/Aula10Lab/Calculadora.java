package Aula10Lab;

public class Calculadora {
    public static final String SOMA = "s";
    public static final String MULTIPLICACACO = "m";
    public static final String DIVISAO = "d";
    public int calcularDoisNumerosUsandoOperacao(int a, int b, String op){
        return switch (op) {
            case SOMA -> a +b;
            case MULTIPLICACACO -> a * b;
            case DIVISAO     -> a / b;
            default -> throw new IllegalStateException("Operação inesperada: " + op);
        };
    }
}
