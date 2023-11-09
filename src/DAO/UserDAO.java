package DAO;

import Conexao.Conexao;
import DTO.UserDTO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class UserDAO {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    UserDTO objUserDTO = new UserDTO();

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecamero", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public int salvar(UserDTO user) {
        int status;
        try {
            pst = conn.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, user.getId());
            pst.setString(2, user.getLogin());
            pst.setString(3, user.getSenha());
            pst.setString(4, user.getConfirmar_senha());
            pst.setString(5, user.getNome_completo());
            pst.setString(6, user.getCpf());
            pst.setString(7, user.getCelular());
            pst.setString(8, user.getCidade());
            pst.setString(9, user.getUf());
            pst.setString(10, user.getNum());
            pst.setString(11, user.getEndereço());
            pst.setString(12, user.getEmail());
            status = pst.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }
    
    public ResultSet resgatarDadosUsuario() {
        conn = new Conexao().conectaBD();
        String sql = "SELECT * FROM user WHERE login = ?";
        
        try {
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, objUserDTO.getLogin());
            
            return pst.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "resgatarDadosUsuario em UserDAO: " + erro);
            return null;
        }
    }
    
    //criei esse método simplificado de autenticacao
    //para organizar melhor a tela de login caso seja necessário
    public ResultSet autenticacaoUsuario(UserDTO objUserDTO){
        conn = new Conexao().conectaBD();
        
        try{
            String sql = "SELECT * FROM user WHERE login = ? AND senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUserDTO.getLogin());
            pstm.setString(2, objUserDTO.getSenha());
            
            rs = pstm.executeQuery();
            return rs;
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "autenticacaoUsuario em UserDAO: " + erro);
            return null;
        }
    }
    
    public void alterarUsuarioLogado(UserDTO objUserDTO) {
        String sql = "update user set login = ?, senha = ?, confirmar_senha = ?, nome_completo = ?, cpf = ?, celular = ?, cidade = ?, uf = ?, num = ?, endereco = ?, email = ? where login = ?";
        conn = new Conexao().conectaBD();

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, objUserDTO.getLogin());
            pst.setString(2, objUserDTO.getSenha());
            pst.setString(3, objUserDTO.getConfirmar_senha());
            pst.setString(4, objUserDTO.getNome_completo());
            pst.setString(5, objUserDTO.getCpf());
            pst.setString(6, objUserDTO.getCelular());
            pst.setString(7, objUserDTO.getCidade());
            pst.setString(8, objUserDTO.getUf());
            pst.setString(9, objUserDTO.getNum());
            pst.setString(10, objUserDTO.getEndereço());
            pst.setString(11, objUserDTO.getEmail());
            pst.setString(12, objUserDTO.getLogin());
            //talvez precise verificar pelo id do usuario, ao inves do login, ou talvez não
            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarUsuarioLivro em LivroDAO: " + erro);
        }
    }
    
}
