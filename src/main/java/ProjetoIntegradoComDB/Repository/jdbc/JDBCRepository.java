package ProjetoIntegradoComDB.Repository.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCRepository {
    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection(
                "jdbc:postgres://neondb_owner:npg_lmvHqN2dWGy8@ep-orange-heart-acinu1pa-pooler.sa-east-1.aws.neon.tech/neondb?sslmode=require",
                "neondb_owner", "npg_lmvHqN2dWGy8"
        );
        return conexao;
    }
}
