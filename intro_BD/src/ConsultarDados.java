import java.sql.*;

public class ConsultarDados {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/empresa",
                "root",
                "Senha@123");

        PreparedStatement stmt = con.prepareStatement(
                "select id,nome,cargo from funcionarios "
        + "where cargo = ?");
        stmt.setString(1, "Gerente");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString(2);
            String cargo = rs.getString("cargo");
            System.out.println("id: "+id);
            System.out.println("nome: "+nome);
            System.out.println("cargo: "+cargo);
            System.out.println("==================");
        }
        stmt.close();
        con.close();
    }
}
