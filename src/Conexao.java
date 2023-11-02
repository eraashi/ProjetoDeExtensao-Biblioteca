import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexao {
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
}
