package Aula03Teorica;

public class test {

    public static void maini(String[] args){
        FuncionarioAprimorado funcionarioAprimorado = new FuncionarioAprimorado(
                "Kaio", "santos", 101.1, 100, "Masculino", 1);

        String nome = funcionarioAprimorado.getNome();

        String novoNome = "Pedro";
        funcionarioAprimorado.setNome(novoNome);
    }
}
