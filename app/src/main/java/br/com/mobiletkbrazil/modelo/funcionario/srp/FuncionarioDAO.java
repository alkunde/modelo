package br.com.mobiletkbrazil.modelo.funcionario.srp;

import android.util.Log;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.mobiletkbrazil.modelo.funcionario.Funcionario;

public class FuncionarioDAO {

    private static final String LOG_TAG = Funcionario.class.getSimpleName();

    public void salva(Funcionario funcionario) throws SQLException {
        ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
        connectionDAO.setDbms("mysql");
        connectionDAO.setServerName("localhost");
        connectionDAO.setPortNumber("8080");
        connectionDAO.setDbName("mock");

        try (Connection connection = connectionDAO.createConnection();
             Statement stmt = connection.createStatement();) {

            String sql = "insert into funcionario (id, nome, salario) values (" +
                    funcionario.getId() + "," + funcionario.getNome() + "," +
                    funcionario.getSalario() + ")";
            int rs = stmt.executeUpdate(sql);

            if (rs == 1) {
                Log.i(LOG_TAG, "Funcionário inserido com sucesso.");
            }
        } catch (SQLException e) {
            Log.e(LOG_TAG, "Nenhum funcionário inserido. " + e.getMessage());
        }
    }
}
