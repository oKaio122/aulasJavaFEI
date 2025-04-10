package Aula08Lab;

import java.util.Scanner;

public class Utilidades {

    public static void createUser(Login login){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um nome de usuário:");
        String user = sc.next();
        System.out.println("Insira uma senha:");
        String senha = sc.next();
        login.setUsuario(user);
        login.setSenha(senha);
        System.out.println("Usuário criado com sucesso!");
    }

}
