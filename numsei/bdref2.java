import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Alunos {
        private static final String URL = "jdbc:sqlite:C:\\Users\\rodrigo.rodrigues\\Downloads\\Solucoes_Java-main\\Solucoes_Java-main\\Solucao_Aula5\\banco.db";
        public Connection connection;

        public void connect() {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection(URL);
                connection.setAutoCommit(false);
                System.out.println("Conexão realizada! Banco de dados: " + URL);
            } catch (ClassNotFoundException e) {
                System.out.println("Driver JDBC do SQLite não encontrado: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Erro ao conectar: " + e.getMessage());
            }
        }

        public void createTable() {
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE IF EXISTS Professores (ID INTEGER PRIMARY KEY, Nome VARCHAR, Idade INTEGER)");
                connection.commit();
                System.out.println("Tabela criada ou já existe.");
            } catch (SQLException e) {
                System.out.println("Erro ao criar tabela: " + e.getMessage());
            }
        }

        public void insertClient(List<String[]> lista) {
        }

        public void close() {
    }
}

}
