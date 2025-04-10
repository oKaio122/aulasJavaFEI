import Aula08Lab.*;
import Aula09Lab.View.MenuUsuario;

import javax.swing.*;
import java.util.Scanner;

import static Aula08Lab.Utilidades.createUser;

public class ExecutarExercicios {

    public static void main(String[] args){
        // Olá professor, para rodar os exercícios basta executar as funções executar(exercicio)!
        // Os métodos static utilizados estão na classe Utilidades na package Aula08Lab!!

        exercicio01();
    }

    private static void exercicio01(){
        SwingUtilities.invokeLater(() -> new MenuUsuario().setVisible(true));
    }
}
