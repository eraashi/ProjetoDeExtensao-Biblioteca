
import DTO.LivroDTO;
import DAO.LivroDAO;
import Ferramentas.LimitaCaracteres;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.LabelView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author icaro
 */
public class PagMovimento extends javax.swing.JFrame {

    /**
     * Creates new form PagDenuncia
     */
    private LivroDTO objLivroDTONovo;
    
    public PagMovimento() {
        initComponents();
        setLocationRelativeTo(null);

        idLivro.setVisible(false);

        txtNome.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        txtCelular.setDocument(new LimitaCaracteres(11, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
        txtDatausuario.setDocument(new LimitaCaracteres(10, LimitaCaracteres.TipoEntrada.DATA));
        txtHorausuario.setDocument(new LimitaCaracteres(5, LimitaCaracteres.TipoEntrada.HORA));
        txtCPF.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDatausuario = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHorausuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        boxReservado = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTituloLivro = new javax.swing.JLabel();
        txtAutorLivro = new javax.swing.JLabel();
        txtISBN = new javax.swing.JLabel();
        txtDataLivro = new javax.swing.JLabel();
        txtEditoraLivro = new javax.swing.JLabel();
        txtLocaLivro = new javax.swing.JLabel();
        idLivro = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nova Movimentação");
        setMinimumSize(new java.awt.Dimension(600, 515));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

        jLabel3.setText("Nome:");

        jLabel6.setText("Celular:");

        jLabel8.setText("Data:");

        txtDatausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatausuarioActionPerformed(evt);
            }
        });
        txtDatausuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                limNum(evt);
            }
        });

        jLabel10.setText("CPF:");

        txtHorausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorausuarioActionPerformed(evt);
            }
        });
        txtHorausuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                limNumH(evt);
            }
        });

        jLabel11.setText("Hora:");

        boxReservado.setText("Reservado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatausuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHorausuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(boxReservado))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxReservado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDatausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtHorausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 260, 470, 110);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(150, 400, 72, 23);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(360, 400, 72, 23);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Livro"));

        jLabel4.setText("Título:");

        jLabel12.setText("ISBN:");

        jLabel13.setText("Autor:");

        jLabel14.setText("Editora:");

        jLabel15.setText("Local:");

        jLabel16.setText("Data:");

        txtTituloLivro.setText("Titulo do Livro");
        txtTituloLivro.setToolTipText("");

        txtAutorLivro.setText("Autor do Livro");

        txtISBN.setText("ISBN do Livro");

        txtDataLivro.setText("Data da publicação");

        txtEditoraLivro.setText("Editora do Livro");

        txtLocaLivro.setText("Local de Publicação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtISBN))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAutorLivro)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditoraLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataLivro)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocaLivro)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(idLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTituloLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAutorLivro)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtEditoraLivro)
                    .addComponent(txtLocaLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtISBN)
                        .addComponent(jLabel16)
                        .addComponent(txtDataLivro)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 100, 470, 100);

        txtNomeLivro.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        txtNomeLivro.setForeground(new java.awt.Color(255, 153, 51));
        txtNomeLivro.setText("Nome do Livro");
        getContentPane().add(txtNomeLivro);
        txtNomeLivro.setBounds(110, 30, 410, 48);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/icone movimento.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(30, 30, 80, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 230, 540, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        alterarEditaveisLivro();
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void limNum(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limNum
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_limNum

    private void txtDatausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatausuarioActionPerformed

    private void limNumH(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limNumH
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_limNumH

    private void txtHorausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorausuarioActionPerformed

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
            java.util.logging.Logger.getLogger(PagMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagMovimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxReservado;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel idLivro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtAutorLivro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JLabel txtDataLivro;
    private javax.swing.JTextField txtDatausuario;
    private javax.swing.JLabel txtEditoraLivro;
    private javax.swing.JTextField txtHorausuario;
    private javax.swing.JLabel txtISBN;
    private javax.swing.JLabel txtLocaLivro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtNomeLivro;
    private javax.swing.JLabel txtTituloLivro;
    // End of variables declaration//GEN-END:variables

    public void setobjLivroDTO(LivroDTO objLivroDTO){
        this.objLivroDTONovo = objLivroDTO;
        try {
            String tituloLivro, autor, editora, local, nomeCliente, id, isbn, data, cpfCliente, dataCliente, horaCliente, celularCliente;
            boolean reservadoCliente;
                        
            //pegando o não aditável
            tituloLivro = objLivroDTONovo.getTitulo();
            autor = objLivroDTONovo.getAutor();
            editora = objLivroDTONovo.getEditora();
            isbn = objLivroDTONovo.getIsbn();
            data = objLivroDTONovo.getData();
            local = objLivroDTONovo.getLocal();
            id = objLivroDTONovo.getId();
            //pegando o editável
            nomeCliente = objLivroDTONovo.getNome_cliente();
            cpfCliente = objLivroDTONovo.getCpf_cliente();
            dataCliente = objLivroDTONovo.getData_cliente();
            horaCliente = objLivroDTONovo.getHora_cliente();
            celularCliente = objLivroDTONovo.getCelular_cliente();
            reservadoCliente = objLivroDTONovo.isReservado();
            //setando o não editável
            txtTituloLivro.setText(tituloLivro);
            txtNomeLivro.setText(tituloLivro);
            txtAutorLivro.setText(autor);
            txtISBN.setText(isbn);
            txtEditoraLivro.setText(editora);
            txtLocaLivro.setText(local);
            txtDataLivro.setText(data);
            idLivro.setText(id);
            //setando o editável
            txtNome.setText(nomeCliente);
            txtCPF.setText(cpfCliente);
            txtDatausuario.setText(dataCliente);
            txtHorausuario.setText(horaCliente);
            txtCelular.setText(celularCliente);
            boxReservado.setSelected(reservadoCliente);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "setarobjLivroDTO em PagMovimento: " + erro);
        }
    }
    
    //método para pegar o que foi escrito no editavel
    //jogar no LivroDTO e depois usar o método "alterarUsuarioLivro"
    //para que ele atualize no banco de dados mysql
    private void alterarEditaveisLivro() {
        try {
            String nome_cliente, data_cliente, hora_cliente, cpf_cliente, celular_cliente, titulo;
            boolean reservado;
            //pegando o editável escrito
            nome_cliente = txtNome.getText();
            data_cliente = txtDatausuario.getText();
            hora_cliente = txtHorausuario.getText();
            cpf_cliente = txtCPF.getText();
            celular_cliente = txtCelular.getText();
            reservado = boxReservado.isSelected();
            //setando o editável escrito na DTO para o mysql
            objLivroDTONovo.setNome_cliente(nome_cliente);
            objLivroDTONovo.setData_cliente(data_cliente);
            objLivroDTONovo.setHora_cliente(hora_cliente);
            objLivroDTONovo.setCelular_cliente(celular_cliente);
            objLivroDTONovo.setCpf_cliente(cpf_cliente);
            objLivroDTONovo.setReservado(reservado);
            //ordenando o DTO ser salvo no mysql
            LivroDAO objLivroDAO = new LivroDAO();
            ResultSet rslivrodao = objLivroDAO.compararTituloLivro(txtTituloLivro.getText());
            
            if (rslivrodao.next()){
            
            LivroDAO objLivroDAOteste = new LivroDAO();
            objLivroDAOteste.alterarUsuarioLivro(objLivroDTONovo);
            this.dispose();
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "alterarEditaveisLivro em Pagmovimento; " + erro);
        }
    }

}
