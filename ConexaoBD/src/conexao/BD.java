package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
    public Connection connection = null;
    private final String DRIVE = "com.mysql.jdbc.Drive";
    private final String DBNAME = "senai";
    private final String URL = "jdbc:mysql://localhost:3306/"+DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "senai126";

    public boolean getConnection(){
        try {
            Class.forName(DRIVE);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conectou");
            return true;
        } catch (ClassNotFoundException erro){
            System.out.println("Driver não encontrado "+erro.toString());
            return false;
        } catch (SQLException erro){
            System.out.println("Falha ao conectar "+ erro.toString());
            return false;
        }
    }

    public void close() {
        try {
            connection.close();
            System.out.println("Desconectou");
        } catch (SQLException erro) {

        }
    }
}
