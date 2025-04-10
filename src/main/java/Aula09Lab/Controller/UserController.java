package Aula09Lab.Controller;

import Aula09Lab.Model.User;
import Aula09Lab.View.MenuUsuario;

import java.util.ArrayList;

public class UserController {
    private ArrayList<User> users = new ArrayList<>();
    private MenuUsuario menuUsuario;

    public UserController(MenuUsuario menuUsuario){
        this.menuUsuario = menuUsuario;
    }

    public void cadastraUser(){
        String cpf = menuUsuario.getTextFieldCPF().getText();
        if(checkCpfExistente(cpf)) return;
        String nome = menuUsuario.getTextFieldNome().getText();
        String sobrenome = menuUsuario.getTextFieldSobrenome().getText();
        int idade = Integer.parseInt(menuUsuario.getTextFieldIdade().getText());
        User user = new User(nome, sobrenome, cpf, idade, getSexo());
        users.add(user);
    }

    public void exibirUserPorCPF(){
        String cpf = menuUsuario.getTextFieldCPF().getText();
        User usuarioBuscado = procuraUser(cpf);
        if (usuarioBuscado == null){
            return;
        }
        mostrarUser(usuarioBuscado);
    }

    public User procuraUser(String CPF){
        for(User user : users){
            if (user.getCpf().equals(CPF)){
                return user;
            }
        }
        System.out.println("Usuário com CPF " + CPF + " não encontrado!");
        return null;
    }

    public void mostrarUser(User user){
        String sexo = user.isSexo() ? "Masculino" : "Feminino";
        String userInfo = "CPF: " + user.getCpf() + "\n" +
                "Nome: " + user.getNome() + "\n" +
                "Sobrenome: " + user.getSobrenome() + "\n" +
                "Idade: " + user.getIdade() + "\n" +
                "Sexo: " + sexo  + "\n";

        menuUsuario.getTextAreaUsuarioInfo().setText(userInfo);
    }

    private boolean getSexo(){
        if(menuUsuario.getRadioFeminino().isSelected()){
            return false;
        }
        else{
            return true;
        }
    }

    private boolean checkCpfExistente(String cpf){
        for(User user : users){
            if (user.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }

    public void changeSelectedSexo(boolean sexo){
        if(sexo){
            menuUsuario.getRadioFeminino().setSelected(false);
            menuUsuario.getRadioMasculino().setSelected(true);
        }
        else{
            menuUsuario.getRadioFeminino().setSelected(true);
            menuUsuario.getRadioMasculino().setSelected(false);
        }
    }
}
