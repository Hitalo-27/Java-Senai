package conexao;

public class Teste {
    public static void main(String[] args) {
        BD bd = new BD();

        bd.getConnection();
        //bd.close();
    }
}
