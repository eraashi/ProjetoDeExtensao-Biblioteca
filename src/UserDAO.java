import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;





public class UserDAO {
    public void adicionar(User obj)throws Exception{
        String  sql = "INSERT INTO user(login, senha, confirmar_senha, nome_completo, cpf, celular, cidade, uf, num, endereço, email)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = Conexao.getConnection();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, obj.getLogin());
            pstm.setString(2, obj.getSenha()) ;
            pstm.setString(3, obj.getConfirmar_senha());
            pstm.setString(4, obj.getNome_completo());
            pstm.setString(5, obj.getCpf());
            pstm.setString(6, obj.getCelular());
            pstm.setString(7, obj.getCidade());
            pstm.setString(8, obj.getUf());
            pstm.setString(9, obj.getNum());
            pstm.setString(10, obj.getEndereço());
            pstm.setString(11, obj.getEmail());
            pstm.execute();
        }catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, "Erro ao salvar dados "+ e.toString());
            //System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());
        }finally {
            try {
                if(pstm!=null) {
                    JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!!!");
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }catch (Exception e) {
                System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());
            }
        }
    }
}
        
            

