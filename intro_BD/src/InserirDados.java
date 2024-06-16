import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirDados {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/empresa",
                "root",
                "Senha@123");
        PreparedStatement stmt = con.prepareStatement(
                "insert into funcionarios (id, nome, cargo) values(?,?,?)"
        );
        stmt.setLong(1, 1);
        stmt.setString(2, "Maria");
        stmt.setString(3, "Gerente");
        stmt.executeUpdate();

        stmt.setLong(1,2);
        stmt.setString(2, "Jean");
        stmt.setString(3, "Analista");
        stmt.executeUpdate();

        stmt.close();
        con.close();

        System.out.println("Dados inseridos com sucesso!");

    }
}
