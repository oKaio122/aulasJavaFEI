package ProjetoIntegradoComDB.Controller;

import ProjetoIntegradoComDB.Model.Aluno;
import ProjetoIntegradoComDB.Repository.Aluno.AlunoRepository;
import ProjetoIntegradoComDB.Repository.jdbc.JDBCRepository;
import ProjetoIntegradoComDB.View.LoginFrame;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    private LoginFrame view;

    public LoginController(LoginFrame view) {
        this.view = view;
    }

    public void loginAluno(){
        Aluno aluno = new Aluno(null, view.getUsuario_text_area(), view.getSenha_text_area());
        try {
            Connection conexao = new JDBCRepository().getConnection();
            AlunoRepository dao = new AlunoRepository(conexao);
            ResultSet set = dao.get(aluno);
            if (set.next()) {
                JOptionPane.showMessageDialog(view, "Login efetuado!",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(view,
                        "Login NÃO efetuado!",
                        "Aviso",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view,
                    "Erro de conexão!",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }

    }
}
