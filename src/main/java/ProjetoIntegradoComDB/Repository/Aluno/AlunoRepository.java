package ProjetoIntegradoComDB.Repository.Aluno;

import ProjetoIntegradoComDB.Model.Aluno;

import java.sql.*;

public class AlunoRepository {
    private Connection connection;

    public AlunoRepository(Connection connection) {
        this.connection = connection;
    }

    public ResultSet get(Aluno aluno) throws SQLException {
        String SQL = "SELECT * FROM aluno WHERE usuario = '"
            + aluno.getUsuario() + "AND senha ="
            + aluno.getSenha() + "'";
        PreparedStatement query = connection.prepareStatement(SQL);
        query.execute();
        return query.getResultSet();
    }

    public void inserir(Aluno aluno) throws SQLException {
        String SQL = "INSERT INTO aluno (usuario, nome, senha) VALUES ( '" +
                aluno.getUsuario() + "','" +
                aluno.getNome() + "','" +
                aluno.getSenha() + "')";
        PreparedStatement action = connection.prepareStatement(SQL);
        action.execute();
    }
}
