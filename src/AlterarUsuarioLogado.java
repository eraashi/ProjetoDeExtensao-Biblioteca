
import DAO.UserDAO;
import DTO.UserDTO;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Random;

public class AlterarUsuarioLogado extends javax.swing.JFrame {
    //User user = new UserDTO();
    //UserDAO usuariodao = new UserDAO();

    public AlterarUsuarioLogado() {
        initComponents();
        resgatarDadosUsuarioLogado();
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

        botao_confirmar = new javax.swing.JButton();
        botao_voltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        txtconf_senha = new javax.swing.JPasswordField();
        txtsenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnome_completo = new javax.swing.JTextField();
        txtcpf = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtcidade = new javax.swing.JTextField();
        txtuf = new javax.swing.JTextField();
        txtendereço = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setMinimumSize(new java.awt.Dimension(960, 551));
        setResizable(false);
        getContentPane().setLayout(null);

        botao_confirmar.setBackground(new java.awt.Color(255, 153, 0));
        botao_confirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botao_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        botao_confirmar.setText("Confirmar");
        botao_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_confirmar);
        botao_confirmar.setBounds(360, 430, 143, 41);

        botao_voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_voltar);
        botao_voltar.setBounds(560, 430, 140, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("Confirmar Senha:");

        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });

        txtconf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconf_senhaActionPerformed(evt);
            }
        });

        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(txtconf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(txtlogin))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtconf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 110, 400, 90);

        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("Nome Completo:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("CPF/CNPJ:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("Celular:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("Cidade:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setText("UF:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setText("Endereço:");

        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel11.setText("E-mail:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setText("Nº:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnome_completo, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcelular))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtemail))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtendereço))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcpf))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtendereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(300, 230, 400, 162);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel6.setText("Altere seus Dados");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(430, 70, 200, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/elemento retangulo (1).png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(-130, 40, 880, 490);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/Img fundo tela de registro.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 960, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_confirmarActionPerformed
        alterarDadosUsuario();
        this.dispose();
        TelaDeLogin login = new TelaDeLogin();
        login.setVisible(true);
    }//GEN-LAST:event_botao_confirmarActionPerformed
    public void limparcampos() {
        txtlogin.setText("");
        txtsenha.setText("");
        txtconf_senha.setText("");
        txtnome_completo.setText("");
        txtcpf.setText("");
        txtcelular.setText("");
        txtcidade.setText("");
        txtuf.setText("");
        txtnum.setText("");
        txtendereço.setText("");
        txtemail.setText("");
        txtlogin.requestFocus();
    }

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        this.dispose();
        TelaDeLogin login = new TelaDeLogin();
        login.setVisible(true);
    }//GEN-LAST:event_botao_voltarActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed

    private void txtconf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconf_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconf_senhaActionPerformed

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_confirmar;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JPasswordField txtconf_senha;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereço;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnome_completo;
    private javax.swing.JTextField txtnum;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtuf;
    // End of variables declaration//GEN-END:variables
    
    private void resgatarDadosUsuarioLogado(){

        try {
            UserDTO objUserDTO = new UserDTO();
            String login, senha, confirmar_senha, nome_completo, cpf, celular, cidade, uf, endereco, email;
            
            UserDAO objUserDAO = new UserDAO();
            objUserDAO.resgatarDadosUsuario(objUserDTO);
            
            login = objUserDTO.getLogin();
            senha = objUserDTO.getSenha();
            confirmar_senha = objUserDTO.getConfirmar_senha();
            nome_completo = objUserDTO.getNome_completo();
            cpf = objUserDTO.getCpf();
            celular = objUserDTO.getCelular();
            cidade = objUserDTO.getCidade();
            uf = objUserDTO.getUf();
            endereco = objUserDTO.getEndereço();
            email = objUserDTO.getEmail();
            //setando o não editável
            txtlogin.setText(login);
            txtsenha.setText(senha);
            txtconf_senha.setText(confirmar_senha);
            txtnome_completo.setText(nome_completo);
            txtcpf.setText(cpf);
            txtcelular.setText(celular);
            txtcidade.setText(cidade);
            txtuf.setText(uf);
            txtendereço.setText(endereco);
            txtemail.setText(email);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "resgatarDadosUsuarioLogado em AlterarUsuarioLogado: " + erro);
        }
    
    }
    
    private void alterarDadosUsuario() {
        try {
            String login, senha, confirmar_senha, nome_completo, cpf, celular, cidade, uf, endereco, email;
            
            login = txtlogin.getText();
            senha = txtsenha.getText();
            confirmar_senha = txtconf_senha.getText();
            nome_completo = txtnome_completo.getText();
            cpf = txtcpf.getText();
            celular = txtcelular.getText();
            cidade = txtcidade.getText();
            uf = txtuf.getText();
            endereco = txtendereço.getText();
            email = txtemail.getText();
            
            UserDTO objUserDTO = new UserDTO();
            objUserDTO.setLogin(login);
            objUserDTO.setSenha(senha);
            objUserDTO.setConfirmar_senha(confirmar_senha);
            objUserDTO.setNome_completo(nome_completo);
            objUserDTO.setCpf(cpf);
            objUserDTO.setCelular(celular);
            objUserDTO.setCidade(cidade);
            objUserDTO.setUf(uf);
            objUserDTO.setEndereço(endereco);
            objUserDTO.setEmail(email);
            
            UserDAO objUserDAO = new UserDAO();
            objUserDAO.alterarUsuarioLogado(objUserDTO);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "alterarDadosUsuario em AlterarUsuarioLogado: " + erro);
        }
    }

}
