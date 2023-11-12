import DTO.UserDTO;
import DAO.UserDAO;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author icaro
 */
public class TelaDeLogin extends javax.swing.JFrame {
    UserDTO objUserDTO = new UserDTO();
    
    public TelaDeLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        botao_entra = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        senhalogin = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto/Tela de Login");
        setBackground(new java.awt.Color(255, 252, 101));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(946, 596));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Que bom que está de volta.");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 100, 230, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 240, 70, 40);

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario);
        usuario.setBounds(640, 190, 250, 30);

        botao_entra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botao_entra.setForeground(new java.awt.Color(51, 204, 0));
        botao_entra.setText("Entrar");
        botao_entra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_entraActionPerformed(evt);
            }
        });
        getContentPane().add(botao_entra);
        botao_entra.setBounds(680, 400, 170, 42);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Registrar-se");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 450, 170, 44);
        getContentPane().add(senhalogin);
        senhalogin.setBounds(640, 280, 250, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/Prancheta 4logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 0, 590, 560);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/Prancheta 5aviso.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(650, 330, 230, 40);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel4.setText("Usuário");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 150, 90, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel6.setText("Olá Colaborador!");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(630, 70, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void botao_entraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_entraActionPerformed
        LogarUsuario();
        
    }//GEN-LAST:event_botao_entraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Registro cadastro = new Registro ();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }
    
    private void LogarUsuario(){
        try {
            String usuario_login, senha_usuario;
            usuario_login = usuario.getText();
            senha_usuario = senhalogin.getText();
           
            //objUserDTO.setLogin(usuario_login);
            //objUserDTO.setSenha(senha_usuario);
            UserDAO OBJuserdao = new UserDAO();
            ResultSet rsuserdao = OBJuserdao.autenticacaoUsuario(usuario_login, senha_usuario);
            
            if (rsuserdao.next()){
                
                objUserDTO.setId(rsuserdao.getInt("id"));
                objUserDTO.setLogin(rsuserdao.getString(2));
                objUserDTO.setSenha(rsuserdao.getString(3));
                objUserDTO.setConfirmar_senha(rsuserdao.getString(4));
                objUserDTO.setNome_completo(rsuserdao.getString(5));
                objUserDTO.setCpf(rsuserdao.getString(6));
                
                //OBJuserdao.resgatarDadosUsuario(usuario_login, senha_usuario);
                System.out.print("Teste de recepção em LogarUsuario, após autenticacaoUsuario:");
                System.out.print("Id: " + objUserDTO.getId());
                System.out.print("Login: " + objUserDTO.getLogin());
                System.out.print("Senha: " + objUserDTO.getSenha());
                System.out.print("Confirmar Senha: " + objUserDTO.getConfirmar_senha());
                System.out.print("Nome Completo: " + objUserDTO.getNome_completo());
                System.out.print("CPF: " + objUserDTO.getCpf());
                
                
                //JOptionPane.showMessageDialog(null, "Logado com Sucesso!");
                
                PaginaInicial formulario = new PaginaInicial();
                formulario.setUserDTO(objUserDTO);
                formulario.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_entra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField senhalogin;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}

