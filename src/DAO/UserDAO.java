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
            pst.setInt(1, user.getId());
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
    
    public ResultSet resgatarDadosUsuario(String login, String senha) {
        String sql = "SELECT * FROM user WHERE login = ? AND senha = ? ";
        conn = new Conexao().conectaBD();
        
        try {
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, login);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            
            UserDTO objUserDTO = new UserDTO();
            
            while (rs.next()) {
                
                objUserDTO.setId(rs.getInt("id"));
                objUserDTO.setLogin(rs.getString("login"));
                objUserDTO.setSenha(rs.getString("senha"));
                objUserDTO.setConfirmar_senha(rs.getString("confirmar_senha"));
                objUserDTO.setNome_completo(rs.getString("nome_completo"));
                objUserDTO.setCpf(rs.getString("cpf"));
                objUserDTO.setCelular(rs.getString("celular"));
                objUserDTO.setCidade(rs.getString("cidade"));
                objUserDTO.setUf(rs.getString("uf"));
                objUserDTO.setNum(rs.getString("num"));
                objUserDTO.setEndereço(rs.getString("endereco"));
                objUserDTO.setEmail(rs.getString("email"));
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "resgatarDadosUsuario em UserDAO: " + erro);
            return null;
        }
        return rs;
    }
    
    public ResultSet autenticacaoParaAlt(String id){
        conn = new Conexao().conectaBD();
        
        try{
            String sql = "SELECT * FROM user WHERE id = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "autenticacaoUsuario em UserDAO: " + erro);
            return null;
        }
    }
    
    //criei esse método simplificado de autenticacao
    //para organizar melhor a tela de login caso seja necessário
    public ResultSet autenticacaoUsuario(String login, String senha){
        conn = new Conexao().conectaBD();
        
        try{
            String sql = "SELECT * FROM user WHERE login = ? AND senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "autenticacaoUsuario em UserDAO: " + erro);
            return null;
        }
    }
    
    public void alterarUsuarioLogado(UserDTO objUserDTOFinal) {
        String sql = "UPDATE user SET login = ?, senha = ?, confirmar_senha = ?, nome_completo = ?, cpf = ?, celular = ?, cidade = ?, uf = ?, num = ?, endereco = ?, email = ? where id = ?";
        conn = new Conexao().conectaBD();

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, objUserDTOFinal.getLogin());
            pst.setString(2, objUserDTOFinal.getSenha());
            pst.setString(3, objUserDTOFinal.getConfirmar_senha());
            pst.setString(4, objUserDTOFinal.getNome_completo());
            pst.setString(5, objUserDTOFinal.getCpf());
            pst.setString(6, objUserDTOFinal.getCelular());
            pst.setString(7, objUserDTOFinal.getCidade());
            pst.setString(8, objUserDTOFinal.getUf());
            pst.setString(9, objUserDTOFinal.getNum());
            pst.setString(10, objUserDTOFinal.getEndereço());
            pst.setString(11, objUserDTOFinal.getEmail());
            pst.setInt(12, objUserDTOFinal.getId());
            
            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarUsuarioLivro em LivroDAO: " + erro);
        }
    }

}
