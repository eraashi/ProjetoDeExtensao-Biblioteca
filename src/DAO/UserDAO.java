package DAO;

import DTO.UserDTO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class UserDAO {
    Connection conn;
    PreparedStatement pst;
    public UserDAO() {
    }
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecamero", "root", "");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            return false;
        }
    }
    public int salvar(UserDTO user){
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
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
            
        }
    }
    
    
    
}
        
            

