package Conexao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement pstm;
    public static void main(String[] args){
        try {
            Connection con;
            Statement st;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecamero", "root", "");
            st = con.createStatement();
            //st.executeUpdate("INSERT INTO user('"+txtlogin+"', '"+txtsenha+"', '"+txtconf_senha+"', '"+txtnome_completo+"', '"+txtcpf+"', '"+txtcelular+"', '"+txtcidade+"', '"+txtuf+"', '"+txtnum+"', '"+txtendereco+"', '"+txtemail+"' );
            //JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
    }catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Erro na conexao ");
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro na conexao com banco de dados");
    }
}
    //criei esse método de conexao pois o único outro que eu conseguia chamar estava em UserDAO
    //e a de cima está como "main" o que torna impossível de chamar em outra classe
    //pra não confundir separei uma conexao universal na classe Conexao
    //conectaBD pode ser usado pra qualquer conexao com o banco
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/bibliotecamero?user=root&pass=";
            conn = DriverManager.getConnection(url);
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "conectaBD na classe Conexao: " + erro.getMessage());
        }
        return conn;
    }
    //criei esse metodoaqui pra testar uma conexao direto na pagina inicial
    //para a lista que vai surgir quando o usuario digitar algo no txtField
    public void executaSQL(String sql) {
        try {
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = pstm.executeQuery();
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Nao foi possível executar o comando sql"
                    + "" + sqlex + "O comando passado foi" + sql);
        }
    }
}
